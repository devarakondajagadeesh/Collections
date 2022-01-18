import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Employee> treeset = new TreeSet<Employee>();
        treeset.add(new Employee("Jagadeesh",1001));
        treeset.add(new Employee("jaggu", 1002));
        treeset.add(new Employee("devara",1003));
        treeset.add(new Employee("mittu", 1004));

        Iterator<Employee> itr1 = treeset.iterator();
        while(itr1.hasNext()){
            Employee e1 = itr1.next();
            e1.display();
        }
    }
}
