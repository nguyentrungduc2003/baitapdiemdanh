import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("java");
        arrayList.add("php");
        arrayList.add("c#");
        arrayList.add("c++");
        System.out.println("Cac phan tu trong arrlist la: ");
        for(String aString : arrayList){
            System.out.println(aString);
        }
    }
}