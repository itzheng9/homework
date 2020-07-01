package Zoo;

public class Caipan {
    public void swim(Swimable canSaiZhe1)
    {
        canSaiZhe1.swim();
    }
    public void fly(Flyable canSaiZhe2)
    {
        canSaiZhe2.fly();
    }
    public static void main(String[] args) {
        Caipan yy = new Caipan();
        yy.swim(new Yazi()  );
        Caipan qq = new Caipan();
        qq.swim(new Qie()  );
        //Caipan yf = new Caipan();
        yy.fly(new Yazi()  );
        Caipan ss = new Caipan();
        ss.fly(new Shenshou()  );
    }
}
