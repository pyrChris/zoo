public class Zebra extends Animal{
    String name;

    public Zebra(){
        numLegs = 4;
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
        System.out.println("neigh");
    }

    @Override
    public void move() {
        System.out.println("run");
    }
}
