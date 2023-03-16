import java.util.Scanner;
import java.util.Arrays;
/*Bài 11: (array1) 
Viết chương trình thực hiện các công việc sau:
Nhập dữ liệu cho mảng A có n phần tử nguyên từ bàn phím. 
Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng. 
In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
 */
public class BAI11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu trong mang: ");
        do{
            n=scanner.nextInt();
        }while(n<=0);
        int a[]=new int [n];
        System.out.println("Nhap vao cac phan tu trong mang: ");
        for(int i=0;i<n;i++){
            System.out.printf("Nhap A["+(i+1)+"]= ");
            a[i]=scanner.nextInt();
        }
        System.out.println("Mang ban dau la: ");
        for(int i=0;i<n;i++){
            System.out.println("A["+(i+1)+"]= "+ a[i]);        
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep tu be den lon la: ");
        for(int i=0;i<n;i++){
            System.out.println("A["+(i+1)+"]= "+ a[i]);  
            }

        }
    }
