class Person {
    private String firstName;
    private String lastName;
    private String birthPlace;

    public Person(String firstName, String lastName, String birthPlace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
    }


    public void displayInfo() {
        System.out.println(firstName + " " + lastName + " " + birthPlace);
    }
}

