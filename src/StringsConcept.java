public class StringsConcept {
	
	public static String concatenateString(String s, int n) {
		String result = "";
		for (int i=0; i <=n; i++) {
			result = result + s + " ";
		}
		return result + "\n";
	}

	public static void main(String[] args) {
		String s = "Harsha";
		
		String finalString = concatenateString (s, 20);
		
		System.out.println (finalString);
	}

}
