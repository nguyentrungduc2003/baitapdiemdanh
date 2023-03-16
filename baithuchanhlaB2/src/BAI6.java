import java.util.Scanner;
/*Bài 6: (do while)
Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. 
Sau đó tính và in ra giai thừa của số đó.
 */
public class BAI6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,giai_thua=1;
        do{
            System.out.print("Nhap vao 1 so nguyen duong: ");
            n=scanner.nextInt();
        }while(n<0);
        for(int i=n;i>=1;i--){
            giai_thua*=i;
        }
        System.out.printf("Giai thua cua n la: %d",giai_thua);;
    }
}
