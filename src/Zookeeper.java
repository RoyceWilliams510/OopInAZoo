import java.util.ArrayList;

public class Zookeeper {
    String name;

    public Zookeeper( String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(name+ " is feeding " + food+ " to " + animals.size()+" animals out of " +  Animal.population + " total animals.");
    }
}
