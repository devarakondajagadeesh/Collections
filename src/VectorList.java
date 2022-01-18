import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorList<vector> {
    public static void main(String[] args) {
        List<String> vector = new Vector<String>();
        vector.add("jagadeesh");
        vector.add("jaggu");
        vector.add("devara");
        vector.add("mittu");
        vector.add("hr");
        vector.add("jagadeesh");

        System.out.println("list : " + vector);
        List<String> synlist = Collections.synchronizedList(vector);
        System.out.println("synlist : " + vector);

        synlist.add(6,"abhi");
        System.out.println("sync: "+ synlist);
        vector.add(6,"ABHI");
        System.out.println("list : " + vector);
        System.out.println("list size: " + vector.size());
        System.out.println("===============");
        for (int i=0; i<vector.size(); i++){
            System.out.println(vector.get(i));
        }

        for(int i=vector.size()-1; i>=0; i--){
        System.out.println(vector.get(i));
        }
        System.out.println("===============");
        for(String str : vector){
            System.out.println(str);
        }
        System.out.println("========list iteration============");
        Iterator itr = synlist.listIterator(synlist.size());
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
