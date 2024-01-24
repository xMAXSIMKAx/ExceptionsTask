package ExceptionsTask.one;

import java.util.Scanner;

public class AppOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введіть ціле число:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Ви ввели: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error , ви ввели не коректне чило");
        } finally {
            scanner.close();
        }
    }

}
