package condit.statements.com;

public class Main {

    public static void main(String[] args) {
        ProductTask4 product1 = new ProductTask4("Appe", 20, 100);
        ProductTask4 product2 = new ProductTask4("Ape", 15, 1400);
        ProductTask4 product3 = new ProductTask4("Ae", 13, 1040);
        ProductTask4 product4 = new ProductTask4("Ppe", 17, 1005);


        ProductTask4 items = ProductTask4.itemsExpensiv(product1, product2, product3, product4);

        System.out.println("n: " + items.getName() + " q: " + items.getQuantity());


    }
}
