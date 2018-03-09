
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Nhap so thu nhat: ");
		int num1 = in.nextInt();

		System.out.print("Nhap so thu 2: ");
		int num2 = in.nextInt();

		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
	}

}