import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new java.util.HashSet<String>();
        hashSet.add("jagadeesh");
        hashSet.add("jaggu");
        hashSet.add("devarakonda");
        hashSet.add("devara");
        hashSet.add("abhi");
        hashSet.add("mittu");
        hashSet.add("jagadeesh");
        hashSet.add("jagadeesh");
        System.out.println(hashSet);

        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.print("=============");
        for( String str : hashSet){
            System.out.println(str);
        }
        System.out.println(hashSet.stream().collect(Collectors.toList()));

        Customer customer1 =new Customer(1001, "Abc", "abc@abc.com");
        Customer customer2 =new Customer(1002, "xyz", "xyz@xyz.com");
        Customer customer3 =new Customer(1007, "iop", "iop@iop.com");
        Customer customer4 =new Customer(1004, "jkl", "jkl@jkl.com");
        Customer customer5 =new Customer(1005, "Abc", "abc@abc.com");
        Customer customer6 =new Customer(1001, "Abc", "abc@abc.com");


       Set<Customer> customers = new java.util.HashSet<Customer>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        System.out.println(customers.size());
      /*  for(Customer customer : customers){
            System.out.println(customer);
        }*/
/*
        Iterator itr1 = customers.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
*/
        Iterator itr1 = customers.iterator();
        while(itr1.hasNext()){
            Customer c1 =(Customer)itr1.next();
            c1.display();
        }


    }
}
