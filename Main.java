public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Character warrior = CharacterFactory.createCharacter("warrior", "Thor", 100);
        Character mage = CharacterFactory.createCharacter("mage", "Gandalf", 80);
        Character archer = CharacterFactory.createCharacter("archer", "Legolas", 90);

        warrior.attacks();
        mage.attacks();
        archer.attacks();
    }
}
