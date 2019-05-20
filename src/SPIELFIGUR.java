public abstract class SPIELFIGUR {
    int xpos;
    int ypos;

    public SPIELFIGUR() {
    }

    public abstract void LaufenInXRichtung(int var1);

    public abstract void LaufenInYRichtung(int var1);

    public abstract int GetXPos();

    public abstract int GetYPos();
}

