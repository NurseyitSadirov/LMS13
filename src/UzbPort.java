public class UzbPort {
    private String portType;
    private int id;

    public UzbPort(String portType, int id) {
        this.portType = portType;
        this.id = id;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UzbPort{ " +
                "\nportType =' " + portType + '\'' +
                ", \nid = " + id +
                '}';
    }
}
