import java.util.*;

public class Bai52 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
		int x = in.nextInt();
		System.out.print("Nhap so thu hai : ");
		int y = in.nextInt();
		System.out.print("Nhap so thu ba : ");
		int z = in.nextInt();
		System.out.print("Ket qua: " + sumoftwo(x, y, z));
		System.out.print("\n");
	}

	public static boolean sumoftwo(int p, int q, int r) {
		return ((p + q) == r || (q + r) == p || (r + p) == q);
	}
}