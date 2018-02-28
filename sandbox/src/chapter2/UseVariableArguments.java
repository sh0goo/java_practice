package chapter2;

public class UseVariableArguments {

	public static void main(String[] args) {

		Test t = new Test();

		// 第二引数が無い場合、空の配列が渡される。
		t.method("1回目");
		t.method("2回目", 10);
		t.method("3回目", 10, 20);
		t.method("4回目", new int[5]);
	}
}

/**
 * 可変長引数の値を表示
 * @author sh0g0
 */
class Test {
	void method(String str, int... is) {
		System.out.println(str + "サイズ：" + is.length);
		for (int i : is) {
			System.out.println("第二引数の値：" + i);
		}
	}
}