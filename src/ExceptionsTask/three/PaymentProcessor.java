package ExceptionsTask.three;

class PaymentProcessor {
    public static void processPayment(Card card, double paymentAmount) throws InsufficientFundsException {
        if (paymentAmount > card.getAvailableFunds()) {
            throw new InsufficientFundsException("Недостатньо коштів на карті.");
        }

        card.deductFunds(paymentAmount);
    }
}

