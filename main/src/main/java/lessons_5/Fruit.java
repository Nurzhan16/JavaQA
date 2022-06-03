package lessons_5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Fruit {
    float weight;

    }

    class Box<T> {
        float maxWeight = 100.0f;
        float currentWeight = 0;
        ArrayList<T> arrayList;

        void addFruit(T fruit) {
            if (currentWeight + 1 <= maxWeight) {
                arrayList.add(fruit);
                currentWeight++;
            } else
                System.out.println("The box is full");
        }

        float getWeight(@NotNull Fruit f) {
            return arrayList.size() * f.weight;
        }

        boolean compare(Fruit f1, Fruit f2) {
            if (getWeight(f1) == getWeight(f2)) {
                return true;
            } else return false;
        }

        public boolean compare(@NotNull Box box) {
            if (currentWeight == box.currentWeight)
                return true;
            return false;
        }

    }

