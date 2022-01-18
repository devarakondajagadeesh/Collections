public class Customer implements Comparable{

    private int customerId;
    private String customerName;
    private String email;

    public Customer(int customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    public String toString(){
        return "Customer :" + this.customerId + "," + this.customerName + "," + this.email;
    }
    public boolean equals(Object obj){
        boolean value = true;
        if(obj==null){
            value = false;
        }
        else
        {
            Customer custObj =(Customer) obj;
            if(this.customerId == custObj.customerId && this.customerName == custObj.customerName && this.email == custObj.email){
                value = true;
            }
        }
        return value;
    }
    public int hashCode() {
        return this.customerId;
    }

    @Override
    public int compareTo(Object obj) {
        Customer custObj = (Customer)obj;
        if(this.customerId == custObj.customerId)
        return 0;
        else if(this.customerId>custObj.customerId)
            return 1;
        else
            return -1;
    }/*
    public int hashCode() {
        return this.customerId;
    }

    @Override
    public int compareTo(Object obj) {
        Customer custObj = (Customer)obj;
        if(this.customerName == custObj.customerName)
            return 0;
        else if(this.customerName!=custObj.customerName)
            return 1;
        else
            return -1;

}*/

    public void display() {
        System.out.println("name : " + customerName + "," + "Id : " + customerId + "," +"email : " + email );

    }
}
