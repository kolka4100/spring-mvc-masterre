package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam("count") int id, ModelMap modelMap) {
        List<Car> toto = new CarDaoImp().scoreCar(id);
        modelMap.addAttribute("toto", toto);
        return "cars";
    }
}
