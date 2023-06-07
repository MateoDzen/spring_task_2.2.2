package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "M5", 800));
        carList.add(new Car("Audi", "RS5", 700));
        carList.add(new Car("Bentley", "Continental", 1000));
        carList.add(new Car("Lamborghini", "Urus", 900));
        carList.add(new Car("Porsche", "911", 1300));
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.subList(0, count);
    }

}
