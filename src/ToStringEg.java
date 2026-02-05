
public class ToStringEg {
	
	String name;
	int id;
	
	ToStringEg(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString () {
		return id + "-" + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringEg obj = new ToStringEg (24, "Harsha");
		System.out.println(obj);
	}
}
