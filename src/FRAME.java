import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import static java.awt.Color.black;


public class FRAME {

    PACKMAN packman;



    FRAME()
    {

        JFrame jfStart = new JFrame("PackMan");
        jfStart.setSize(VAR.JfStartWeigth, VAR.JfStartHeigth);
        jfStart.setLocationRelativeTo(null);
        jfStart.setResizable(false);
        jfStart.setAlwaysOnTop(true);
        jfStart.setBackground(black);

        jfStart.setVisible(true);

    }

    public static void main(String args[])
    {


    }







}
