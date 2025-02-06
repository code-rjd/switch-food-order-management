package model;

public class Menu {
    public int Mid;
    public String Mname;
    public int Munit;
    public String Mm;
    public String Mtaste;
    public String Mdescription;
    public double Mprice;

    @Override
    public String toString() {
        return "Menu{" +
                "Mid=" + Mid +
                ", Mname='" + Mname + '\'' +
                ", Munit='" + Munit + '\'' +
                ", Mm='" + Mm + '\'' +
                ", Mtaste='" + Mtaste + '\'' +
                ", Mdescription='" + Mdescription + '\'' +
                ", Mprice=" + Mprice +
                '}';
    }
}