package atividade2;

public class PaymentProcessor {

    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processOrderPayment(Order order) {
        boolean authorized = paymentMethod.authorizedPayment(order.getOrderAmount());
        if (authorized) {
            paymentMethod.processPayment(order.getOrderAmount());
            System.out.println("OKOK");
        } else {
            System.out.println("falso");
        }
    }
}
