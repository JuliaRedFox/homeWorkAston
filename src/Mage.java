public class Mage extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println("Mage " + name + "  attacking");
    }

    public Mage(String name) {
        super(name);
    }
}
