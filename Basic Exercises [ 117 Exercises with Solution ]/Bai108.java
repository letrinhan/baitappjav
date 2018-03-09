import java.util.Scanner;

public class Bai108 {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen dupng: ");
		int n = in.nextInt();
		if (n > 0) {
			System.out.print("So don le las: " + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
		}
		System.out.println("\n");
	}
}