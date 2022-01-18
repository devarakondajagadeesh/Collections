public class Employee implements Comparable {
    int id;
    String name;

    public Employee(String name, int id){
        this.name = name;
        this.id= id;
    }
    public void display(){
        System.out.println("name :" + name + " :" + "id :" + id);
    }
/*
    public int compareTo(Object o){
        Employee em = (Employee) o;
        if(id == em.id)
            return 0;
        else if(id>em.id)
            return 1;
        else
            return -1;
    }*/
    public int compareTo(Object o){
        Employee e = (Employee) o;
        int nameDiff = name.compareToIgnoreCase(e.name);
        return nameDiff;
    }

}
