public class EqualsEg {
	
	int id;
	String name;
	EqualsEg(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
    public boolean equals(Object obj) {
		EqualsEg s = (EqualsEg) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

	public static void main(String[] args) {
		EqualsEg s1 = new EqualsEg(24, "Harsha");
		EqualsEg s2 = new EqualsEg(24, "Harsha");
		System.out.println(s1.equals(s2));
	}
}
