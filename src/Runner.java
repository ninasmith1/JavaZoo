import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        animals.add(tigger);

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        animals.add(pooh);

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        animals.add(rarity);

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        animals.add(gemma);

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        animals.add(stinger);

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "sushi");
    }
}
