package atividade2;

public class Main {

    public static void main(String[] args) {
        Order order = new Order("0RD123", 100.50);

        PaymentMethod credidCard = new CreditCardPayment("1234-5678-9876-5432", "Prof Gustavo", "12/03/2024", 123);
        PaymentProcessor processor = new PaymentProcessor(credidCard);
        processor.processOrderPayment(order);

        PaymentMethod pix = new PIXPayment("prof.gustavo@example.com");
        processor = new PaymentProcessor(pix);
        processor.processOrderPayment(order);
    }
}
