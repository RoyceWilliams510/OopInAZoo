public class Bees extends Animal {
    public Bees(String name){
        super(name,"pollen");
    }
    public void sleep( ){
        System.out.println( name + " never sleeps.");
    }
    public void eat(String food) {
        if(food== favoriteFood) {
            System.out.println( name+ " eats pollen.");
            System.out.println("YUM!!! " + name + " wants more pollen.");
            sleep(name);
        }else{
            System.out.println("YUCK!!! "+ name+ " will not eat "+ food);
        }
    }
}
