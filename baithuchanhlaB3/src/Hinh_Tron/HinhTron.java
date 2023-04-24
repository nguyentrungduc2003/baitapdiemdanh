package Hinh_Tron;
import java.util.Scanner;

public class HinhTron {
    Scanner scanner=new Scanner(System.in);
    final float PI=3.14f;
    float ban_kinh;
    float chu_vi;
    float dien_tich;

    //Ban  Kinh
    void NhapBanKinh(){
        System.out.print("Nhap ban kinh r: ");
        ban_kinh=scanner.nextFloat();
    }

    //Chu vi
    void TinhChuVi(){
        chu_vi=2*PI*ban_kinh;
    }
    void InChuVi(){
        System.out.printf("\nChu vi hinh tron la: %f",chu_vi);
    }

    //Dien tich
    void TinhDienTich(){
        dien_tich=PI*(ban_kinh*ban_kinh);
    }
    void InDienTich(){
        System.out.printf("\nDien tich hinh tron la: %f",dien_tich);
    }
}
