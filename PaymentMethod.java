package atividade2;

public interface PaymentMethod {
    boolean authorizedPayment( double amount);
    void processPayment(double amount);
}