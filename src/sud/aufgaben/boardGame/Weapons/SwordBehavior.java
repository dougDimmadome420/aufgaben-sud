package boardGame.Weapons;

public class SwordBehavior extends WeaponBehavior {

    @Override
    public void draw() {
        System.out.println("You draw your sword");
    }

    @Override
    public void holster() {
        System.out.println("You holster your sword");
    }

    @Override
    protected void prepare() {}

    @Override
    protected void aim() {
        System.out.println("You raise your sword");
    }

    @Override
    protected void strike() {
        System.out.println("You strike your opponent!");
    }

}