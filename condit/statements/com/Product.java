package condit.statements.com;

public class Product {

    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
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


    public static Product mostExpensive(Product ... products){
        Product most = null;
        for (Product pr: products) {
            if (most == null) most = pr;
            else if (most.getPrice() > pr.getPrice()){
                most = pr;
            }
        }
        return most;
        //null
        //10 13 12 17
        //10
        //13 12 17
        //13
        //12 17
        //12
        //17
    }

}
