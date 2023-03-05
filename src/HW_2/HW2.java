package HW_2;

public class HW2 {
    // клас Animal
    abstract class Animal {
        public abstract void feed();

        public abstract void makeSound();
    }

    // клас Lion
    class Lion extends Animal {
        @Override
        public void feed() {
            System.out.println("Lion was fed.");
        }

        @Override
        public void makeSound() {
            System.out.println("Roar!");
        }
    }

    // клас Tiger
    class Tiger extends Animal {
        @Override
        public void feed() {
            System.out.println("Tiger was fed.");
        }

        @Override
        public void makeSound() {
            System.out.println("Growl!");
        }
    }

    // клас Bear
    class Bear extends Animal {
        @Override
        public void feed() {
            System.out.println("Bear was fed.");
        }

        @Override
        public void makeSound() {
            System.out.println("Grrr!");
        }
    }

    // клас Zoo
    class Zoo {
        private Animal[] animals;

        public Zoo(Animal[] animals) {
            this.animals = animals;
        }

        public void feedAnimals() {
            for (Animal animal : animals) {
                animal.feed();
            }
        }

        public void makeAnimalsSound() {
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

    // використання класів
    public class Main {
        public void main(String[] args) {
            Lion lion = new Lion();
            Tiger tiger = new Tiger();
            Bear bear = new Bear();

            Animal[] animals = {lion, tiger, bear};
            Zoo zoo = new Zoo(animals);

            zoo.feedAnimals();
            zoo.makeAnimalsSound();
        }
    }

}
