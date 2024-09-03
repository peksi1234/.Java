
public class VariabelÄndring {
    public static void main(String[] args) {

        int myInt = 100;
        double myDouble = 123.45;
        float myFloat = 45.67f;
        char myChar = 'A';
        byte myByte = 50;

        System.out.println("Originalvärden:");
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDouble);
        System.out.println("float: " + myFloat);
        System.out.println("char: " + myChar);
        System.out.println("byte: " + myByte);

        double intToDouble = myInt;        
        double floatToDouble = myFloat;     
        int doubleToInt = (int) myDouble;   
        int charToInt = myChar;             
        byte intToByte = (byte) myInt;      

        System.out.println("\nVärden efter dataändring:");
        System.out.println("int to double: " + intToDouble);
        System.out.println("float to double: " + floatToDouble);
        System.out.println("double to int: " + doubleToInt);
        System.out.println("char to int: " + charToInt);
        System.out.println("int to byte: " + intToByte);
    }
}
