import java.util.*;

public class Bai63 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("nhap so dau tien : ");
		int a = in.nextInt();
		System.out.print("Nhap so thu hai: ");
		int b = in.nextInt();
		System.out.println("KQ: " + result(a, b));
	}

	public static int result(int x, int y) {
		if (x == y)
			return 0;
		if (x % 6 == y % 6)
			return (x < y) ? x : y;
		return (x > y) ? x : y;
	}
}