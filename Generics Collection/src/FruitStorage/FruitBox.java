package FruitStorage;

public class FruitBox<T extends Fruit> {
    private T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        System.out.println(fruit);
    }
}