package eda.ex1.cartservice.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final String CUSTOMER_ID_PREFIX = "CUST-";
    private static String CUSTOMER_ID_SUFFIX = "00001";
    private static final List<String> CURRENCIES = List.of("USD", "EUR", "GBP", "ILS");
    private static final List<String> ORDER_STATUS = List.of("new", "pending", "confirmed", "shipped", "delivered");

    private String orderId;
    private String customerId;
    private String orderDate;
    private List<Item> items;
    private Double totalAmount;
    private String currency;
    private String orderStatus;
    private Integer numOfItems;

    public Order(String orderId,Integer numOfItems) {
        this.orderId = orderId;
        this.numOfItems = numOfItems;
        this.customerId = CUSTOMER_ID_PREFIX + CUSTOMER_ID_SUFFIX;
        this.orderDate = java.time.LocalDate.now().toString();
        this.items = new ArrayList<>(numOfItems);
        for (int i = 0; i < numOfItems; i++) {
            items.add(new Item());
        }
        this.totalAmount = items.stream().mapToDouble(item -> item.getItemPrice() * item.getItemQuantity()).sum();
        this.currency = CURRENCIES.get((int) (Math.random() * CURRENCIES.size()));
        this.orderStatus = ORDER_STATUS.get((int) (Math.random() * ORDER_STATUS.size()));
        CUSTOMER_ID_SUFFIX = String.format("%05d", Integer.parseInt(CUSTOMER_ID_SUFFIX) + 1);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(Integer numOfItems) {
        this.numOfItems = numOfItems;
    }

}