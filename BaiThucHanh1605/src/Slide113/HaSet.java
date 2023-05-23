package Slide113;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HaSet {
    public static void main(String[] args) {
        HashSet<String> sHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        String tenTraiCay;
        System.out.print("Nhap vao so luong trai cay: ");
        n=scanner.nextInt();
        scanner.nextLine();
        //them
        for(int i=0;i<n;i++){
            System.out.print("Nhap vao ten trai cay "+ (i+1)+": ");
            tenTraiCay=scanner.nextLine();
            sHashSet.add(tenTraiCay);
        }
        //hien thi
        System.out.println("Danh sach cac loai trai cay la:");
        System.out.println(sHashSet);
        //so luong
        System.out.print("So luong trai cay trong danh sach la: ");
        System.out.println(sHashSet.size());
        //kiem tra 
        System.out.print("Nhap ten trai cay ban muon tim kiem: ");
        String findTraiCay=scanner.nextLine();
        if(sHashSet.contains(findTraiCay)){
            System.out.printf("Danh sach da co %s",findTraiCay);
            System.out.println();
        }       
        else{
            System.out.printf("Danh sach khong co %s",findTraiCay);
            System.out.println();
        } 
        //xoa
        System.out.print("Nhap ten trai cay ban muon xoa: ");
        String xoaTraiCay=scanner.nextLine();
        if(sHashSet.contains(xoaTraiCay)){
            sHashSet.remove(xoaTraiCay);
            System.out.println("Da xoa %s "+xoaTraiCay+ "khoi danh sach");
            System.out.println("Danh sach con lai cac loai trai cay la:");
            System.out.println(sHashSet);
        }
        else{
            System.out.printf("Danh sach khong co trai cay %s",xoaTraiCay );
            System.out.println();
        }

        //Tao danh sach moi
        HashSet<String> sHashSet1 = new HashSet<>();
        String tenTraiCay1;
        System.out.print("Nhap vao so luong trai cay: ");
        n=scanner.nextInt();
        scanner.nextLine();
        //them
        for(int i=0;i<n;i++){
            System.out.print("Nhap vao ten trai cay "+ (i+1)+": ");
            tenTraiCay1=scanner.nextLine();
            sHashSet1.add(tenTraiCay1);
        }
        //add vao sHashSet
        Iterator<String> iterator = sHashSet1.iterator();
        while(iterator.hasNext()){
            String eString= iterator.next();
            sHashSet.add(eString);
        }
        System.out.println("Danh sach cac loai trai cay trong sHashSet sau khi them thi sHashSet1 la:");
        System.out.println(sHashSet);   
        //xoa phan tu trong sHashSet1
        sHashSet.removeAll(sHashSet1);
        System.out.println("Danh sach trai cay trong sHashSet sau khi xoa cac trai cay trong sHashSet la:");
        System.out.println(sHashSet); 
        System.out.println();  
    }
}