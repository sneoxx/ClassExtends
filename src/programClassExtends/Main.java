package programClassExtends;


public class Main {                                                      // Класс с главным методом программы:
    public static void main(String[] args) {                             // Главный метод программы:

// Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
        System.out.println("Катер");
        waterfowlVehicle boatREX = new waterfowlVehicle();
        boatREX.showAll();
        System.out.println("ВАЗ КАЛИНА");
        groundVehicle vazKalina = new groundVehicle();
        vazKalina.showAll();
        System.out.println("Самолет Кукурузник");
        flyVehicle planeCrop = new flyVehicle();
        planeCrop.showAll();
    }
}


