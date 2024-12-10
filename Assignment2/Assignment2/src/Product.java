class Product {
    private String name;
    private String barcode;
    private double basePrice;
    private static final double TAX = 0.20; // PDV od 20%

    public Product(String name, String barcode, double basePrice) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
    }

    // Metoda za izračunavanje cene sa PDV-om od 20%
    public double calculatePrice() {
        return basePrice * (1 + TAX);
    }

    // Metoda za prikaz informacija o proizvodu
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Barcode: " + barcode);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Final Price with Tax: " + calculatePrice());
    }
}
