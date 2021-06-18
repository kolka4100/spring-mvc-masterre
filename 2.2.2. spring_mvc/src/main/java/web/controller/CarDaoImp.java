package web.controller;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {
    @Override
    public List<Car> listCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Car1", "Model1"));
        carList.add(new Car(2, "Car2", "Model2"));
        carList.add(new Car(3, "Car3", "Model3"));
        carList.add(new Car(4, "Car4", "Model4"));
        carList.add(new Car(5, "Car5", "Model5"));
        return carList;
    }

    public List<Car> scoreCar(int id) {
        List<Car> temp = new CarDaoImp().listCar();
        if (id < 5) {
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < id; i++) {
                cars.add(temp.get(i));
            }
            return cars;
        }
        return temp;
    }
}
