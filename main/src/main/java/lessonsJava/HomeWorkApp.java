package lessonsJava;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10,20);
        printColor(50);
        compareNumbers(6, 9);


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if(a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value) {
        if(value < 0) {
            System.out.println ("Красный");

        }else if (value > 1 && value < 100) {
            System.out.println ("Желтый");

        } else if (value > 99) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int d, int g) {
        if(d >= g) {
            System.out.println("d >= g");

        } else {
            System.out.println("d < g");
        }
    }



    }

