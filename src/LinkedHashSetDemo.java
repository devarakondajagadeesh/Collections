import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {


    public static void main(String[] args) {
        Set<Customer> linkedList = new LinkedHashSet<Customer>();
        linkedList.add(new Customer(1,"jaggu","jaggu@email.com"));
        linkedList.add(new Customer(2,"jagadeesh","jagadeesh@email.com"));
        linkedList.add(new Customer(3,"abhi ","abhi@email.com"));
        linkedList.add(new Customer(4,"mittu","mittu@email.com"));

        Iterator<Customer> itr = linkedList.iterator();
       /* while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println("================");
        while(itr.hasNext()){
            Customer c1 = (Customer) itr.next();
            c1.display();
        }
    }
}