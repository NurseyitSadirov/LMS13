public class OperativnyiPamyt {
    private int Volume;
    private String manufacturer;

    public OperativnyiPamyt(int volume, String manufacturer) {
        Volume = volume;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    @Override
    public String toString() {
        return "OperativnyiPamyt{ " +
                "\nVolume = " + Volume +
                ", \nmanufacturer =' " + manufacturer + '\'' +
                '}';
    }
}
