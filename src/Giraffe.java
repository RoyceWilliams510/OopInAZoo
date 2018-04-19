public class Giraffe extends Animal {
    public Giraffe(String name){
        super(name, "leaves");
    }
    public void sleep(String name) {
        super.sleep(name);
    }
    public void eat(String food){
        if(food== favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep(name);
        }else{
            System.out.println("YUCK!!! "+ name+ " will not eat "+ food);
        }
    }
}
