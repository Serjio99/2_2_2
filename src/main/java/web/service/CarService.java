package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService implements Cars{
    private List<Car> list = new ArrayList<>();

    public List<Car> carList() {
        list = new ArrayList<>();
        list.add(new Car("VAZ", "RED", 2000));
        list.add(new Car("GAZ", "YELLOW", 2005));
        list.add(new Car("UAZ", "BLACK", 2010));
        list.add(new Car("KAMAZ", "GREEN", 2015));
        list.add(new Car("BELAZ", "WHITE", 2020));
        return list;
    }
    /*public List<Car> getList() {
        return list;
    }*/
/*
    List<Car> list = new ArrayList<>(Arrays.asList(
        new Car("VAZ", "RED", 2000),
        new Car("GAZ", "YELLOW", 2005),
        new Car("UAZ", "BLACK", 2010),
        new Car("KAMAZ", "GREEN", 2015),
        new Car("BELAZ", "WHITE", 2020)
));*/

    @Override
    public List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5)
            return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}