package atividade2;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean authorizedPayment(double amount) {
        if (amount > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void processPayment(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
