import java.util.*;

public class Bai65 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so thu nhat : ");
		int a = in.nextInt();
		System.out.print("Nhap so thu hai : ");
		int b = in.nextInt();
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result);
	}
}