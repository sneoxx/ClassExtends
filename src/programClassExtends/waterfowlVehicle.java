package programClassExtends;

public class waterfowlVehicle extends Vehicle {
  boolean sailing;
  double displacement;

  waterfowlVehicle(){
      super();
      model = "BOAT REX 9000";
      width = 508.5;
      length = 809.4;
      height = 205.2;
      weight = 250.8;
      maxSpeed = 23.5;
      currentSpeed = 10.7;
      passengerCapacity = 4;
      liftingCapacity = 224;
      sailing = false;
      displacement = 105;
  }

    waterfowlVehicle(String model, double width, double length, double height, double weight, double maxSpeed, double currentSpeed, int passengerCapacity, double liftingCapacity, boolean sailing, double displacement) {
      super(model, width, length, height, weight, maxSpeed, currentSpeed, passengerCapacity, liftingCapacity);
      this.sailing = sailing;
      this.displacement = displacement;
    }


    @Override
    void show() {                                                      // Метод для отображения полей:
        System.out.println("model " + model + " width " + width + " length " + length + "height" + height + "weight" + weight);
        System.out.println("maxSpeed" + maxSpeed + "passengerCapacity" + passengerCapacity + "liftingCapacity" + liftingCapacity + " sailing " + sailing + " displacement " + displacement );
        System.out.println();
    }

    @Override
    void move() {
        System.out.println( model + " плывет со скоростью " + currentSpeed);
        System.out.println();
    }
}
