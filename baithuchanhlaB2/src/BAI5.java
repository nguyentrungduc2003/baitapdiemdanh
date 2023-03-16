import java.util.Scanner;
/*Bài 5: (while)
Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
 */
public class BAI5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,sum=0;
        boolean number1=true;
        System.out.println("Nhap vao cac so de tong >100: ");
        while(sum<100){
            number=scanner.nextInt();
            sum+=number;    
            if(sum<=100){
                if(number1){
                    System.out.print(number);
                    number1=false;
                }   
                else{
                    System.out.print(" + "+number+" + ");
                }
            }
            else{
                System.out.print(" + "+number);
            } 
        }
        System.out.println(" = "+sum);
    }
}
