import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> intList= new LinkedList<>();
    int n;
    int number;
    //nhap
    public void Nhap(){
        System.out.println("Nhap so luong so nguyen: ");    
        n = scanner.nextInt();
        for(int i=0 ;i<n;i++){
            System.out.printf("Nhap vao phan tu thu "+(i+1)+": ");
            number=scanner.nextInt();
            intList.add(number);
        }
    }
        //hien thi
        public void HienThi(){        
            System.out.println("Cac phan tu trong List la");
            for(int i=0 ;i<intList.size();i++){
                System.out.println("Phan tu thu "+(i+1)+ " la: "+intList.get(i));
            }
        }
        //tinh trung binh cong
        public void TBC(){
            int tbc=0;
            int count=0;
            for(Integer nb : intList){
                if(nb%2==0){
                    tbc+=nb;
                    count++;
                }
                else if(nb==intList.size() && nb%2==1)
                System.out.println("Danh sach khong co phan tu chia het cho 2");
                }           
                 tbc=tbc/count;
                System.out.printf("Trung binh cong cac so trong danh sach la: %d",tbc);
                System.out.println();
            } 
    public static void main(String[] args) {
        Slide111 slide111 = new Slide111();
        slide111.Nhap();
        slide111.TBC();
        slide111.HienThi();
    }
}    
