package programClassExtends;


abstract class Vehicle {                                                     // Суперкласс
    String model;                                                            // Поля суперкласса:
    double width;
    double length;
    double height;
    double weight;
    double maxSpeed;
    double currentSpeed;
    int passengerCapacity;
    double liftingCapacity;

    Vehicle() {
        this.model = "XXX";
        this.width = 0;
        this.length = 0;
        this.height = 0;
        this.weight = 0;
        this.maxSpeed = 0;
        this.currentSpeed = 0;
        this.passengerCapacity = 0;
        this.liftingCapacity = 0;
    }

   Vehicle(String model, double width, double length, double height, double weight, double maxSpeed, double currentSpeed, int passengerCapacity, double liftingCapacity) {
        this.model = model;
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.passengerCapacity = passengerCapacity;
        this.liftingCapacity = liftingCapacity;
    }

    void show() {                                                      // Метод для отображения полей:
        System.out.println("model - " + model + " width - " + width + " length - " + length + " height - " + height + " weight - " + weight);
        System.out.println("maxSpeed - " + maxSpeed + " passengerCapacity - " + passengerCapacity + " liftingCapacity - " + liftingCapacity  );
        System.out.println();
    }

    void showAll() {          // Метод для отображения полей того класса откуда вызывается :
        show();
    }

    abstract void move();

}


