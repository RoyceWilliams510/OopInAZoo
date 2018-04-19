import java.util.ArrayList;

public class runner {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorns rarity = new Unicorns("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bees stnger = new Bees("Stinger");
        Zookeeper zoebot = new Zookeeper("zoebot");

        ArrayList<Animal> animals= new ArrayList<Animal>();

        animals.add(tigger);
        animals.add(pooh);
        animals.add(gemma);
        zoebot.feedAnimals(animals, "pollen");

    }
}
