import java.util.*;

public class Bai62 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
		int x = in.nextInt();
		System.out.print("Nhap so thu hai: ");
		int y = in.nextInt();
		System.out.print("Nhap so thu ba : ");
		int z = in.nextInt();
		System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
	}
}