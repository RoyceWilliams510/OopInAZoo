public class Bear extends Animal {
    public  Bear(String name){
        super(name, "fish");
    }
    public void sleep( String name){
        System.out.println(name+ " hibernates for 4 months");
    }
    public void eat(String food){
       super.eat(food);
    }
    public static void main(String[] args){
        Bear b= new Bear("pooh");
        b.eat("meat");
        b.eat("fish");

    }
}
