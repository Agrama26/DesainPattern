import java.math.BigDecimal;

class Ordering{
    private String orderNo;
    private String product;
    private int totalItem;
    private BigDecimal price;
    private String seller;
    private String customer;

    public String getOrderNo(){
        return orderNo;
    }

    public void setOrderNo(String orderNo){
        this.orderNo = orderNo;
    }

    public String getProduct(){
        return product;
    }

    public void setProduct(String product){
        this.product = product;
    }

    public int getTotalItem(){
        return totalItem;
    }

    public void setTotalItem(int totalItem){
        this.totalItem = totalItem;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public String getSeller(){
        return seller;
    }

    public void setSeller(String seller){
        this.seller = seller;
    }

    public String getCustomer(){
        return customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }
}

class OrderCreation{
    private final InvoiceCreation invoiceCreation;
    private final StockUpdater stockUpdater;

    public OrderCreation(InvoiceCreation invoiceCreation, StockUpdater stockUpdater){
        this.invoiceCreation = invoiceCreation;
        this.stockUpdater = stockUpdater;
    }

    public void createOrder(){
        Ordering ordering = new Ordering();
        ordering.setCustomer("Chen Yuan");
        ordering.setSeller("Xiao Rouyu");
        ordering.setOrderNo("xyz-888");
        ordering.setPrice(BigDecimal.TEN);
        ordering.setProduct("Ultra Milf");
        ordering.setTotalItem(10);
        System.out.println("Successfully Created Order " + ordering.getOrderNo());
        invoiceCreation.consume(ordering);
        stockUpdater.consume(ordering);
    }
}

class InvoiceCreation{

    public void consume(Ordering ordering){
        System.out.println("invoice from order " + ordering.getOrderNo() + " has been created");
    }
}

class StockUpdater{

    public void consume(Ordering ordering){
        System.out.println("stock of product " + ordering.getProduct() + " from order " + ordering.getOrderNo() +
                " has been updated " + ordering.getTotalItem() + " unit");
    }
}