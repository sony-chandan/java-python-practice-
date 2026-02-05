import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEg {
	
	static class Student implements Serializable {
		
		int id;
		String name;
		
		public Student (int id, String name){
			this.id = id;
			this.name = name;
		}

	}
	
	public static void main (String[] args) throws Exception{
		Student stu = new Student (44, "Harsha");
		FileOutputStream fos = new FileOutputStream ("Student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(stu);
		fos.close();
		System.out.println("Object Serialized Successfully");
	}
	
}
