package model;

public class Billing {
    public int Bid;
    public double totaltax;
    public double finalbill;

    @Override
    public String toString() {
        return "Billing{" +
                "Bid=" + Bid +
                ", totaltax=" + totaltax +
                ", finalbill=" + finalbill +
                '}';
    }

}
