import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Nhap so thu nhat: ");
		int num1 = in.nextInt();

		System.out.print("Nhap so thu hai: ");
		int num2 = in.nextInt();

		System.out.print("Nhap so thu ba: ");
		int num3 = in.nextInt();

		System.out.println("Tong trung binh cac so la: " + (num1 + num2 + num3) / 3);
	}
}