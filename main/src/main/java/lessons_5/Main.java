package lessons_5;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        try {
            Apple apl = new Apple();
            Orange org = new Orange();

            Box<Apple> boxApple = new Box<Apple>();
            Box<Orange> boxOrange = new Box<Orange>();
            boxApple.addFruit(apl);
            boxApple.addFruit(apl);
            boxApple.addFruit(apl);
            boxOrange.addFruit(org);
            boxOrange.addFruit(org);
            boxOrange.addFruit(org);
            boxOrange.addFruit(org);
            boxOrange.addFruit(org);

            boxApple.compare(boxOrange);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
