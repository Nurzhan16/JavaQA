package lessons_2;

public class taskWithStar {
    public static void main(String[] args) {
       boolean resultYear =  doYear(2022);
       System.out.println(resultYear);
    }

    public static boolean doYear(int a) {
        if (!(a%4 ==0) || ((a%100 == 0) &&!(a%400 == 0))) {
           return true;

        }
        else {
            return false;

        }

    }
}
