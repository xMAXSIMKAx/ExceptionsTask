package ExceptionsTask.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть суму для оплати: ");
            double paymentAmount = scanner.nextDouble();

            Card card = new Card(500.0);
            PaymentProcessor.processPayment(card, paymentAmount);

            System.out.println("Оплата успішно здійснена. Залишок на карті: " + card.getAvailableFunds());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Помилка: Введено нечислове значення.");
        } catch (InsufficientFundsException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
