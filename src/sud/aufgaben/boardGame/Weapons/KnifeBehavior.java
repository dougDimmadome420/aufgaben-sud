package boardGame.Weapons;

public class KnifeBehavior extends WeaponBehavior {

    @Override
    public void draw() {
        System.out.println("You draw your knife");
    }

    @Override
    public void holster() {
        // TODO Auto-generated method stub
        System.out.println("You holster your knife");
    }

    @Override
    protected void prepare() {}

    @Override
    protected void aim() {
        System.out.println("You aim your knife");
    }

    @Override
    protected void strike() {
        System.out.println("You stab your opponent!");
    }
    
}
