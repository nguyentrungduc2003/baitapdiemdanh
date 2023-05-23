package Slide112;
import java.util.ArrayList;
import java.util.Scanner;
public class Arrlist {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> stdList = new ArrayList<>();
    int n;  
    Student student = new Student();
    System.out.println("Nhap vao so luong sinh vien: ");
    n=scanner.nextInt();
    //Nhap 
    for(int i=0;i<n;i++){
        Student std = new Student();
        System.out.println("Nhap sinh vien thu "+ (i+1)+":");
        std.NhapThongTin();
        if(std.name.isEmpty())
        break;
        stdList.add(std);
    }
    //hien thi
    System.out.println();
    student.HienThiThongTin(stdList);
    //dem
    System.out.println();
    student.Dem(stdList);
    //hien thi sinh vien diem cao nhat
    System.out.println();
    student.HienThiDiemCao(stdList);;
    //hien thi sinh vien diem cao nhat
    System.out.println();
    student.TimKiem(stdList);
 }   
}
