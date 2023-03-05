import java.util.Scanner;
public class slide55 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cac so chia het cho 5 tu 1 den 200 la:");
        for(int i=0;i<=200;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}