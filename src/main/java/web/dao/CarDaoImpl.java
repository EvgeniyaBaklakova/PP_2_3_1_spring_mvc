package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

  /*  private static int count;*/
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("marka1", "red", 200));
        carList.add(new Car("marka2", "green", 130));
        carList.add(new Car("marka3", "brown", 150));
        carList.add(new Car("marka4", "white", 100));
        carList.add(new Car("marka5", "black", 180));
    }

    @Override
    public List<Car> getCarsListByCount(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).toList();
        }
    }
}
