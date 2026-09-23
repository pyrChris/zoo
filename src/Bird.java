public class Bird extends Animal{
    String name;
    public Bird(){
        numLegs = 2;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
