package Zoo.Feed;

import Zoo.food.Food;

public class Qie extends Animal implements Swimable {

    public void eat(Food food) {
        System.out.println("企鹅吃"+food.showName()  );//多态
    }
    public void swim() {
        System.out.println("企鹅去游泳");
    }
}
