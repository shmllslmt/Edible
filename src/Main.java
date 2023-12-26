public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(),
                new Tiger(),
                new Chicken()
        };

        Fruit[] fruits = {
                new Fruit(),
                new Apple(),
                new Orange()
        };

//        for(int i = 0; i < animals.length; i++) {
//            displayInfo(animals[i]);
//        }
//
//        for(int i = 0; i < fruits.length; i++) {
//            displayInfo(fruits[i]);
//        }

        Edible edibleanimal = new Chicken();
        System.out.println(edibleanimal.howToEat());
    }

    public static void displayInfo(Object o) {
        if(o instanceof Edible) {
            System.out.println(((Edible)o).howToEat());
        } else {
            System.out.println("This object is not an instance of Edible.");
        }
    }
}