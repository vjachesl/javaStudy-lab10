package lab10;

/**
 * Created by viacheslav on 09.05.15.
 *
 */
public class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private int fruitId;

    public Fruit(String fruitName, int fruitId){
        this.fruitName = fruitName;
        this.fruitId = fruitId;
    }
    public String getFruitName(){
        return fruitName;
    }

    public int getFruitId(){
        return fruitId;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitId=" + fruitId +
                '}';
    }

    @Override
    public int compareTo(Fruit fruit) {
        return (this.fruitId>fruit.fruitId ? 1 : -1);
    }
}

class Apple extends Fruit {

    public Apple(String fruitName, int fruitId) {
        super(fruitName, fruitId);
    }
}
class RedApple extends Apple {

    public RedApple(String fruitName, int fruitId) {
        super(fruitName, fruitId);
    }
}

class Melon extends Fruit {

    public Melon(String fruitName, int fruitId) {
        super(fruitName, fruitId);
    }
}

class Orange extends Fruit {

    public Orange(String fruitName, int fruitId) {
        super(fruitName, fruitId);
    }
}
