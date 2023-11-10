package creational.builder;

public class Home {
    private String county;
    private String district;
    private String neighbourhood;

    private int roomCount;
    private int bathroomCount;
    private int balconyCount;

    private boolean isDuplex;
    private boolean hasPool;
    private boolean hasAirConditioner;

    public Home() {
    }

    public Home(String county, String district, String neighbourhood, int roomCount, int bathroomCount, int balconyCount, boolean isDuplex, boolean hasPool, boolean hasAirConditioner) {
        this.county = county;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.balconyCount = balconyCount;
        this.isDuplex = isDuplex;
        this.hasPool = hasPool;
        this.hasAirConditioner = hasAirConditioner;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getBathroomCount() {
        return bathroomCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    @Override
    public String toString() {
        return "Home{" +
                "county='" + county + '\'' +
                ", district='" + district + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", roomCount=" + roomCount +
                ", bathroomCount=" + bathroomCount +
                ", balconyCount=" + balconyCount +
                ", isDuplex=" + isDuplex +
                ", hasPool=" + hasPool +
                ", hasAirConditioner=" + hasAirConditioner +
                '}';
    }
}
