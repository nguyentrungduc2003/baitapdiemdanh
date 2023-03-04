import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        int min = a;
        if (b < a) 
            min = b;
        
        System.out.println("So nho nhat trong hai so la: " + min);

        sc.close();
    }
}