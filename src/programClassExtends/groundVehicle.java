package programClassExtends;

public class groundVehicle extends Vehicle {
   double potencia;
   String engineType;
   String bodyType;

   groundVehicle(){
        super();
        model = "KALINA 2118";
        width = 308.5;
        length = 409.4;
        height = 195.2;
        weight = 100.8;
        maxSpeed = 180.5;
        currentSpeed = 61.7;
        passengerCapacity = 5;
        liftingCapacity = 287;
        potencia = 1.6;
        engineType = "Petrol";
        bodyType = "Sedan";
    }

    groundVehicle(String model, double width, double length, double height, double weight, double maxSpeed, double currentSpeed, int passengerCapacity, double liftingCapacity, double potencia, String engineType, String bodyType) {
        super(model, width, length, height, weight, maxSpeed, currentSpeed, passengerCapacity, liftingCapacity);
        this.potencia = potencia;
        this.engineType = engineType;
        this.bodyType = bodyType;
    }


    @Override
    void show() {                                                      // Метод для отображения полей:
        System.out.println("model " + model + " width " + width + " length " + length + "height" + height + "weight" + weight);
        System.out.println("maxSpeed" + maxSpeed + "passengerCapacity" + passengerCapacity + "liftingCapacity" + liftingCapacity + " potencia " + potencia + " engineType " + engineType + bodyType + " bodyType ");
        System.out.println();
    }

    @Override
    void move() {
        System.out.println( model + " едет со скоростью " + currentSpeed);
        System.out.println();
    }

}
