public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(120);
        //Hero hero = new Hero("Jack");
        //hero.attackEnemy(enemy);
        Archer archer = new Archer("Mike");
        archer.attackEnemy(enemy);
        Mage mage = new Mage("Merlin");
        mage.attackEnemy(enemy);
        Warrior warrior = new Warrior("Artur");
        warrior.attackEnemy(enemy);
    }
}
