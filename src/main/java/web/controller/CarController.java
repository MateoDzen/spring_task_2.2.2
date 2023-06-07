package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @RequestMapping("/cars")
    public String viewAllCars(HttpServletRequest request, Model model) {
        String count = request.getParameter("count");
        List<Car> list = service.getCarList(count);
        model.addAttribute("cars", list);
        return "cars";
    }

}
