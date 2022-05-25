package lessons_2;

public class task4 {
    public static void main(String[] args) {
        printWordNTimes("Masha", 5);

    }
    public static void printWordNTimes(String word, int times) {
        for(times=0; times<5;times++){
            System.out.println(word);
        }
    }
}