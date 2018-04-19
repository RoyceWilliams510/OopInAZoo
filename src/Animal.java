public class Animal {
    static int population =0;
    String favoriteFood;
    String name;
    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }
    public void sleep(String name){
        System.out.println(name+ " sleeps for 8 hours");
    }
    public int populationCount(){
        return population;
    }
    public void eat(String food){
        System.out.println(name+ " eats "+ food);
        if(food ==favoriteFood){
            System.out.println( "YUM!!! "+ name+ " wants more "+ food);
        }else{
            sleep(name);
        }
    }

}

