package ExceptionsTask.four;

import java.util.Scanner;

public class DeviceTemperatureExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введіть фактичну температуру пристройю:");
            int actualTemperature = scanner.nextInt();

            TemperatureValidator.validateTemperature(actualTemperature);

            Device device = new Device(actualTemperature);
            System.out.println("Пристрій працює при фактичній температурі: " + device.getActualTemperature());
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error введено некоректне значення температури");
        } finally {
            scanner.close();
        }
    }
}
