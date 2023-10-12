package web.service;

import web.model.Car;

import java.util.List;

public interface Cars {
    List<Car> carList ();

    default List<Car> carsCount(List<Car> list, int number) {
        return null;
    }

}