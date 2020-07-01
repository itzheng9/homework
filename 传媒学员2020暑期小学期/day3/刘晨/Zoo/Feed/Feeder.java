package Zoo.Feed;

import Zoo.food.Shenshoushiwu;
import Zoo.food.Yurou;

public class Feeder {
    public void feed(Animal aaa)
    {
        if (aaa instanceof Qie)
            aaa.eat(new Yurou() );//多态
        if (aaa instanceof Yazi)
            aaa.eat(new Yurou() );//多态
        if (aaa instanceof Shenshou)
            aaa.eat(new Shenshoushiwu() );//多态
    }

    public static void main(String[] args)
    {
        Feeder fd = new Feeder();
        fd.feed(new Yazi());
        Feeder fc = new Feeder();
        fc.feed(new Qie());
        Feeder fa = new Feeder();
        fa.feed(new Shenshou());
    }
}
