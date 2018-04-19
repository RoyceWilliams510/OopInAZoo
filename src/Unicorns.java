public class Unicorns extends Animal {
   public Unicorns(String name){
       super(name, "marshmallows");
   }

    @Override
    public void sleep(String name) {
        System.out.println(name+ " sleeps in a a cloud");
    }
    public void eat(String food) {
        super.eat(food);
    }

}
