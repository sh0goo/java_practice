package chapter1;

public class UseToString {

	public static void main(String[] args) {

		int[] ary = {1, 2};
		String obj1 = "John";
		OtherFoo obj2 = new OtherFoo();
		Bar obj3 = new Bar();

		// toStringメソッドの呼び出し
		System.out.println(ary);

		/**
		 * Stringクラスでは、toStringメソッドがオーバーライドされ、オブジェクトが保持する文字列を返す
		 */
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

class OtherFoo {
}

class Bar {

	@Override
	public String toString() {
		return "This is Bar Object";
	}
}
