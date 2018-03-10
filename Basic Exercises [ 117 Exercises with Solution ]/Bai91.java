import java.lang.*;

public class Bai91 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int i;
		System.out.println("10 con so dau tien :\n");
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(
				"Thoi gian uoc tinh(tinh bang nano giay) de co duoc 10 so tu nhien dau tien: " + estimatedTime);
	}
}