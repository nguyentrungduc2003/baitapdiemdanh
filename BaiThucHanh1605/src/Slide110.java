import java.util.Scanner;
import java.util.ArrayList;
public class Slide110 {        
    //ArrayList=
    ArrayList<Integer> intList=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
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
    //max
    public void TimMax(){  
        intList.sort(null); 
        for(int i=0;i<intList.size();i++){
            if(i==intList.size()-1)
            System.out.println("Gia tri max trong danh sach la: "+intList.get(i));
        }
    }
    //xoa
    public void XoaPhanTu(){        
        int soCanTim;
        System.out.println("Nhap so can xoa trong List");
        soCanTim=scanner.nextInt();
        for(Integer nb: intList){
            if(soCanTim==nb){
                intList.remove(nb);
                System.out.printf("Danh sach sau khi xoa phan tu %d la:",nb);
                System.out.println();                
            }
        }
    }
    //Sap xep
    public void SapXep(){
        intList.sort(null);
        for(int i=0;i<intList.size();i++){
            System.out.println("Cac gia tri trong danh sach la: "+intList.get(i));
        }
    }
    public static void main(String[] args) throws Exception {
        Slide110 slide110= new Slide110();
        slide110.Nhap();
        slide110.HienThi();
        slide110.TimMax();
        slide110.XoaPhanTu();
        slide110.HienThi();
        slide110.SapXep();
    }
}
