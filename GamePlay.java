import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePlay extends JPanel implements KeyListener, ActionListener{

    Random random = new Random();
    private boolean play = true;
    private int score = 0;
    private Timer timer;
    private int delay = 5;
    private int snakeX = 50;
    private int snakeY = 50;
    private int[] apple = new int[] {random.nextInt(40)*25, random.nextInt(40)*25};
    private boolean right = true, left = false, up = false, down = false;
    private MapGen map;

    public GamePlay(){
        map = new MapGen(1000,1000);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }

    public void paint(Graphics s){
        //Background
        s.setColor(Color.BLACK);
        s.fillRect(0,0, 1000,1000);

        //Apple
        s.setColor(Color.RED);
        s.fillRect(apple[0],apple[1], 25,25);

        //Snake
        s.setColor(Color.white);
        s.fillRect(map.tail[0],map.tail[1], 25,25);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        timer.start();
        if (play){
            if (new Rectangle (map.tail[0],map.tail[1],25,25).intersects((new Rectangle(apple[0],apple[1],25,25)))){
                int i = 0;
                map.SnakeUp(map.map,map.head,map.tail,true);
            }
        }
        repaint();
    }


    /*A: for(int i = 0; i<map.map.length; i++){
        for(int j = 0; j<map.map[0].length; j++) {


            if (map.map[i][j] >0){
                int brickX = j
                int brickY = i
                int brickWidth = map.brickWidth;
                int brickHeight = map.brickHeight;

                Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                Rectangle ballRect = new Rectangle((int)ballPosX, (int)ballPosY, 20, 20);
                Rectangle brickRect = rect;

                if (ballRect.intersects(brickRect)) {
                    map.setBrickValue(--map.map[i][j], i, j);
                    totalBricks--;
                    score += 5;

                    if (ballPosX + 19 <= brickRect.x || ballPosX + 1 >= brickRect.x + brickRect.width) {
                        ballXdir = -ballXdir;
                    } else {
                        ballYdir = -ballYdir;
                    }

                    break A;
                }
            }
        }
    }
*/

    /*A: for(int i = 0; i<map.map.length; i++){
            for(int j = 0; j<map.map[0].length; j++) {


                if (map.map[i][j] >0){
                    int brickX = j
                    int brickY = i
                    int brickWidth = map.brickWidth;
                    int brickHeight = map.brickHeight;

                    Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                    Rectangle ballRect = new Rectangle((int)ballPosX, (int)ballPosY, 20, 20);
                    Rectangle brickRect = rect;

                    if (ballRect.intersects(brickRect)) {
                        map.setBrickValue(--map.map[i][j], i, j);
                        totalBricks--;
                        score += 5;

                        if (ballPosX + 19 <= brickRect.x || ballPosX + 1 >= brickRect.x + brickRect.width) {
                            ballXdir = -ballXdir;
                        } else {
                            ballYdir = -ballYdir;
                        }

                        break A;
                    }
                }
            }
        }
    */
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e){}
    @Override
    public void keyPressed(KeyEvent e){
        String recent;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){
            recent = "R";
            while (recent.equals("R")){
            moveRight();

            }
        } if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
            while (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
            moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
            moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
            while (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
            moveDown();}
        }
    }


    public void moveRight(){
        if (play){
            map.head[1]+=1;
            //map.tail
        }
    }
    public void moveLeft(){
        if (play){
            map.head[1]-=1;

        }
    }
    public void moveUp(){
        if (play){
            map.head[0]-=1;
        }
    }
    public void moveDown(){
        if (play){
            map.head[0]+=1;
        }
    }
}
