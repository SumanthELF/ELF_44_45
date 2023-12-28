package functional;

public class Run {

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		for (String val : args) {
			System.out.println(val);
		}
		System.out.println("Hi");
	}
}
