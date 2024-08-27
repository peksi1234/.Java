
public class JavaOperations {
    
    public static void main(String[] args) {
        int sum1 = 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum1;

        // Fixed incorrect capitalization in variable name
        System.out.println(sum1 + sum2);  // Corrected from "Sum1" to "sum1"
        System.out.println(sum1 - sum2);
        System.out.println(sum1 + sum2);

        // Corrected a typo in the method name and variable usage
        System.out.println(sum1 / sum2);  // Changed "sum" to "sum1" and fixed "prtintln" to "println"
        System.out.println(sum1 % sum2);

        int x = 5;
        int y = 5;
        
        // Increment and decrement operations
        ++x;
        --y;
        
        // Output the new values of x and y
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

