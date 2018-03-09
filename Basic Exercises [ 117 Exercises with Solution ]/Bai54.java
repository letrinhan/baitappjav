import java.util.*;

public class Bai54 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
		int x = in.nextInt();
		System.out.print("Nhap so thu hai: ");
		int y = in.nextInt();
		System.out.print("Nhap so thu ba : ");
		int z = in.nextInt();
		System.out.print("Ket qua: " + abc(x, y, z, true));
		System.out.print("\n");
	}

	public static boolean abc(int p, int q, int r, boolean xyz) {
		if (xyz)
			return (r > q);
		return (q > p && r > q);
	}
}