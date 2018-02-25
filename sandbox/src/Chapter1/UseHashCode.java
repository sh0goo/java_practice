package Chapter1;

public class UseHashCode {

	public static void main(String[] args) {

		String s1 =  new String("a");
		String s2 =  s1;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
