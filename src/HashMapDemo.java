import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Person p1 = new Person("jaggu", 25, "Male");
        Person p2 = new Person("devarakonda", 24, "Male");
        Person p3 = new Person("abhi",23,"Male");
        Person p4 = new Person("mittu", 26, "Male");

        Map<String, Person > map = new HashMap<String, Person>();
        map.put("jagadeesh", p1);
        map.put("padmasali", p2);
        map.put("jagan",p3);
        map.put("jagadeeshi",p4);

        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println("value of " + key + " is : "+ map.get(key).age);
        }
    }
}
