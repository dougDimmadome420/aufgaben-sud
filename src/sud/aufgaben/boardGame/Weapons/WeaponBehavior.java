package boardGame.Weapons;

public abstract class WeaponBehavior {
    public void use() {
        this.prepare();
        this.aim();
        this.strike();
    }

    public abstract void draw();

    public abstract void holster();

    protected abstract void prepare();

    protected abstract void aim();

    protected abstract void strike();
}
