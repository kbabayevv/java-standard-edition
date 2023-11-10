package creational.builder;

public class EstateAgentForBuilder {
    public static void main(String[] args) {
        Home home = HomeBuilder.startBuild("Baku", "Asiq Molla Cuma", "Nariman Narimanov", 4, 1)
                .setHasAirConditioner(true)
                .setBalconyCount(1)
                .setDuplex(false)
                .setHasPool(false)
                .build();

        printHome(home);
    }

    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Ev added -> " + home);
        System.out.println();
    }
}
