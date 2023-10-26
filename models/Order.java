package eTicaret.models;

public class Order {
    private String orderNumber;
    private int unitsOrder;

    public Order() {
    }
    public Order(String orderNumber, int unitsOrder) {
        this.orderNumber = orderNumber;
        this.unitsOrder = unitsOrder;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public int getUnitsOrder() {
        return unitsOrder;
    }

    public void setUnitsOrder(int unitsOrder) {
        this.unitsOrder = unitsOrder;
    }
}