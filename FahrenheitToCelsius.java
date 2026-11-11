import java.util.*;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextFloat(); // Changed to nextFloat()

        temperature = ((temperature - 32.0f) * 5.0f) / 9.0f; // Added .0f to preserve decimal precision

        System.out.println("Temperature in Celsius = " + temperature);

        in.close(); // Clears Scanner warning
    }
}
