package Task1;

public class Main {
    public static void main(String[] args) throws UncheckedException {


        Address address = new Address("192931");
        User user = new User( "Elect", address, "Vlad", "Electov");
        System.out.println(user.getId());
        user.changeU("Electy");
        user.changeF("Vladyslav");
        System.out.println(user.toString());
    }
}