public class Warrior implements Character{
    private String name;
    private int health;

    public Warrior(String name, int health){
        this.name = name;
        this.health = health;
    }
    @Override
    public void attacks(){
        System.out.println(name + "(Warrior) attacks with a sword!");
    }
}
