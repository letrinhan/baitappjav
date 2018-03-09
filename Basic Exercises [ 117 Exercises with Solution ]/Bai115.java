import java.util.*;

public class Bai115 {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen duong: ");
		int n = in.nextInt();
		System.out.printf("%d la so palindrome?\n", n);
		System.out.println(palindrome(n));
	}

	private static boolean palindrome(int num) {
		String str = String.valueOf(num);
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i++) != str.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}