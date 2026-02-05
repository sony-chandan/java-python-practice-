import java.util.Arrays;

public class StringManip2 {

    public static boolean isAnagram(String s1, String s2) {
        
        // 1. Initial Check: If strings are null or different in length (after cleaning), return false


        // 2. Clean and Normalize: Remove spaces and convert to lowercase
         String cleanS1 = s1.replaceAll("\\s", "").toLowerCase();
         String cleanS2 = s2.replaceAll("\\s", "").toLowerCase();
        
        // 3. Early Exit (Post-Cleaning): Check lengths again.
         if (cleanS1.length() != cleanS2.length()) {
             return false;
         }
        
        // 4. Convert to Arrays, Sort, and Compare
         char[] c1 = cleanS1.toCharArray();
         char[] c2 = cleanS2.toCharArray();
        
         Arrays.sort(c1);
         Arrays.sort(c2);
        
        return Arrays.equals(c1, c2); 
    }

    public static void main(String[] args) {
        System.out.println("Result 1 (True): " + isAnagram("Listen", "Silent"));
        System.out.println("Result 2 (True): " + isAnagram("Mother In Law", "Hitler Woman"));
        System.out.println("Result 3 (False): " + isAnagram("hello", "world"));
    }
}