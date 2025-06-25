import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyLopHoc {
    ArrayList<HocSinh> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void them() {
        System.out.print("Nhập mã: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        ds.add(new HocSinh(ma, ten, tuoi));
    }

    public void hienThi() {
        for (HocSinh hs : ds) {
            System.out.println(hs);
        }
    }

    public void tim() {
        System.out.print("Nhập tên cần tìm: ");
        String ten = sc.nextLine().toLowerCase();
        for (HocSinh hs : ds) {
            if (hs.ten.toLowerCase().contains(ten)) {
                System.out.println(hs);
            }
        }
    }

    public void xoa() {
        System.out.print("Nhập mã cần xóa: ");
        String ma = sc.nextLine();
        ds.removeIf(hs -> hs.ma.equalsIgnoreCase(ma));
    }
}
