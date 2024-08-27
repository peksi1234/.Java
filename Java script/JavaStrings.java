
public class JavaStrings {

    public static void main(String args[])  {
        // String variable called greetings
        String greetings = "Hello";
        System.out.println(greetings);
        
        // Length of a text
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // Upper/Lower case
        String txt1 = "Hello Class";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        
        // Obs räknar white space med
        String txt2 = "The length of the txt string is";
        System.out.println(txt2.indexOf("txt"));
        
        // String with escaped quotes
        String txt3 = "we are coding today \"coding\"";
        System.out.println(txt3);
        
        // New row \n
        String txt4 = "we are coding \ntoday";
        System.out.println(txt4);
        
        // \t tab space
        String txt5 = "we are coding \ttoday";
        System.out.println(txt5);
    }
}
