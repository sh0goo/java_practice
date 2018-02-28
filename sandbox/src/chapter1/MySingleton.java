package chapter1;

public class MySingleton {

	public static void main(String[] args) {

		Foo f1 = Foo.getInstance();
		Foo f2 = Foo.getInstance();

		if (f1 == f2) {
			System.out.println("２つのオブジェクトは等しい。");
		}
	}
}

/**
 * シングルトンパターンを使用したサンプルクラス
 * @author sh0g0
 */
class Foo {

	// インスタンス変数
	// クラスがロード時に、一度だけインスタンス化され、変数に格納される。
	private static final Foo instance = new Foo();

	/**
	 * コンストラクタ抹殺
	 * デフォルトコンストラクタの発生を防ぐ
	 * 外部からの操作を防ぐため、privateなコンストラクタを作成
	 */
	private Foo() {

	}

	// ロード時にインスタンス化されたFooオブジェクトを返す
	public static Foo getInstance() {
		return instance;
	}
}
