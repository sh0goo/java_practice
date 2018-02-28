package chapter2;

public class UseInterface {

	public static void main(String[] args) {

		MyClassTest t = new MyClassTest();

		System.out.println(t.methodA(89));
		System.out.println(t.methodC(89, 99));

		// defaultメソッドの呼び出し（インスタンスメソッドの様に呼べる）
		t.methodB();

		// staticメソッドの呼び出し
		MyInterface2.methodD();

		// 下記の様な呼び出しはコンパイルエラー
		// MyInterface1.methodB();
		// t.methodD();
	}
}

class MyClassTest implements MyInterface1, MyInterface2{

	@Override
	public double methodC(int i, int j) {
		return i + j;
	}

	@Override
	public double methodA(int i) {
		return i * 0.01;
	}
}


interface MyInterface1{

	// 抽象メソッド→実装クラスでoverrideする必要あり
	double methodA(int i);

	/**
	 * defaultメソッド
	 */
	default void methodB() {
		System.out.println("methodB is called");
	};
}

interface MyInterface2{

	// 抽象メソッド→実装クラスでoverrideする必要あり
	double methodC(int i, int j);

	/**
	 * staticメソッド
	 */
	static void methodD() {
		System.out.println("methodD is called");
	};
}