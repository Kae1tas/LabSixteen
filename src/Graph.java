import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graph extends Canvas {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Graph graphOne = new Graph();
        graphOne.setSize(450, 300);
        frame.setLocation(400, 250);
        frame.add(graphOne);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);}
        });
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);

        g.drawLine(25,175,125,75);
        g.drawLine(225,175,125,75);

        g.drawLine(338,250,338,300);
        g.drawLine(362,250,362,300);

        g.drawLine(150,75,150,100);
        g.drawLine(150,75,175,75);
        g.drawLine(175,75,175,125);

        g.drawArc(275, 50, 150, 200, -81, 342);


    }
}