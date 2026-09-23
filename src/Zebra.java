public class Zebra extends Animal{

    public Zebra(){
        numLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("neigh");
    }

    @Override
    public void move() {
        System.out.println("run");
    }
}
