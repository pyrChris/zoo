public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
        Zebra a = new Zebra();
        a.makeSound();

        Bird b = new Bird();
        b.makeSound();

        a.eat();

        Hummingbird c = new Hummingbird();
        c.eat();

        Gorilla g = new Gorilla();
        System.out.println(g.getWeight());

        
    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}
