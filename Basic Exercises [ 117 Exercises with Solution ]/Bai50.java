public class Bai50 {
	public static void main(String args[]) {
		System.out.println("\nChia 3: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\n\nChia 5:  ");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\n\nChia 3 & 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + ", ");
		}
		System.out.println("\n");
	}
}