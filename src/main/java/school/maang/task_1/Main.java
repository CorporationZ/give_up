package school.maang.task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car>  cars  =new ArrayList<>();
        cars.add(new Car("Ferrari" , 123));
        cars.add(  new Car("Ferrari" , 123));
        cars.add(new Car("Ferrari" , 123));
        cars.add(new Car("Ferrari" , 123));
        cars.add(new Car("Ferrari" , 123));

        System.out.println(cars.size());

    }
}
