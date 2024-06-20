package afternoon.ref;

public class NewCustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1);
        customer1.name = "John Doe";


        Customer customer2 = null;
        System.out.println(customer2);

        customer2 = customer1;
        System.out.println(customer2.name);
        System.out.println(customer1.name);
    }
}

