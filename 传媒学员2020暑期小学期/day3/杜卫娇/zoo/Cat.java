package zoo;

public class Cat extends Animal {
    @Override
    public void eat(Food food) {
        System.out.println("猫吃"+food.showName());
    }
}
