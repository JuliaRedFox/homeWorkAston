public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(160);
        Hero felix = new Mage("Felix");
        System.out.println("Health Enemy " + enemy.health);
        felix.attackEnemy(enemy);
        System.out.println("Health Enemy " + enemy.health);
    }
}
