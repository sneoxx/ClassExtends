package programClassExtends;


public class Main {                                                      // Класс с главным методом программы:
    public static void main(String[] args) {                             // Главный метод программы:

// Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
        System.out.println("Катер");
        WaterfowlVehicle boatREX = new WaterfowlVehicle();
        boatREX.showAll();
        boatREX.move();
        System.out.println("ВАЗ КАЛИНА");
        GroundVehicle vazKalina = new GroundVehicle();
        vazKalina.showAll();
        vazKalina.move();
        System.out.println("Самолет Кукурузник");
        FlyVehicle planeCrop = new FlyVehicle();
        planeCrop.showAll();
        planeCrop.move();
    }
}


