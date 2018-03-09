import java.util.Arrays;

public class Bai82 {
	public static void main(String[] args) {
		int[] array_nums = { 20, 30, 40, 50, 67 };
		System.out.println("Mang goc: " + Arrays.toString(array_nums));
		int max_val = array_nums[0];
		if (max_val <= array_nums[array_nums.length - 1])
			max_val = array_nums[array_nums.length - 1];
		if (max_val <= array_nums[array_nums.length / 2])
			max_val = array_nums[array_nums.length / 2];
		System.out.println("Phan tu lon nhat giua gia tri dau tien, cuoi cung va trung binh: " + max_val);
	}
}