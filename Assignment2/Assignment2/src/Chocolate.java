class Chocolate extends Product {
    private double weight;

    public Chocolate(String name, String barcode, double basePrice, double weight) {
        super(name, barcode, basePrice);
        this.weight = weight;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + "g");
    }
}

