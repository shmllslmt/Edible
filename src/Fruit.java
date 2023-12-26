public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Peel and eat the fruits";
    }
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return super.howToEat() + " or we can make apple pie.";
    }
}

class Orange extends Fruit {
}