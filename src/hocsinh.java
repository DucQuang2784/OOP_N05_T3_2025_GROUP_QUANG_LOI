public class HocSinh {
    String ma, ten;
    int tuoi;

    public HocSinh(String ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String toString() {
        return ma + " - " + ten + " - " + tuoi;
    }
}
