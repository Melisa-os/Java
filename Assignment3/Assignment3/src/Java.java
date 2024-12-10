public class Java {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";


        String[] peopleData = text.split(" ");
        Person[] people = new Person[peopleData.length];

        for (int i = 0; i < peopleData.length; i++) {

            String[] nameCity = peopleData[i].split("/");
            String[] nameParts = nameCity[0].split("\\.");


            people[i] = new Person(nameParts[0], nameParts[1], nameCity[1]);
        }


        for (Person person : people) {
            person.displayInfo();
        }
    }
}

