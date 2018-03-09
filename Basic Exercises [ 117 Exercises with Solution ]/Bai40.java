import java.nio.charset.Charset;

public class Bai40 {
	public static void main(String[] args) {
		System.out.println("Danh sach cac bo ky tu co san: ");
		for (String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}
}