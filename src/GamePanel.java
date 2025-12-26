import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int width, height;

    public GamePanel(){
        width = 800;
        height = 600;

        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(width, height));

        Timer timer = new Timer(16, e -> {

           update();
           repaint();

        });
        timer.start();
    }

    public void update(){



    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

    }

}
