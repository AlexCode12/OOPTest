public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem () {
        id = "Hej";
        desc = "Leeds";
        qty = 10;
        unitPrice = 19.90;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice*qty;
    }
    public String toString() {
        return id + desc + getTotal();
    }

    public static void main(String[] args) {
        InvoiceItem Inv = new InvoiceItem();
        System.out.println(Inv.toString());
    }
}
