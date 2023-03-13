package web.servic;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsListByCount(int count);
}
