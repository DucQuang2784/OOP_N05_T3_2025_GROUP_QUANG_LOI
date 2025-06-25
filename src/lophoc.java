import java.util.*;
public class LopHoc {
    public ArrayList<HocSinh> ds = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public void them() {
        System.out.print("Mã: "); String ma = sc.nextLine();
        System.out.print("Tên: "); String ten = sc.nextLine();
        System.out.print("Tuổi: "); String tuoi = sc.nextLine();
        ds.add(new HocSinh(ma, ten, tuoi));
    }
    public void hienThi() {
        for(HocSinh hs: ds) System.out.println(hs);
    }
    public void tim() {
        System.out.print("Tên: "); String t = sc.nextLine().toLowerCase();
        for(HocSinh hs: ds) if(hs.ten.toLowerCase().contains(t)) System.out.println(hs);
    }
    public void xoa() {
        System.out.print("Mã: "); String m = sc.nextLine();
        ds.removeIf(hs->hs.ma.equalsIgnoreCase(m));
    }
}
