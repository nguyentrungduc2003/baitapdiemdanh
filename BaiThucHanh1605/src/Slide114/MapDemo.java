package Slide114;

import java.util.HashMap;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, SinhVien> danhSachSinhVien = new HashMap<>();
        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        //nhap
        for(int i=0;i<n;i++){
            System.out.println("Nhap sinh vien thu "+ (i+1) + ": ");
            SinhVien sinhVien = new SinhVien();
            sinhVien.NhapThongTin();
            danhSachSinhVien.put(sinhVien.maSinhVien, sinhVien);
        }
        scanner.nextLine();
        //tim voi ten lop
        System.out.print("Nhap ten lop muon tim:");
        String classString= scanner.nextLine();
        for(SinhVien sVien : danhSachSinhVien.values()){
            if(sVien.lop.equals(classString)){
                sVien.HienThiThongTin();
            }
        }
        //tim voi ma sinh vien
        System.out.print("Nhap ma sinh vien muon tim:");
        String ma = scanner.nextLine();
        for(SinhVien sVien : danhSachSinhVien.values()){
            if(sVien.maSinhVien.equals(ma)){
                System.out.printf("Ma Sinh vien %s co Ten va Lop la:",ma);
                scanner.nextLine();
                System.out.println("Ho va Ten: " + sVien.name);
                System.out.println("Lop: " + sVien.lop);
            }
        }
    }
}
