package HINHHOC;
import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bankinh;

    public HinhTron(){
        ten = "hinh tron";
    }
    public void nhapbankinh(){
        System.out.println("ban kinh =");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2* PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
}

