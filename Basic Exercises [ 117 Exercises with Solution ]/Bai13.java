
public class Bai13 {

	public static void main(String[] strings) {

		final double rong = 5.6;
		final double cao = 8.5;

		double chuvi = 2 * (cao + rong);

		double dientich = rong * cao;

		System.out.printf("Chu vi la: 2*(%.1f + %.1f) = %.2f \n", cao, rong, chuvi);

		System.out.printf("Dien tich la: %.1f * %.1f = %.2f \n", cao, rong, dientich);
	}
}