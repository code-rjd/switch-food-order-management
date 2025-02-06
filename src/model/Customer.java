package model;

public class Customer {
    private int Cid;           //id
    private String Cfname;     //first name
    private String Clname;     // last name
    private String Caddress;   // address for delivery
    private int Cmn;           // mobile no

    @Override
    public String toString() {
        return "Customer{" +
                "Cid=" + Cid +
                ", Cfname='" + Cfname + '\'' +
                ", Clname='" + Clname + '\'' +
                ", Caddress='" + Caddress + '\'' +
                ", Cmn=" + Cmn +
                '}';
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCfname() {
        return Cfname;
    }

    public void setCfname(String cfname) {
        Cfname = cfname;
    }

    public String getClname() {
        return Clname;
    }

    public void setClname(String clname) {
        Clname = clname;
    }

    public String getCaddress() {
        return Caddress;
    }

    public void setCaddress(String caddress) {
        Caddress = caddress;
    }

    public int getCmn() {
        return Cmn;
    }

    public void setCmn(int cmn) {
        Cmn = cmn;
    }
}
