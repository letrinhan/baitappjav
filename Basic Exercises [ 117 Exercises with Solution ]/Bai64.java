
import java.util.*;

public class Bai64 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		int a = in.nextInt();
		System.out.print("Nhap so thu hai: ");
		int b = in.nextInt();
		System.out.println("KQ: " + common_digit(a, b));
	}

	public static boolean common_digit(int p, int q) {
		if (p < 25 || q > 75)
			return false;
		int x = p % 10;
		int y = q % 10;
		p /= 10;
		q /= 10;
		return (p == q || p == y || x == q || x == y);
	}
}