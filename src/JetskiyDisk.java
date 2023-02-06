public class JetskiyDisk {
    private int memory;
    private String intoHowManyDisks;

    public JetskiyDisk(int memory, String intoHowManyDisks) {
        this.memory = memory;
        this.intoHowManyDisks = intoHowManyDisks;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getIntoHowManyDisks() {
        return intoHowManyDisks;
    }

    public void setIntoHowManyDisks(String intoHowManyDisks) {
        this.intoHowManyDisks = intoHowManyDisks;
    }

    @Override
    public String toString() {
        return "JetskiyDisk{ " +
                "\nmemory = " + memory +
                ", \nintoHowManyDisks =' " + intoHowManyDisks + '\'' +
                '}';
    }
}
