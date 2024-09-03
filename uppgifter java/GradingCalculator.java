public class GradingCalculator {
    public static void main(String[] args) {

        int[] scores = {95, 85, 72, 62, 45, 15, 105}; 

        for (int score : scores) {
            System.out.print("Score: " + score + " - ");

            if (score >= 90 && score <= 100) {
                System.out.println("Grade: 5 - Excellent! You have achieved the highest grade.");
            } else if (score >= 80 && score < 90) {
                System.out.println("Grade: 4 - Very good! Keep it up.");
            } else if (score >= 70 && score < 80) {
                System.out.println("Grade: 3 - Good work! You're on the right track.");
            } else if (score >= 60 && score < 70) {
                System.out.println("Grade: 2 - Satisfactory! But there is room for improvement.");
            } else if (score >= 25 && score < 60) {
                System.out.println("Grade: 1 - You need to work harder to improve your grade.");
            } else if (score >= 0 && score < 25) {
                System.out.println("Grade: 0 - Fail. You need to study much more.");
            } else {
                System.out.println("Invalid score. The score must be between 0 and 100.");
            }
        }
    }
}

