public class StoreSystem {
    public static void main(String[] args) {

        Product generalProduct = new Product("Generic Product", "000111222333", 100.0);
        generalProduct.displayInfo();
        System.out.println();

        Chocolate chocolate = new Chocolate("Milk Chocolate", "111222333444", 5.0, 100);
        chocolate.displayInfo();
        System.out.println();


        Wine wine = new Wine("Red Wine", "222333444555", 20.0, 0.75);
        wine.displayInfo();
    }
}
