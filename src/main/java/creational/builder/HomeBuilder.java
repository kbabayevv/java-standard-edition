package creational.builder;

public class HomeBuilder {
    private String county;
    private String district;
    private String neighbourhood;

    private int roomCount;
    private int bathroomCount;
    private int balconyCount;

    private boolean isDuplex;
    private boolean hasPool;
    private boolean hasAirConditioner;

    public static HomeBuilder startBuild(String county, String district, String neighbourhood,int roomCount,int bathroomCount) {

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.county=county;
        homeBuilder.district=district;
        homeBuilder.neighbourhood=neighbourhood;
        homeBuilder.roomCount=roomCount;
        homeBuilder.bathroomCount=bathroomCount;

        return homeBuilder;
    }

    public Home build() {
        Home home = new Home();

        home.setCounty(county);
        home.setDistrict(district);
        home.setNeighbourhood(neighbourhood);
        home.setRoomCount(roomCount);
        home.setBathroomCount(bathroomCount);
        home.setBalconyCount(balconyCount);
        home.setDuplex(isDuplex);
        home.setHasPool(hasPool);
        home.setHasAirConditioner(hasAirConditioner);

        return home;
    }


    public HomeBuilder setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
        return this;
    }

    public HomeBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HomeBuilder setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }
}
