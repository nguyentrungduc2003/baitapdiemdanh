import java.util.Scanner;

/*Bài 1: (Toán tử)
Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:
1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó */
public class BAI1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        double a,b;
        System.out.print("Nhap vao so thu 1:");
        a=scanner.nextDouble();       
        System.out.print("Nhap vao so thu 2:");
        b=scanner.nextDouble();
        System.out.printf("Tong cua 2 so la: "+(a+b));
        System.out.printf("\nHieu cua 2 so la: "+(a-b));
        System.out.printf("\nTich cua 2 so la: "+(a*b));
        System.out.printf("\nThuong cua 2 so la: "+(a/b));
        System.out.printf("\n%s / %s du %s",a,b,a%b);
        if(a>b){
            System.out.printf("\n%s > %s",a,b);
        }
        else if(a==b){
            System.out.printf("\n%s = %s",a,b);
        }
        else{
            System.out.printf("\n%s < %s",a,b);
        }
    }
}
