package atividade2;

public class Order {

    private String orderId;
    private double orderAmount;

    public Order(String orderId, double orderAmount) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

}
