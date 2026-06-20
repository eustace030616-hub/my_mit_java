package lecture05;
import javax.swing.*;
import java.awt.*;

public class graphicTest extends JPanel{
    private static final int width = 500;
    private static final int height = 300;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawSquare(g);
        drawLine(g);
        drawTriangle(g);
        drawOval(g);
    }

    private void drawSquare(Graphics g) {
        int[] xpoints = {50, 60, 60, 50};
        int[] ypoints = {50, 50, 60, 60};

        g.setColor(Color.blue);
        g.fillRect(0, 20, 400, 200);
        g.setColor(Color.red);
        g.fillPolygon(xpoints, ypoints,4);
        
    }

    private void drawLine(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(55, 50, 55, 20);
        g.drawLine(50, 100, 200, 10);
    }

    private void drawTriangle(Graphics g) {
        g.setColor(Color.black);
    }

    private void drawOval(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(width/2 - 50, height/2 - 50, 10, 10);
    }
    public static void main(String[] args) {
        graphicTest panel = new graphicTest();
        panel.setPreferredSize(new Dimension(width, height));

        JFrame frame = new JFrame("graphicTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
