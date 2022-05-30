package lessons_4;

public class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }


        @Override
        public boolean run ( double value){
            return false;
        }

        @Override
        public boolean swim ( double value){
            return false;
        }

        double getAnimalDistanceRun () {
            return animalDistanceRun;
        }

        double getAnimalDistanceSwim () {
            return animalDistanceSwim;
        }
    }
