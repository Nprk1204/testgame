import javax.swing.*;

public class Main {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setName("OMG IS THIS REALLY GOING TO BE A GAME, GAME");
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        panel.requestFocusInWindow();

    }

}
