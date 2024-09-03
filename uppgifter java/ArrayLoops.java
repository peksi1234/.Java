public class ArrayOperations {
    
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); 


        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];
        System.out.println("First number: " + firstNumber);
        System.out.println("Last number: " + lastNumber);


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of all numbers: " + sum);

        double halfSum = sum / 2.0; 
        System.out.println("Half of the sum: " + halfSum);
    }
}
