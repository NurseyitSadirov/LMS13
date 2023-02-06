public class Desplay {
    private String diagonal;
    private String manufacture;
    private String matrixType;

    public Desplay(String diagonal, String manufacture, String matrixType) {
        this.diagonal = diagonal;
        this.manufacture = manufacture;
        this.matrixType = matrixType;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Desplay{" +
                "\ndiagonal =' " + diagonal + '\'' +
                ", \nmanufacture =' " + manufacture + '\'' +
                ",\nmatrixType =' " + matrixType + '\'' +
                '}';
    }
}
