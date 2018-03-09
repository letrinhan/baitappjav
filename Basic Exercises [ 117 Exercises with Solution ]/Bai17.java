import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		long nhiphan1, nhiphan2;
		int i = 0, conlai = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner(System.in);

		System.out.print("Nhap so nhi phan dau tien: ");
		nhiphan1 = in.nextLong();
		System.out.print("Nhap so nhi phan thu hai: ");
		nhiphan2 = in.nextLong();

		while (nhiphan1 != 0 || nhiphan2 != 0) {
			sum[i++] = (int) ((nhiphan1 % 10 + nhiphan2 % 10 + conlai) % 2);
			conlai = (int) ((nhiphan1 % 10 + nhiphan2 % 10 + conlai) / 2);
			nhiphan1 = nhiphan1 / 10;
			nhiphan2 = nhiphan2 / 10;
		}
		if (conlai != 0) {
			sum[i++] = conlai;
		}
		--i;
		System.out.print("Sum of two binary numbers: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");
	}
}