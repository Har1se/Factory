public class CharacterFactory {
    public static Character createCharacter(String type, String name, int health) throws IllegalAccessException {
        switch (type.toLowerCase()){
            case "warrior":
                return new Warrior(name, health);
            case "mage":
                return new Mage(name, health);
            case "archer":
                return new Archer(name, health);
            default:
                throw new IllegalAccessException("Unknow character type: " + type);
        }
    }
}
