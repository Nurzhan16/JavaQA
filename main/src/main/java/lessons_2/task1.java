package lessons_2;

public class task1 {
    public static void main(String[] args) {
        System.out.println(numbers(10, 20));

    }

    public static boolean numbers(int a, int b) {

        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;


        }

        return false;
    }
}

