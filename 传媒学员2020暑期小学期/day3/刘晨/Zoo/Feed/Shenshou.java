package Zoo.Feed;

import Zoo.food.Food;

public class Shenshou extends Animal implements Flyable{

    public void eat(Food food) {
        System.out.println("神兽吃"+food.showName()  );//多态
    }

    public void fly() {
        System.out.println("神兽要飞");
    }
}
