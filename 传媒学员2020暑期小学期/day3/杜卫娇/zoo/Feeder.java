package zoo;

public class Feeder {
    public void feed(Animal aaa){
        if (aaa instanceof Dog)
            aaa.eat(new Bone());
        if (aaa instanceof Cat)
            aaa.eat(new Fish());
    }

  public void bisai(Swimable canSaiZhe){
      canSaiZhe.swim();
  }

  public static void main(String[] args){
        Feeder feeder=new Feeder();
        feeder.bisai(new Duck());
        feeder.bisai(new Dog());
  }


  /*  public static void main(String[] args){
        Feeder fd=new Feeder();
        fd.feed(new Cat());
    }*/
}
