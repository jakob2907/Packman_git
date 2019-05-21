public class GEIST extends SPIELFIGUR {



    GEIST(int xpos, int ypos, String color)
    {

    }

    public static void main(String args[])
    {

    }


    public void LaufenNorden()

    {
        ypos = ypos - VAR.speedGhost;
    }

    @java.lang.Override
    public void LaufenOsten()
    {
        xpos = xpos + VAR.speedGhost;
    }

    @java.lang.Override
    public void LaufenSueden()
    {
        ypos = ypos + VAR.speedGhost;
    }

    @java.lang.Override
    public void LaufenWesten()
    {
        xpos = xpos - VAR.speedGhost;
    }

    @java.lang.Override
    public int GetXPos() {
        return 0;
    }

    @java.lang.Override
    public int GetYPos() {
        return 0;
    }
}
