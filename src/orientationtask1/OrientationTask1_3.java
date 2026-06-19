package orientationtask1;

public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setStartTime(1000);
        customer1.setEndTime(2500);

        Customer customer2 = new Customer();
        customer2.setStartTime(3000);
        customer2.setEndTime(7000);

        System.out.println("Customer " + customer1.getId());
        System.out.println("Time spent: " + customer1.getTimeSpent());

        System.out.println("Customer " + customer2.getId());
        System.out.println("Time spent: " + customer2.getTimeSpent());
    }
}
