public class Archer extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(3);
        System.out.println("Archer " + name + " attacking");
    }

    public Archer(String name) {
        super(name);
    }
}
