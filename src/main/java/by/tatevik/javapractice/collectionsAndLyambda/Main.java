package by.tatevik.javapractice.collectionsAndLyambda;

import java.util.ArrayList;
import java.util.Collections;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //анонимный класс (нужен один раз в методе
        MyInterface myInterface = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Helloooo");
            }

            //лямбда
            MyInterface myInterface1 = () ->
                    System.out.println("Helloooo");
        };

        MyInteface2 myInteface2 = new MyInteface2() {
            @Override
            public String sayHello(String str) {
                return str;
            }

            //лямбда
            MyInteface2 myInteface2 = (String str) -> {
                return str;
            };
        };

        List<Car> carList = List.of(
                new Car("toyota2", 200000, 2005),
                new Car("toyota2", 300000, 2009),
                new Car("bmw3", 700000, 2010),
                new Car("bmw3", 800000, 2011),
                new Car("bmw3", 1000000, 2024)
        );

        carList.stream().filter(o -> o.getYear() >= 2010).forEach(System.out::println);
        carList.stream().filter(o -> o.getVendor().equals("toyota2")).forEach(System.out::println);
        carList.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).forEach(System.out::println);

        List<Car> cars = new ArrayList<>();
        //сортируем по году
        for (Car car : carList) {
            if (car.getYear() >= 2010) {
                cars.add(car);
            }
        }
        System.out.println(cars);

        List<Car> cars2 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getVendor().equals("bmw3")) {
                cars2.add(car);
            }
        }
        System.out.println("---------");
        System.out.println(cars2);

        //сортируем по цене по возрастанию, Comparator
        Collections.sort(cars2, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println("---------");
        System.out.println(cars2);

        carList.stream()
                .filter(new Predicate<Car>() {
                    @Override
                    public boolean test(Car car) {
                        return car.getYear() >= 2010;
                    }
                })
                .filter(new Predicate<Car>() {
                    @Override
                    public boolean test(Car car) {
                        return car.getVendor().equals("bmw3");
                    }
                })
                .sorted(new Comparator<Car>() {

                    @Override
                    public int compare(Car o1, Car o2) {
                        return o1.getPrice() - o2.getPrice();
                    }
                });
    }
}
