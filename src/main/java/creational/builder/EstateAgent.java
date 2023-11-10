package creational.builder;

public class EstateAgent {
    public static void main(String[] args) {
        Home home = new Home();
        home.setCounty("Baku");
        home.setDistrict("Huseynbala Aliyev");
        home.setNeighbourhood("Memar Acami");
        home.setRoomCount(4);
        home.setHasAirConditioner(true);
        home.setBalconyCount(1);

        Home home1 = new Home("Baku", "Asiq Molla", "Nariman Narimanov", 3,
                1, 1, false, false, true);

        printHome(home);
        printHome(home1);
    }

    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Ev added -> " + home);
        System.out.println();
    }
}
