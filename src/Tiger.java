public class Tiger extends Animal {
    public  Tiger(String name){
        super(name, "meat");
    }
    public void sleep(String name){
        super.sleep(name);
    }
    public void eat(String food){
        super.eat(food);
    }
    public static void main(String[] args){
        Tiger t= new Tiger("Tigger");
        t.eat("meat");
        t.eat("kibble");

    }
}
