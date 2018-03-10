import java.util.*;

public class Bai92 {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 4, 9 };
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Mang goc: " + Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				ctr_even++;
			} else
				ctr_odd++;
		}
		System.out.printf("\nSo phan tu chan trong mang: %d", ctr_even);
		System.out.printf("\nSo phan tu le trong mang: %d", ctr_odd);
		System.out.printf("\n");
	}
}