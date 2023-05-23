package Slide114;

import java.util.Map;
import java.util.Scanner;

public class SinhVien {
    String maSinhVien;
    String name;
    String lop;
    Scanner scanner = new Scanner(System.in);
    public void NhapThongTin(){
        System.out.print("Nhap Ma Sinh Vien: ");
        maSinhVien=scanner.nextLine();
        System.out.print("Nhap Name: ");
        name=scanner.nextLine();
        System.out.print("Nhap Lop: ");
        lop=scanner.nextLine();
    }
    //hien thi
    public void HienThiThongTin(){
        System.out.println("Ma Sinh Vien: " + maSinhVien);
        System.out.println("Ho va Ten: " + name);
        System.out.println("Lop: " + lop);
    }
    public static void main(String[] args) {

    }
}
