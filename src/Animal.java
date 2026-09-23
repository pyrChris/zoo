public abstract class Animal {
    public int numLegs =2;
    public abstract void makeSound();
    public abstract void move();
    public void eat() {
        System.out.println("the animal eats");
    }
}
