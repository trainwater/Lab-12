
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(200, 100), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle rightEar = new RightTriangle(new Point(210, 250), 150, -200, Color.ORANGE, true);
        RightTriangle leftEar = new RightTriangle(new Point(590, 250), -150, -200, Color.ORANGE, true);
        RightTriangle rightEarInner = new RightTriangle(new Point(215, 250), 70, -190, Color.CYAN, true);
        RightTriangle leftEarInner = new RightTriangle(new Point(585, 250), -70, -190, Color.CYAN, true);
        // Eyes:
        Oval rightEye = new Oval(new Point(300, 200), 50, 100, Color.BLACK, true);
        Oval leftEye = new Oval(new Point(450, 200), 50, 100, Color.BLACK, true);
        Oval rightEyeInner = new Oval(new Point(310, 210), 30, 80, Color.RED, true);
        Oval leftEyeInner = new Oval(new Point(460, 210), 30, 80, Color.RED, true);
      
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(375, 300), 50, Color.BLACK, true);
        PolyLine mouthL = new PolyLine(new Point(275, 350), new Point(400, 370), 30, Color.BLACK, true);
        PolyLine mouthR = new PolyLine(new Point(400, 370), new Point(525, 350), 30, Color.BLACK, true);
        Oval tongue= new Oval(new Point(450, 380), 30, 70, Color.CYAN, true);
        
        // Collar:
        Oval collar = new Oval(new Point(200, 480), 400, 50, Color.RED, true);
        Circle tag = new Circle(new Point(370, 480), 50, Color.GREEN, true);
        Circle tagInner = new Circle(new Point(375, 485), 40, Color.CYAN, false);
        
        // Square around the dog:
        Square outerSquare = new Square(new Point(400, 300), 500, Color.BLACK, false);
        Circle outerCircle = new Circle(new Point(50, -50), 700, Color.BLACK, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(rightEarInner);
        drawPanel.addShape(leftEarInner);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEyeInner);
        drawPanel.addShape(leftEyeInner);
        drawPanel.addShape(nose);
        drawPanel.addShape(collar);
        drawPanel.addShape(mouthL);
        drawPanel.addShape(mouthR);
        drawPanel.addShape(tongue);
        drawPanel.addShape(tag);
        drawPanel.addShape(tagInner);
        drawPanel.addShape(outerSquare);
        drawPanel.addShape(outerCircle);
        
        // set background color
        drawPanel.setBackground(Color.WHITE);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
