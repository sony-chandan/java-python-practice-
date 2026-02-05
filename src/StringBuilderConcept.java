
public class StringBuilderConcept {
	
	public static String stringBuilderConcept (String s, int n) {
		StringBuilder sb = new StringBuilder ();
		for (int i=0; i<=n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "Harsha";
		String finalString = stringBuilderConcept (s, 10);
		System.out.println(finalString);
	}

}
