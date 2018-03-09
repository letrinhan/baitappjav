import java.util.*;

public class Bai60 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap 1 cau: ");
		String line = in.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("Tu ap chot: " + words[words.length - 2]);
	}
}