package Nhan_Vien;

import java.util.Scanner;

public class NhanVien {
    Scanner scanner= new Scanner(System.in);
    final int luong_co_ban= 1000000;
    String name;
    int age;
    double luong;
    float he_so_luong;

    //Nhap
    void NhapTen(){
        System.out.print("Nhap Ho va Ten: ");
        name=scanner.nextLine();
    }
    void NhapTuoi(){
        System.out.print("Nhap Tuoi: ");
        age=scanner.nextInt();
    }
    void NhapHeSoLuong(){
        System.out.print("Nhap He So Luong: ");
        he_so_luong=scanner.nextFloat();

    }
    //Tinh toan
    void TinhLuong(){
        luong=luong_co_ban*he_so_luong;
    }

    //In
    void InTen(){
        System.out.print("\nHo va Ten: "+name);
    }
    void InTuoi(){
        System.out.print("\nTuoi: "+age);
    }
    void Luong(){
        System.out.print("\nLuong: "+luong);
    }
}
