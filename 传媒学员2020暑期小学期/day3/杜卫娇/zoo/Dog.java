package zoo;

public class Dog extends Animal implements Swimable {

    public void eat( Food food) {
        System.out.println("狗啃"+food.showName());
    }

    @Override
    public void swim() {
        System.out.println("狗爬式游泳");
    }
}
