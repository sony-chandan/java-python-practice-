import java.util.ArrayList;
import java.util.List;

public class StringInterner {

    public static List<String> processAndInternNames(String[] names) {
        
    	List<String> internedNames = new ArrayList<>();
    	
    	for(String name : names) {
    		String upper = name.toUpperCase();
    		String pooledReference = upper.intern();
    		internedNames.add(pooledReference);
    	}
    	return internedNames;
    }

    public static void main(String[] args) {
        String[] data = {"Java", "core", "JAVA", "TEST", "test"};
        List<String> result = processAndInternNames(data);
        
        // Verification Test (To be run if you had a console/IDE)
        // String pool object for "JAVA" is created once.
        String pooledLiteral = "JAVA"; 
        
        System.out.println("Result size: " + result.size());
        // This should print TRUE if your implementation correctly used .intern()
        System.out.println("Memory efficient? (result.get(0) == pooledLiteral): " + (result.get(0) == pooledLiteral));
    }
}