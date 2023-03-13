package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servic.CarService;
import web.servic.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService servis;

    @GetMapping("/showCars")
    public String getCars(@RequestParam (defaultValue = "5") int count, Model model){
        model.addAttribute("count", count);
        model.addAttribute("allCars", servis.getCarsListByCount(count));
        return "showCars";
    }

}
