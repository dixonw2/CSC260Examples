/**
 * examples of various subclasses and how they can be
 * used in collections
 */

import java.util.ArrayList;
import java.util.List;

public class PolymorphismAndSubclasses {
    public static void main(String[] args) {
        List<NonMeat> allNonMeat = new ArrayList<>();
        allNonMeat.add(new Apple());
        allNonMeat.add(new Blueberry());
        allNonMeat.add(new Beet());
        allNonMeat.add(new Carrot());

        List<Fruit> allFruit = new ArrayList<>();
        allFruit.add(new Apple());
        allFruit.add(new Blueberry());

        /* this does not work because beet is not a fruit */
        // allFruit.add(new Beet());

        List<Vegetable> allVegetable = new ArrayList<>();
        allVegetable.add(new Beet());
        allVegetable.add(new Carrot());

        /* this does not work because apple is not a vegetable */
        // allVegetable.add(new Apple());

        /* Type casting does not work either */
        // allVegetable.add((Vegetable)new Apple());

        for (int i = 0; i < allNonMeat.size(); i++)
            System.out.println(allNonMeat.get(i).getColor());

    }
}

abstract class NonMeat {
    private String color;

    public NonMeat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

abstract class Fruit extends NonMeat {
    public Fruit(String color) {
        super(color);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("red");
    }
}

class Blueberry extends Fruit {
    public Blueberry() {
        super("blue");
    }
}

abstract class Vegetable extends NonMeat {
    public Vegetable(String color) {
        super(color);
    }
}

class Beet extends Vegetable {
    public Beet() {
        super("red");
    }
}

class Carrot extends Vegetable {
    public Carrot() {
        super("orange");
    }
}

