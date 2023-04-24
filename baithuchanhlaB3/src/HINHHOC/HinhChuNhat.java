package HINHHOC;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;

    public HinhChuNhat(){
        ten = "hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai =");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("chieu rong = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
