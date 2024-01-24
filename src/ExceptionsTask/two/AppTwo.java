package ExceptionsTask.two;

import java.util.Scanner;

public class AppTwo {
    public static void main(String[] args) {
        double[] price = {100, 99.9, 101.2, 98.7, 110.2};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("виберіть день покупки\nпн: 0\nвт: 1\nср: 2 \nчт: 3 \nпт: 4");
            int index = scanner.nextInt();
            if (index >= 0 && index < price.length) {
                double prices = price[index];
                System.out.println("Ціна за вибраний день " + index + ": " + prices);
            } else {
                System.out.println("Помилка: Неправильний індекс. Введіть індекс в межах від 0 до 4.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Помилка: Неправильний формат індексу. Введіть ціле число.");
        } finally {
            scanner.close();
        }
    }
}
