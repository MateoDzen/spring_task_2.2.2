package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao dao;

    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCarList(String count) {
        return (count == null || Integer.parseInt(count) >= 5) ? dao.getCarList(5) :
                dao.getCarList(Integer.parseInt(count));
    }
}
