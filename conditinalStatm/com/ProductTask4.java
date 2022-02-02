package conditinalStatm.com;

public class ProductTask4 {

    private String name;
    private int price;
    private int quantity;

    public ProductTask4(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


//    public static Product mostExpensive(Product ... products){
//        Product most = null;
//        for (Product pr: products) {
//            if (most == null) most = pr;
//            else if (most.getPrice() < pr.getPrice()){
//                most = pr;
//            }
//        }
//        return most;

    public static ProductTask4 itemsExpensiv(ProductTask4... prod){
        ProductTask4 item = null;
        for (ProductTask4 ip: prod) {
            if (item == null) item = ip;
            else if (item.getQuantity() < ip.getQuantity()){
                item = ip;
            }
        }
        return item;



        //null
        //10 13 12 17
        //10
        //13 12 17
        //13
        //12 17
        //12
        //17
    }

    public static void main(String[] args) {
        ProductTask4 product1 = new ProductTask4("Appe", 20, 100);
        ProductTask4 product2 = new ProductTask4("Ape", 15, 1400);
        ProductTask4 product3 = new ProductTask4("Ae", 13, 1040);
        ProductTask4 product4 = new ProductTask4("Ppe", 17, 1005);


        ProductTask4 items = ProductTask4.itemsExpensiv(product1, product2, product3, product4);

        System.out.println("n: " + items.getName() + " q: " + items.getQuantity());


    }

}

