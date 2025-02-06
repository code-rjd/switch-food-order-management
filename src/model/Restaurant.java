package model;

public class Restaurant {
    public int Rid;           //id
    public String Rname;     // restaurant  name
    public String Rofname;    // restaurant owner first name
    public String Rolname;    // restaurant owner last name
    public String Raddress;   // restaurant address for KYC
    public int Rmn;          // restaurant  mobile no
    public int Rfssai;       // restaurant  fssai no for KYC

    @Override
    public String toString() {
        return "Restaurant{" +
                "Rid=" + Rid +
                ", Rname='" + Rname + '\'' +
                ", Rofname='" + Rofname + '\'' +
                ", Rolname='" + Rolname + '\'' +
                ", Raddress='" + Raddress + '\'' +
                ", Rmn=" + Rmn +
                ", Rfssai=" + Rfssai +
                '}';
    }

}