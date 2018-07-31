package programClassExtends;

class SuperClass {                                                     // Суперкласс:
    int number;                                                       // Поля суперкласса:
    String name;

    void setNumber(int n) {                                           // Метод суперкласса:
        number = n;
    }
}

class SubClass extends SuperClass {                                    //Подкласс:
    char symbol;                                                        // Поле подкласса:

    void setAll(int n, String txt, char s) {                            // Метод подкласса:
        super.setNumber(n);                                                   // Вызов метода, описанного в суперклассе:
        name = txt;                                                    // Обращение к полю, описанному в суперклассе:
        symbol = s;                                                    // Присваивание значения полю подкласса:
    }
    void show() {                                                      // Метод подкласса:
        System.out.println("Числовое поле: " + number);                 // Отображение значений полей подкласса:
        System.out.println("Текстовое поле: " + name);
        System.out.println("Символьное поле: " + symbol);
    }
}

public class Main {                                                      // Класс с главным методом программы:
    public static void main(String[] args) {                             // Главный метод программы:
        SubClass obj = new SubClass();                                   // Создание объекта подкласса:
        obj.setAll(100, "ТЕКСТ", 'A');                        // Присваивание полям объекта значений:
        obj.show();                                                      // Отображение значений полей:
        obj.setNumber(20);                                               // Изменение значений полей объекта:
        obj.name = "НОВЫЙ";
        obj.show();                                                      // Отображение значений полей:
    }
}
