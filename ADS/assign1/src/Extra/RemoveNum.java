package Extra;

public class RemoveNum {

	public static void main(String[] args) {
		String str1 = "exam12r3t";
		System.out.println(removeDigits(str1));
	}

	private static String removeDigits(String str1) {
		
		return str1.replaceAll("\\d", "");
	}

}
