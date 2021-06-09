import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        System.out.println("Menu");
        System.out.println("1. Fahrentheit to Celsius ");
        System.out.println("2. Celsius to Fahrentheit ");
        System.out.println("3. Exit");
        System.out.println("Enter your choice : ");
        choice = scanner.nextInt();
        do {
            switch (choice) {
                case 1: {
                    System.out.print("Enter Fahrentheit : ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrentheit to Celsius is:  " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.print("Enter Celsius : ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrentheit is: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice !=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit =  (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
