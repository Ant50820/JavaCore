package condit.statements.com;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Appe", 10, 100);
        Product product2 = new Product("Ape", 15, 1400);
        Product product3 = new Product("Ae", 13, 1040);
        Product product4 = new Product("Ppe", 17, 1005);


        Product most = Product.mostExpensive(product1, product2, product3, product4);

        System.out.println("n: " + most.getName() + " q: " + most.getQuantity());


    }
}
