package model;

public class DeliveryAgent {
    private int DAid;           //id
    private String DAfname;     //first name
    private String DAlname;     // last name
    private String DAaddress;   // address for KYC
    private int DAmn;           // mobile no
    private int DAaadhar;       // aadhar no for KYC

    @Override
    public String toString() {
        return "DeliveryAgent{" +
                "DAid=" + DAid +
                ", DAfname='" + DAfname + '\'' +
                ", DAlname='" + DAlname + '\'' +
                ", DAaddress='" + DAaddress + '\'' +
                ", DAmn=" + DAmn +
                ", DAaadhar=" + DAaadhar +
                '}';
    }

    public int getDAid() {
        return DAid;
    }

    public void setDAid(int DAid) {
        this.DAid = DAid;
    }

    public String getDAfname() {
        return DAfname;
    }

    public void setDAfname(String DAfname) {
        this.DAfname = DAfname;
    }

    public String getDAlname() {
        return DAlname;
    }

    public void setDAlname(String DAlname) {
        this.DAlname = DAlname;
    }

    public String getDAaddress() {
        return DAaddress;
    }

    public void setDAaddress(String DAaddress) {
        this.DAaddress = DAaddress;
    }

    public int getDAmn() {
        return DAmn;
    }

    public void setDAmn(int DAmn) {
        this.DAmn = DAmn;
    }

    public int getDAaadhar() {
        return DAaadhar;
    }

    public void setDAaadhar(int DAaadhar) {
        this.DAaadhar = DAaadhar;
    }
}
