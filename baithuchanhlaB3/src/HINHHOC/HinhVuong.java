package HINHHOC;
import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "hinh vuong";
    }
    public void nhapcanh(){
        System.out.println("canh =");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}

