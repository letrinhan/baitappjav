import java.util.*;

public class Bai53 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
		int x = in.nextInt();
		System.out.print("Nhap so thu hai: ");
		int y = in.nextInt();
		System.out.print("Nhap so thu ba : ");
		int z = in.nextInt();
		System.out.print("Ket qua: " + test_last_digit(x, y, z, true));
		System.out.print("\n");
	}

	public static boolean test_last_digit(int p, int q, int r, boolean xyz) {
		return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}
}