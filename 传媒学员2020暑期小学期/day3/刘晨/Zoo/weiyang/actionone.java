package Zoo.weiyang;

import Zoo.weiyang.gongchang.Factory;

public class actionone {
    public static void main(String[] args) {
        String Animalneedfeed = "企鹅";
        String Animalneedfeed1 = "鸭子";
        String Animalneedfeed2 = "神兽";
        Weiyang gofactory = new Weiyang();
        Factory foodtoAnimal = gofactory.goFactory(Animalneedfeed);
        Factory foodtoAnimal1 = gofactory.goFactory(Animalneedfeed1);
        Factory foodtoAnimal2 = gofactory.goFactory(Animalneedfeed2);

        foodtoAnimal.feedfood();
        foodtoAnimal1.feedfood();
        foodtoAnimal2.feedfood();
    }
}
