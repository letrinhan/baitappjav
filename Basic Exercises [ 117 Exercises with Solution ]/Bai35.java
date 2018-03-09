import java.util.Scanner;

public class Bai35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so mat tren da giac: ");
		int ns = input.nextInt();
		System.out.print("Nhap chieu dai cua 1 trong 2 mat: ");
		double side = input.nextDouble();
		System.out.print("Dien tich la: " + polygonArea(ns, side) + "\n");
	}

	public static double polygonArea(int ns, double side) {
		return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	}
}