package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public final class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value =  "count", defaultValue = "5"), int count, Model model) {
        model.addAttribute("cars", carService.getCars(count)));
        return "/cars";
    }
//    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
//        if (count == null) {
//            model.addAttribute("cars",carService.getCar(0));
//            return "cars";
//        } else {
//            model.addAttribute("cars", carService.getCar(Integer.parseInt(count)));
//            return "cars";
//        }
//    }
}
