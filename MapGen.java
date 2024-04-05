import java.awt.*;

public class MapGen {
    public int map[][];
    public int head[];
    public int tail[];
    public MapGen(int row,int col){
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                map[i][j] = 0;
            }
        }
        map[0][0] = 1;
        map[4][4] = 2;
    }
    public void draw(Graphics2D s){
        for (int i = 0; i < map.length; ++i){
            for (int j = 0; j < map[i].length; ++j){
                if (map[i][j] == 0){
                    s.setStroke(new BasicStroke(3));
                    s.setBackground(Color.black);
                    s.fillRect(i,j,180,180);

                }
                else if (map[i][j] == 1){
                    s.setStroke(new BasicStroke(3));
                    s.setBackground(Color.white);
                    s.fillRect(i,j,180,180);
                }
                else if (map[i][j] == 2){
                    s.setStroke(new BasicStroke(3));
                    s.setBackground(Color.red);
                    s.fillRect(i,j,180,180);
                }
            }
        }
    }
    public void SnakeUp(int map[][],int head[],int tail[],boolean flag){
        if (flag == true){
            map[tail[0]][tail[1]] = 1;
        }

    }
}
