package org.sample;

public class GitClass {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[1] = 18;
		a[2] = 13;
		a[3] = 12;
		a[4] = 11;
		a[0] = 19;

		System.out.println("Values at 4th position : " + a[4]);

		int l = a.length;
		System.out.println("no of elements : " + l);

		System.out.println("\nIterating all values: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		String s = "Computer programming JAVA";
		String b[] = s.split(" ");

		for (int i = 2; i <= b.length; i--) {
			System.out.print(b[i]);
		}

	}
}
