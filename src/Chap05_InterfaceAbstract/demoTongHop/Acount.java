package Chap05_InterfaceAbstract.demoTongHop;

public class Acount {

    private String acc_num;
    private String opendate;
    private double blance;

    public Acount(String acc_num, String opendate) {
        this.acc_num = acc_num;
        this.opendate = opendate;
        this.blance = 50.0;
    }

    public void AccountInfo() {
        System.out.println("acc_num: " + this.acc_num + ", opendate: " + this.opendate + ", blance: " + this.blance);
    }
}
