package hw1;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setCounry("Ukraine");
        adress.setCity("Kyiv");
        adress.setIndex(1010101);
        adress.setStreet("Test");
        adress.setHouse(23);
        adress.setApartment(44);

        System.out.println(
                adress.getCounry() + ", "
                        + adress.getCity() + ", "
                        + adress.getIndex() + ", "
                        + adress.getStreet() + ", "
                        + adress.getHouse() + ", "
                        + adress.getApartment()
        );
    }
}
