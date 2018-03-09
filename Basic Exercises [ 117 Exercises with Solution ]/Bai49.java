import java.util.*;

public class Bai49 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 so: ");
		int n = in.nextInt();
		if (n % 2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}