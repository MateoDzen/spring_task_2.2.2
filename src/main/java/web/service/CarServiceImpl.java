package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao dao;

    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCarList(int count) {
        return dao.getCarList(count);
    }
}
