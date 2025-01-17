import java.util.ArrayList;
import java.util.List;

public class Workshop<T extends Car> {
    private String name;
    private int maxCapacity; //maximum capacity of cars in the shop
    private ArrayList<Car> carsInWorkshop;
    private List<String> typeCar;

    public Workshop(String name, int maxCapacity, List<String> typeCar) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.carsInWorkshop = new ArrayList<>();
        this.typeCar = typeCar;
    }

    public boolean canAdd(Car car) {
        if (typeCar.contains(car.modelName) && carsInWorkshop.size() <= maxCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addCar(Car car) {
        if (canAdd(car)) {
            carsInWorkshop.add(car);
            System.out.println("Car has been added to the workshop: " + name);
        } else {
            System.out.println("Workshop: " + name + " doesn´t accept this car");
        }
    }

    public void unloadCar(Car car) {
        if (carsInWorkshop.contains(car)) {
            carsInWorkshop.remove(car);
        } else {
            System.out.println("This car isn't in the workshop");
        }
    }

}