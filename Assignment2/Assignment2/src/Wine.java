class Wine extends Product {
    private double volume;
    private static final double ADDITIONAL_TAX = 0.10; // Dodatni porez od 10% za alkoholna pića

    public Wine(String name, String barcode, double basePrice, double volume) {
        super(name, barcode, basePrice);
        this.volume = volume;
    }


    public double calculatePrice() {
        return super.calculatePrice() * (1 + ADDITIONAL_TAX);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Volume: " + volume + "L");
    }
}

