import java.util.*;

public class SubstringCounter  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter main String: ");
        String mainString = scanner.nextLine().toLowerCase();

        System.out.print("Enter a substring: ");
        String subString = scanner.next().toLowerCase();

    
       
        String[] words = mainString.split(" ");

        int count = 0;
        for (String word : words) {
            if (word.equals(subString)) {
                count++;
            }
        }

        System.out.println("No of times substring is present in the main string: " + count);
        scanner.close();
    }
}