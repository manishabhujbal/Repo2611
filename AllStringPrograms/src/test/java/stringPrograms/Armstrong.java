package stringPrograms;

public class Armstrong {
	public static void main(String[] args) {

		int n = 153, old, arm = 0;
		old = n;
		while (n != 0) {
			int a = n % 10;
			arm = arm + a * a * a;
			n = n / 10;
		}
		if (old == arm) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");

		}
	}

}
