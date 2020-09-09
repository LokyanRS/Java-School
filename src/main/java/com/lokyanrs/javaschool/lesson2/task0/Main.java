package com.lokyanrs.javaschool.lesson2.task0;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.lokyanrs.javaschool.lesson2.task0.CarType.*;

// Разбить список машин на списки, сгруппированные по type
public class Main {
    private static final List<Car> cars = Arrays.asList(
            new Car("Lada", HATCHBACK),
            new Car("Mercedes", SEDAN),
            new Car("Lada", HATCHBACK),
            new Car("BMW", WAGON),
            new Car("Skoda", LIFTBACK),
            new Car("Porsche", ROADSTER),
            new Car("Opel", WAGON),
            new Car("Volvo", SEDAN)
    );

    public static void main(String[] args) {
        Map<CarType, List<Car>> carsByTypes =
                cars.stream().collect(Collectors.groupingBy(Car::getType));

        System.out.println(carsByTypes);
    }
}
