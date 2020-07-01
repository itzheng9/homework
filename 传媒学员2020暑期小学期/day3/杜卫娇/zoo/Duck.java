package zoo;

public class Duck extends Animal implements Swimable{

    @Override
    public void eat(Food food) {
        System.out.println("鸭子吃"+food.showName());
    }

    @Override
    public void swim() {
        System.out.println("鸭子会游泳");
    }


   /* public static void main(String[] args){

    }*/
}
