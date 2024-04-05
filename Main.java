import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args){



        JFrame frame = new JFrame();
        GamePlay gameplay = new GamePlay();
        frame.setBounds(10,10,1000,1000);
        frame.setTitle("Snake no1 pro ultimate edition ");
        frame.setBackground(Color.black);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add(gameplay);

    }
}
