package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
/*    private final List<Car> list;

    public CarService() {
        list = new ArrayList<>();
        list.add(new Car("VAZ", "RED", 2000));
        list.add(new Car("GAZ", "YELLOW", 2005));
        list.add(new Car("UAZ", "BLACK", 2010));
        list.add(new Car("KAMAZ", "GREEN", 2015));
        list.add(new Car("BELAZ", "WHITE", 2020));
    }
    public List<Car> getList() {
        return list;
    }*/

    List<Car> list = new ArrayList<>(Arrays.asList(
        new Car("VAZ", "RED", 2000),
        new Car("GAZ", "YELLOW", 2005),
        new Car("UAZ", "BLACK", 2010),
        new Car("KAMAZ", "GREEN", 2015),
        new Car("BELAZ", "WHITE", 2020)
));

    public List<Car> list() {
        return list;
    }
}