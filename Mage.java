public class Mage implements  Character{
    private String name;
    private int health;

    public Mage(String name, int health){
        this.name = name;
        this.health = health;
    }
    @Override
    public void attacks(){
        System.out.println(name + "(Mage) casts a fireball");
    }
}
