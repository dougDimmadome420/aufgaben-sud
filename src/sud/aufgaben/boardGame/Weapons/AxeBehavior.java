package boardGame.Weapons;

public class AxeBehavior extends WeaponBehavior {

    @Override
    public void draw() {
        System.out.println("You draw your axe");
    }

    @Override
    public void holster() {
        System.out.println("You holster your axe");
    }

    @Override
    protected void prepare() {}

    @Override
    protected void aim() {
        System.out.println("You raise your axe");
    }

    @Override
    protected void strike() {
        System.out.println("You chop your opponent in half!");
    }
    
}
