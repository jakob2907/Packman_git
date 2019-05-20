public abstract class SPIELFIGUR {
    int xpos;
    int ypos;

    public SPIELFIGUR() {
    }

    public abstract void LaufenOsten();

    public abstract void LaufenWesten();

    public abstract void LaufenNorden();

    public abstract void LaufenSueden();

    public abstract int GetXPos();

    public abstract int GetYPos();
}

