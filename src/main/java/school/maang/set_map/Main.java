package school.maang.set_map;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Activity work = new Activity();

        work.doWork(time -> System.out.println("O'yin o'yanash"));

        work.doWork((t) -> {
            System.out.println("Bajarish vaqti : " + t);
        });

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Alisher");
        names.add("Solih");
        names.add("Alex");

        names.forEach(item -> {
            System.out.println(item);
        });

    }
}
