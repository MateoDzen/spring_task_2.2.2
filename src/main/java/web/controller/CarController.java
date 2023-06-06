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

    CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @RequestMapping("/cars")
    public String viewAllCars(HttpServletRequest request, Model model) {
        String count = request.getParameter("count");
        List<Car> list = (count == null || Integer.parseInt(count) >= 5) ? service.getCarList(5) :
                service.getCarList(Integer.parseInt(count));
        model.addAttribute("cars", list);
        return "cars";
    }
}
