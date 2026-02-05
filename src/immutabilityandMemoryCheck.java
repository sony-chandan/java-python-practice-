
public class immutabilityandMemoryCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "interview";
		String b = "inter" + "view";
		String c = "inter";
		String d = c + "view";

	//	System.out.println(a == b);
	//	System.out.println(a == d);
	System.out.println(a.equals(d));
	}
}
