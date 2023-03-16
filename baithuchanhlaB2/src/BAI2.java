import java.util.Scanner;
/*Bài 2: (if else)
Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay lẻ. */
public class BAI2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        double a;
        a=scanner.nextDouble();
        if(a%2==0){
            System.out.printf("%s la so chan",a);
        }
        else{
            System.out.printf("%s la so le", a);
        }
    }
}
