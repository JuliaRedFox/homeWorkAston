public class Enemy implements Mortal {
    int health;
    //boolean isAlive;
    boolean enemy(boolean isAlive){
    return (health > 0);
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        health -= damage;
    }

}
