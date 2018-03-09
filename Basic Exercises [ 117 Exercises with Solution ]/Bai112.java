import java.util.Scanner;

public class Bai112 {
	public static void main(String[] arg) {

		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 so: ");
		int n = in.nextInt();
		int n1 = n;
		long ctr = 0;
		while (n != 0) {
			ctr += n / 5;
			n /= 5;
		}
		System.out.printf("So so khong daucua gia thua %d la %d ", n1, ctr);
		System.out.printf("\n");
	}
}