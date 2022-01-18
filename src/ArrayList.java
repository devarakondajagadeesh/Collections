import org.omg.Messaging.SyncScopeHelper;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {

        List<String> arrayList = new java.util.ArrayList<String>();
        arrayList.add("jagadeesh");
        arrayList.add("jaggu");
        arrayList.add("devarakonda");
        arrayList.add("devara");
        arrayList.add("abhi");
        arrayList.add("mittu");

        System.out.println("size of the arrayList : " + arrayList.size());
        System.out.println(arrayList);
        System.out.println("===============");
        /*adding the object into collections*/
       arrayList.add("gurram");
        System.out.println("size of the arrayList : " + arrayList.size());
        System.out.println(arrayList);
        arrayList.add("hr");
        System.out.println("size of the arrayList:" + arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf("jagadeesh"));

        arrayList.add("padmasali");
        arrayList.add("kadiri");
        System.out.println("size of the arrayList:" + arrayList.size());

      arrayList.remove("padmasali");
        System.out.println("after removing:" + arrayList.size());

        arrayList.remove("kadiri");
        System.out.println("After rem size of the array :" + arrayList.size());

        arrayList.remove(7);
        System.out.println("after removing index : " + arrayList.size());

        arrayList.remove(6);
        System.out.println("after removing index : " + arrayList.size());

        List<String> nameswithj = arrayList.stream().filter(e->e.startsWith("j")).collect(Collectors.toList());
        System.out.println(nameswithj);

        System.out.println(arrayList.get(0));

        for(int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("===============");
       for(int i = arrayList.size()-1; i>=0;i--){
           System.out.println(arrayList.get(i));
        }
        System.out.println("===============");
       for(int index=0; index<arrayList.size(); index++){
           System.out.println(arrayList.get(index));
       }
        System.out.println("===============");
        for(int index=0; index<arrayList.size(); index++){
            System.out.println(arrayList.get(index));
        }
        System.out.println("===============");
        for(int index= arrayList.size()-1; index>=0; index--){
            System.out.println(arrayList.get(index));
        }
        System.out.println("===============");
        for(String str : arrayList){
            System.out.println(str);
        }
        System.out.println("Iterating elements from array;list");
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Iterating elements from array;list");
        ListIterator litr = arrayList.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }



    }
}










