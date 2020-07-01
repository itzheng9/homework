package Zoo.Feed;

import Zoo.food.Food;

public class Yazi extends Animal implements Swimable,Flyable {

    @Override
    public void eat(Food food) {
        System.out.println("鸭子吃"+food.showName()  );//多态
    }

    public void swim() {
        System.out.println("鸭子去游泳");
    }

    public void fly() {
        System.out.println("鸭子要飞");
    }
}
