package lessons_2;

public class task2 {
    public static void main(String[] args) {
        doNumbers(69);
    }
    public static void doNumbers(int a){
        if (a>=0) {
            System.out.println("число " + a + " положительное");
        }
        else {
            System.out.println("число " + a + " отрицательное");
        }
    }
}


