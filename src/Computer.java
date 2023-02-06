public class Computer {
    private Desplay desplay;
    private String marka;
    private String svet;
    private JetskiyDisk jetskiyDisk;
    private OperativnyiPamyt operativnyiPamyt;
    private String videoKart;
    private UzbPort uzbPort;
    private String klaviatura;

    public Computer(Desplay desplay, String marka, String svet, JetskiyDisk jetskiyDisk, OperativnyiPamyt operativnyiPamyt, String videoKart, UzbPort uzbPort, String klaviatura) {
        this.desplay = desplay;
        this.marka = marka;
        this.svet = svet;
        this.jetskiyDisk = jetskiyDisk;
        this.operativnyiPamyt = operativnyiPamyt;
        this.videoKart = videoKart;
        this.uzbPort = uzbPort;
        this.klaviatura = klaviatura;
    }

    public Desplay getDesplay() {
        return desplay;
    }

    public void setDesplay(Desplay desplay) {
        this.desplay = desplay;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    public JetskiyDisk getJetskiyDisk() {
        return jetskiyDisk;
    }

    public void setJetskiyDisk(JetskiyDisk jetskiyDisk) {
        this.jetskiyDisk = jetskiyDisk;
    }

    public OperativnyiPamyt getOperativnyiPamyt() {
        return operativnyiPamyt;
    }

    public void setOperativnyiPamyt(OperativnyiPamyt operativnyiPamyt) {
        this.operativnyiPamyt = operativnyiPamyt;
    }

    public String getVideoKart() {
        return videoKart;
    }

    public void setVideoKart(String videoKart) {
        this.videoKart = videoKart;
    }

    public UzbPort getUzbPort() {
        return uzbPort;
    }

    public void setUzbPort(UzbPort uzbPort) {
        this.uzbPort = uzbPort;
    }

    public String getKlaviatura() {
        return klaviatura;
    }

    public void setKlaviatura(String klaviatura) {
        this.klaviatura = klaviatura;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\ndesplay = " + desplay +
                ",\nmarka = '" + marka + '\'' +
                ", \nsvet =' " + svet + '\'' +
                ", \njetskiyDisk = " + jetskiyDisk +
                ", \noperativnyiPamyt = " + operativnyiPamyt +
                ", \nvideoKart =' " + videoKart + '\'' +
                ", \nuzbPort = " + uzbPort +
                ", \nklaviatura =' " + klaviatura + '\'' +
                '}';
    }
}
