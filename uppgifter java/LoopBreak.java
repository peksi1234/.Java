public class LoopBreak {
    
    public static void main(String[] args) {

        for (int number = 1; number <= 30; number++) {
            System.out.println(number);
            if (number == 11) {
                break;
            }
        }
        
        System.out.println("Loop terminated early due to break statement.");
    }
}
