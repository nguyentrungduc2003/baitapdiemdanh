package HINHHOC;
import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float chieucao;

    public HinhTru(){
        ten = "hinh tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu cao =");
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
}
