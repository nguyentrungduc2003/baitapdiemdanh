import java.util.Scanner;
import java.lang.Character;
/*Bài 9: (string)
Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím. 
Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.
 */
public class BAI9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String chuoi;
        int lowerCaseCount=0;
        int upperCaseCount=0;//shift+alt+down để nhân bản dòng
        int digitCount=0;
        System.out.println("Nhap vao mot chuoi: ");
        chuoi=scanner.nextLine();
        for(int i=0;i<chuoi.length();i++){
            char ki_tu = chuoi.charAt(i); 
            if(Character.isLowerCase(ki_tu))
                lowerCaseCount++;
            else if(Character.isUpperCase(ki_tu))
                upperCaseCount++;
            else if(Character.isDigit(ki_tu))
                digitCount++;
        }
        System.out.printf("\nSo ki tu viet thuong trong '%s' la: %d",chuoi,lowerCaseCount);
        System.out.printf("\nSo ki tu viet hoa trong '%s' la: %d",chuoi,upperCaseCount);
        System.out.printf("\nSo ki tu chu so trong '%s' la: %d",chuoi,digitCount);
        }
    }