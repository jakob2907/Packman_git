public class PACKMAN extends SPIELFIGUR{

    GEIST g1, g2,g3,g4;

    PACKMAN()
    {
        SpawnGeist();
    }

    public void LaufenOsten()
    {
        xpos = xpos + VAR.speedPackMan;
    }

    public void LaufenWesten()
    {
        xpos = xpos - VAR.speedPackMan;
    }
    public void LaufenNorden()
    {
        ypos = ypos - VAR.speedPackMan;
    }
    public void LaufenSueden()
    {
        ypos = ypos + VAR.speedPackMan;
    }
    public int GetXPos()
    {
        return xpos;
    }

    public int GetYPos()
    {
        return ypos;
    }

    public void SpawnGeist()
    {
        g1 = new GEIST(VAR.xspawnGeist1, VAR.yspawnGeist1, VAR.colorGeist1);
        g2 = new GEIST(VAR.xspawnGeist2, VAR.yspawnGeist2, VAR.colorGeist2);
        g3 = new GEIST(VAR.xspawnGeist3, VAR.yspawnGeist3, VAR.colorGeist3);
        g4 = new GEIST(VAR.xspawnGeist4, VAR.yspawnGeist4, VAR.colorGeist4);
    }


}
