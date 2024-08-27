
public class javaIF2 {

    public static void main(String args[]) {

        int time = 20;
        // option 1
        if (time < 18){
            System.out.println("Good day");
        } else{
            System.out.println("Good evening");
        }
        
        // oprion 2
        String result = (time < 18)? "Good day" : "Good evening";
        System.out.println(result);
        
        //Example on Else if
        int num = -10;
        if (num > 0){
            System.out.println("The Value is a positive number.");
        } else if (num <0){
            System.out.println("The value is a neagtive number");
        }else{
            System.out.println("the value is 0");
        }
    }
}
