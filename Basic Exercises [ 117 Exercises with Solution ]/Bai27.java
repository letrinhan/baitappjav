import java.util.Scanner;

public class Bai27 {
	public static void main(String args[]) {
		String octal_num, hex_num;
		int decnum;
		Scanner in = new Scanner(System.in);

		System.out.print("Nhap 1 so bat phan: ");
		octal_num = in.nextLine();

		decnum = Integer.parseInt(octal_num, 8);
		hex_num = Integer.toHexString(decnum);

		System.out.print("So thap luc phan tuong duong: " + hex_num + "\n");
	}
}