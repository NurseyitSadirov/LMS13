public class Main {
    public static void main(String[] args) {

        Desplay desplay = new Desplay("13-inch", "Macintosh HD", "Intel Iris Plus Graphics 640 1536 МБ");
        System.out.println("~~~~~~~~~~~~~~~");
        JetskiyDisk jetskiyDisk = new JetskiyDisk(256, "8-GB");
        System.out.println("~~~~~~~~~~~~~~~");
        OperativnyiPamyt operativnyiPamyt = new OperativnyiPamyt(4, "USA");
        System.out.println("~~~~~~~~~~~~~~~");
        UzbPort uzbPort = new UzbPort("FVFWQ1NUHV29", 10136);
        System.out.println("~~~~~~~~~~~~~~~");
        Computer computer = new Computer(desplay,"Macbook Pro","Black",jetskiyDisk,operativnyiPamyt,"Hello",uzbPort,"Bystro");
        System.out.println(computer);
    }
}