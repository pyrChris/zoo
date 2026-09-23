public class Bird extends Animal{
    public Bird(){
        numLegs = 2;
    }
    @Override
    public void makeSound() {
        System.out.println("chirp");
    }

    @Override
    public void move() {
        System.out.println("fly");
    }


}
