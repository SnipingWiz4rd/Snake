import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel{

    Random = new R
private boolean play = false;
private int score = 0;
private Timer timer;
private int delay;
private int snakeX = 50;
private int snakeY = 50;
private int[] apple = new int[] {150,150};

private MapGen map;

public void paint(Graphics s){
    s.setColor(Color.BLACK);
    s.fillRect(snakeX,snakeY, 1000,1000);

    s.setColor(Color.GREEN);
    s.fillRect(50,50, 50,50);

    s.setColor(Color.RED);
    s.fillRect(apple[0],apple[1], 50,50);
}

}

