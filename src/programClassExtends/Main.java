package programClassExtends;

class SuperClass {                                                     // Суперкласс
    int number;                                                        // Поля суперкласса:
    char symbol;
    double growth;

    void setGrowth(double n) {                                           // Метод суперкласса:
        growth = n;
    }

    SuperClass() {                                                              // Конструктор суперкласса без аргументов:
        number = 0;
        symbol = 'A';
        System.out.println("Конструктор суперкласса без аргументов!");
      }

    SuperClass(int n) {                                                         // Конструктор суперкласса с одним аргументом:
        number = n;
        symbol = 'B';
        System.out.println("Конструктор суперкласса с одним аргументом!");
    }

    SuperClass(int n, char s) {                                                  // Конструктор суперкласса с двумя аргументами:
        number = n;
        symbol = s;
        System.out.println("Конструктор суперкласса с двумя аргументами!");
      }

    SuperClass(int n, char s, double l) {                                                  // Конструктор суперкласса с тремя аргументами:
        number = n;
        symbol = s;
        setGrowth(l);
        System.out.println("Конструктор суперкласса с тремя аргументами!");
       }

    void show() {                                                      // Метод для отображения полей:
        System.out.println("Поля " + number + " и " + symbol + " и " + growth + ".");
        System.out.println();
    }

    void showAll() {         // Метод для отображения полей того класса откуда вызывается :
       show();
    }
}


class SubClass extends SuperClass {                                    //Подкласс
    String name;                                                      // Поле подкласса:
    double growth;                                                     // имя переменной growth совпадает и скрывает переменную в суперклассе


    @Override
    void setGrowth(double n) {                                           // Переопределение метода суперкласса
        growth = n;                                                   // теперь будет обращение к переменной подкласса
    }

    void setGrowth(double n, double m) {                                 // Перегрузка метода подкласса
        super.growth = n;                                          // обращаемся к переменной number суперкласса
        growth = m;

    }

    SubClass() {                                                          // Конструктор подкласса без аргументов:
        super();                                                          // Вызов конструктора суперкласса (без аргументов):
        name = "Без аргументов";
        showAll();
    }

    SubClass(String txt) {                                                // Конструктор подкласса с одним аргументом:

        super(txt.length());                                             // Вызов конструктора суперкласса (с одним аргументом):
        name = txt;
        showAll();

    }

    SubClass(int n, char s, double l) {                                   // Конструктор подкласса с тремя аргументами:
        super(n, s, l);                                                      // Вызов конструктора суперкласса с тремя аргументами):
        name = "Три аргумента";
        showAll();

    }

    SubClass(int n, char s, double l, String txt) {                      // Конструктор подкласса с четырмя аргументами:
        super(n, s, l);                                                      // Вызов конструктора суперкласса (с двумя аргументами):
        name = txt;
        showAll();
      }

    void show() {                          // Метод для отображения полей:
        System.out.println("Поля " + number + " и " + symbol + " Текстовое поле \"" + name + "\" и рост \"" + growth + "\".");
        System.out.println();
    }



    void showAll1() {      // Метод для отображения полей супер класса и подкласса:
        System.out.println("Поля суперкласса " + super.number + " и " + super.symbol + " и " + super.growth + ".");
        System.out.println("Поля подкласса " + number + " и " + symbol + " и " + growth + ".");
    }

}


public class Main {                                                      // Класс с главным методом программы:
    public static void main(String[] args) {                             // Главный метод программы:

// Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
        System.out.println("Подкласс a");
        SubClass a = new SubClass();
        System.out.println("Суперкласс b1");
        SuperClass b1 = new SuperClass(5);
        b1.showAll();
        System.out.println("Подкласс b");
        SubClass b = new SubClass("Один аргумент");
        System.out.println("Подкласс c");
        SubClass c = new SubClass(100, 'F', 1.2);
        System.out.println("Подкласс d ");
        SubClass d = new SubClass(100, 'F', 1.2, "Четыре аргумента" );
        System.out.println();
        d.showAll1();
        System.out.println();
        d.setGrowth(200);
        d.showAll1();
        System.out.println();
        d.setGrowth(300, 400);
        d.showAll1();
    }
}
