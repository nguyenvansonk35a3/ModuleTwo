package Chap05_InterfaceAbstract.demoSVCourse;

public class MonHoc {

    private String ma_mh;
    private String ten_mh;
    private int num_tc;

    public MonHoc(String ma_mh, String ten_mh, int num_tc) {
        this.ma_mh = ma_mh;
        this.ten_mh = ten_mh;
        this.num_tc = num_tc;
    }

    
    public String getMa_mh() {
        return ma_mh;
    }

    public void setMa_mh(String ma_mh) {
        this.ma_mh = ma_mh;
    }

    public String getTen_mh() {
        return ten_mh;
    }

    public void setTen_mh(String ten_mh) {
        this.ten_mh = ten_mh;
    }

    public int getNum_tc() {
        return num_tc;
    }

    public void setNum_tc(int num_tc) {
        this.num_tc = num_tc;
    }

    //show info Mon hoc
    public String showInfoMonHoc() {
        return "ma_mh: " + this.ma_mh + ", ten_mh: "
                + this.ten_mh + ", num_tc: " + this.num_tc;
    }
}
