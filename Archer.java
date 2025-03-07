public class Archer implements Character{
    private String name;
    private int health;

    public Archer(String name, int health){
        this.name = name;
        this.health = health;
    }
    @Override
    public void attacks(){
        System.out.println(name + "(Archer) shoot arrow!");
    }
}
