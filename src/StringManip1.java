public class StringManip1 {

    public static String cleanString(String input) {
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "");
        
        return cleanedString; 
    }
    
    public static String cleanStringwithoutReplaceAllMethod(String input) {
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i< input.length(); i++) {
    		char c = input.charAt(i);
    		if( Character.isDigit(c) || Character.isAlphabetic(c)) {
    			sb.append(c);
    		}
    	}
		return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Java @ Core 100% $ Code!";
        String result = cleanStringwithoutReplaceAllMethod(input);
        System.out.println("Original: " + input);
        System.out.println("Cleaned: " + result); 
        // Expected Output: "JavaCore100Code" (depending on spaces retained)
    }
}