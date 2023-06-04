import java.util.Date;
public class Order {
    
   int OrderNumber;
   Date OrderDate= new Date();
   private Date DeliveryDate = new Date();
   String OrderStatus ;
   String OrderName;
   String PaymentMethod;

    public int getOrderNumber() {
        return OrderNumber;
    }

    public Order(String OrderName,String PaymentMethod){
        this.OrderName = OrderName;
        this.PaymentMethod=PaymentMethod;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }
    
    
    
    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }
       public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }
   
   public int ClaculatePrice(int OrderNumber){
       return 0;
       
   }
}
