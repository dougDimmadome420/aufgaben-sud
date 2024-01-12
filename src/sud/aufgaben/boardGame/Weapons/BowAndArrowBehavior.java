package boardGame.Weapons;

public class BowAndArrowBehavior extends WeaponBehavior {

    @Override
    public void draw() {
        System.out.println("You take your bow");
    }

    @Override
    public void holster() {
        System.out.println("You put away your bow");
    }

    @Override
    protected void prepare() {
        System.out.println("You nock an arrow");
    }

    @Override
    protected void aim() {
        System.out.println("You take aim");
    }

    @Override
    protected void strike() {
        System.out.println("You fire!");
    }
    
}
