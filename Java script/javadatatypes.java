
public class JavaDataTypes {

    public static void main(String[] args) {
        // Define integer and double variables
        int myInt = 10;
        double myDouble = myInt; // Implicit casting from int to double
        float myFloat = myInt; // Implicit casting from int to float

        // Print the values
        System.out.println(myInt); // Corrected from System,out.println to System.out.println
        System.out.println(myFloat / 2); // Division operation with float
        System.out.println(myDouble / 9); // Division operation with double

        // Example of explicit casting
        myDouble = 9.78;
        int myIntFromDouble = (int) myDouble; // Explicit casting from double to int

        // Print the values after casting
        System.out.println(myDouble); // This will print 9.78
        System.out.println(myIntFromDouble); // This will print 9 (casted value)

        // Example 2
        int score = 700;
        int userScore = 450;

        // Calculate percentage
        float percentage = (float) userScore / score * 100.0f;

        // Print the percentage
        System.out.println("User's percentage is: " + percentage);
    }
}
