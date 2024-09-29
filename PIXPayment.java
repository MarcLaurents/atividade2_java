package atividade2;

public class PIXPayment implements PaymentMethod {

    private String pixKey;

    public PIXPayment(String pixKey) {
        this.pixKey = pixKey;
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
