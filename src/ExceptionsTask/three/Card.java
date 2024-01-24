package ExceptionsTask.three;

public class Card {
    private double availableFunds;

    public Card(double initialFunds) {
        this.availableFunds = initialFunds;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void deductFunds(double amount) {
        availableFunds -= amount;
    }
}
