public class LightSwitchSimulator {
    
    public static void main(String[] args) {
  
        boolean isLightOn = true; // Example value; change to false to simulate the light being off

        System.out.println("Initial light state:");
        System.out.println("Is the light on? " + isLightOn);
        if (isLightOn) {
            System.out.println("The light is ON.");
        } else {
            System.out.println("The light is OFF.");
        }

        System.out.println("\nVariables and their values:");
        System.out.println("isLightOn = " + isLightOn);
    }
}
