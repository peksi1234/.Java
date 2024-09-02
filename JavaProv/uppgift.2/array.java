
public class array {

    public static void main(String args[]) {

        int[] array1 = {5, 10, 25, 75, 125};
        int[] array2 = {50, 100, 250, 750, 25};

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        System.out.println("Summa av array1: " + sum1);
        System.out.println("Summa av array2: " + sum2);

        if (sum2 != 0) {
            double division = (double) sum1 / sum2;
            System.out.println("Division av sum1 / sum2: " + division);
        } else {
            System.out.println("Divisionen kan inte utföras eftersom sum2 är 0.");
        }
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
