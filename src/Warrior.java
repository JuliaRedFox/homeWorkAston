public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(1);
        System.out.println("Warrior " + name + "  attacking");
    }
}
