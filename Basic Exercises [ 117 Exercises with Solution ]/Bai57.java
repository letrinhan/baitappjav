import java.util.*;

public class Bai57 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen: ");
		int x = in.nextInt();

		System.out.println(kq(x));
	}

	public static int kq(int num) {
		int ctr = 0;
		for (int i = 1; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0 && i * i != num) {
				ctr += 2;
			} else if (i * i == num) {
				ctr++;
			}
		}
		return ctr;
	}
}
