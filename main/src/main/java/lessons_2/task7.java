package lessons_2;

public class task7 {
    public static void main(String[] args) {
        int[] inArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] > 6 ) {
                inArr[i] *= 2;



            }
            System.out.println(inArr[i]);
        }
    }
}
