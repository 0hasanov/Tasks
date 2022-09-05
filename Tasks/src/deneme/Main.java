package deneme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Car chevrolet = new Car("Camaro", 2019, 2.0);
        carList.add(chevrolet);
        carList.add(new Car("Mustang", 2020, 2.4));
        carList.add(new Car("F30", 2018, 5));
        carList.add(new Car("F30", 2018, 2));
        carList.add(new Car("i30", 2016, 3));
        carList.add(2, new Car("Avero", 2022, 1.8));
        carList.sort(Comparator.comparing(Car::getName).thenComparing(Car::getMator).reversed());

        System.out.println(carList);
    }


}
