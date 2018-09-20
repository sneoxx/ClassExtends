package programClassExtends;
import programClassExtends.*;

public class FlyVehicle extends Vehicle {
    int maxHeight;

    FlyVehicle(){
        super();
        model = "planeCrop";
        width = 1045.5;
        length = 709.4;
        height = 305.2;
        weight = 540.4;
        maxSpeed =13.5;
        currentSpeed = 8.7;
        passengerCapacity = 1;
        liftingCapacity = 158;
        maxHeight = 570;
    }


   FlyVehicle(String model, double width, double length, double height, double weight, double maxSpeed, double currentSpeed, int passengerCapacity, double liftingCapacity, int maxHeight) {
        super(model, width, length, height, weight, maxSpeed, currentSpeed, passengerCapacity, liftingCapacity);
        this.maxHeight = maxHeight;
    }


    @Override
    void show() {                                                      // Метод для отображения полей:
        System.out.println("model - " + model + "  width - " + width + "  length - " + length + "  height - " + height + "  weight - " + weight);
        System.out.println("maxSpeed - " + maxSpeed + "  passengerCapacity - " + passengerCapacity + "  liftingCapacity - " + liftingCapacity + "  maxHeight - " + maxHeight);
        System.out.println();
    }

    @Override
    void move() {
        System.out.println(model + " летит со скоростью " + currentSpeed  + " км/ч");
        System.out.println();
    }

}
