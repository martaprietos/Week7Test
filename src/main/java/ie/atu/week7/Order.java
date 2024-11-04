package ie.atu.week7;

public class Order {
    private String orderID;
    private String customerName;
    private String productName;
    private int quantity;


    public Order(){ //default constructor
        this.orderID = null;
        this.customerName = null;
        this.productName = null;
        this.quantity = 0;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
