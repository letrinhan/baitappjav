import java.util.Arrays;

public class Bai80 {
	public static void main(String[] args) {
		int[] array_nums = { 20, 30, 40 };
		System.out.println("Mang goc: " + Arrays.toString(array_nums));
		int max_val = array_nums[0];
		if (array_nums[2] >= max_val)
			max_val = array_nums[2];
		System.out.println("Gia tri lon hon giua yeu to dau tien va cuoi cung: " + max_val);
	}
}