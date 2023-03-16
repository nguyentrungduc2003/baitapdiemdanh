import java.util.Scanner;
/*Bài 3: 
Viết chương trình nhập vào tên và một số tương ứng là năm. Sau đó xuất ra nhóm tuổi của người đó như sau:
Nếu tuổi người đó < 16 thì hiện thông báo "Bạn [Tên] ở độ tuổi vị thành niên". 
Nếu tuổi người đó >= 16 và nhỏ hơn 18 thì hiện thông báo "Bạn [Tên] ở độ tuổi trưởng thành". 
Nếu tuổi người đó >= 18 thì hiện thông báo "Bạn [Tên] đã già". */
public class BAI3 {
   public static void main(String[] args) {
    int nam_sinh; String ho_ten;
    int nam_hien_tai=2023;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Nhap ho va ten: ");
    ho_ten=scanner.nextLine();
    do{
        System.out.print("Nhap nam sinh: ");
        nam_sinh=scanner.nextInt();
    }while(nam_sinh<0 || nam_sinh>nam_hien_tai);
    if(nam_hien_tai-nam_sinh<16){
        System.out.printf("Ban %s ở do tuoi vi thanh nien",ho_ten); 
    }
    else if(nam_hien_tai-nam_sinh>=16 && nam_hien_tai-nam_sinh<18){
        System.out.printf("Ban %s ow do tuoi truong thanh",ho_ten); 
    }
    else if(nam_hien_tai-nam_sinh>18)
        System.out.printf("Ban %s da gia",ho_ten); 
    }
   } 
