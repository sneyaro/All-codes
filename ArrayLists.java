import java.io.*;
import java.util.*;
public class ArrayLists {
public static void main(String[] args){
     ArrayList<Integer> arrayList = new ArrayList<>();

     for(int i=1;i<=5;i++){
         arrayList.add(i);
     }
     System.out.println(arrayList);

     arrayList.remove(3);

     System.out.println(arrayList);

     for (int i=0;i<arrayList.size();i++){
         System.out.print(arrayList.get(i)+" ");
     }
}
}
