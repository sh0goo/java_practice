package chapter2;

public class UseVariableArguments2 {

	public static void main(String[] args) {
		Test2 t = new Test2();

		t.method("A", "B");
		t.method(null);
		t.method((String[]) null);
		t.method();
		t.method((String) null);
	}
}

class Test2 {

	void method(String... strings) {

		// null判定
		int ans = strings == null ? 0 : strings.length;

		// 上記と同じ
		//		if (strings == null) {
		//			ans = 0;
		//		} else {
		//			ans = strings.length;
		//		}

		System.out.println(strings + " : " + ans);
	}
}
