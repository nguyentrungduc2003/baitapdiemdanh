import java.util.Scanner;

public class slide40 {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
       System.out.println("Nhap vao thu trong tuan:");
       int thu=scanner.nextInt();
       switch(thu){
        case 1: 
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("Wednesday");
        break;
        case 5:
        System.out.println("Thursday");
        break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Saturday");
        break;
        default:
        System.out.println("Enter from 1 to 7");
       }
    }
}