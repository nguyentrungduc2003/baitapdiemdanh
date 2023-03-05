import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);      
        int n;
        int total=0;
        System.out.println("Nhap cac so de tong >100:");
        while(total<=100){   
            n=scanner.nextInt();   
            total+=n;
            if(total>100)
            break;
        }
        System.out.print("Tong cac so vua nhap la:"+ total);

    }
}