package school.maang.usercreate;

public class Main {
    public static void main(String[] args) {

        User user = new User("Solih", 19, "Google", "London");

        System.out.println(user.getJob());
        System.out.println(user.getName());
    }
}
