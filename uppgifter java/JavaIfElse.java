import java.util.Scanner;  // Importera Scanner-klassen för att läsa användarinmatning

public class JämnUdda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Talet 10 är jämnt.: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Talet " + number + " är jämnt.");
        } else {
            System.out.println("Talet " + number + " är udda.");
        }

        scanner.close();
    }
}

