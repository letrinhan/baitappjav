import java.util.Scanner;

public class Bai34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chieu dai cua 1 canh hinh luc giac: ");
		double s = input.nextDouble();
		System.out.print("Dien tich cua hinh luc giac la: " + hexagonArea(s) + "\n");
	}

	public static double hexagonArea(double s) {
		return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
	}
}