package school.maang.usercreate;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ali", 22, "Amazon", "New York");

        System.out.println(user.getJob());
        System.out.println(user.getName());
    }
}