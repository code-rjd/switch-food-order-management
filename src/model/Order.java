package model;

public class Order {
    public int Oid;            // order id
    public String DT;          //delivery time
    // Customer id , delivery agent, delivery address will be called from other class
    public String Olist;
    public double totalprice;

    @Override
    public String toString() {
        return "Order{" +
                "Oid=" + Oid +
                ", DT='" + DT + '\'' +
                ", Olist='" + Olist + '\'' +
                ", totalprice=" + totalprice +
                '}';
    }
}