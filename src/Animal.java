public class Animal {
    public String howToEat() {
        return "something something";
    }
}

class Tiger extends Animal {
}

class Chicken extends Animal implements Edible, Eatable {
    @Override
    public String howToEat() {
        return "Fried the chicken like KFC. There are still " + Eatable.stock + " in stock.";
    }
}
