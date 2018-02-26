// Assignment #: 7
//         Name: Your name
//    StudentID: Your id
//      Lecture: Your lecture
//  Description: it needs to be filled.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WholePanel extends JPanel
{
    private Color currentColor;
    private int currentWidth, currentHeight;
    private CanvasPanel canvas;
    private JPanel menuPanel;
    private JCheckBox fillCheck;
    private int x1, y1;
    private JRadioButton white, red, blue, green, orange;

    public WholePanel()
    {
        //white is the default color
        currentColor = Color.WHITE;

        //default x-y cooridnate, width, and height of a rectangle
        currentWidth = currentHeight = 100;
        x1 = 100; y1 = 100;

        //Check box to fill or unfill drawn box
        fillCheck = new JCheckBox("Filled");

        //Radio buttons to change box color
        white = new JRadioButton("white");
        red = new JRadioButton("red");
        blue = new JRadioButton("blue");
        green = new JRadioButton("green");
        orange = new JRadioButton("orange");

        //Panel to house all buttons
        menuPanel = new JPanel();
        menuPanel.add(fillCheck);
        menuPanel.add(white);
        menuPanel.add(red);
        menuPanel.add(blue);
        menuPanel.add(green);
        menuPanel.add(orange);

        //Panel where the box's height and width can be changed through mouse motions
        canvas = new CanvasPanel();

        //Sets a line between the menu and the canvas
        JSplitPane sPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, menuPanel, canvas);

        //Applet layout
        setLayout(new BorderLayout());
        add(sPane, BorderLayout.CENTER);


    }


    //insert ColorListener and FillListener classes


    //CanvasPanel is the panel where pressed keys will be drawn
    private class CanvasPanel extends JPanel
    {
        //Constructor to initialize the canvas panel
        public CanvasPanel( )
        {
            // make this canvas panel listen to mouse
            addMouseListener(new PointListener());
            addMouseMotionListener(new PointListener());

            setBackground(Color.BLACK);
        }


        //this method draws all characters pressed by a user so far
        public void paintComponent(Graphics page)
        {
            super.paintComponent(page);

            //set color, then draw a rectangle
            page.setColor(currentColor);

            page.drawRect(x1, y1, currentWidth, currentHeight);
        }

        // listener class that listens to the mouse
        public class PointListener implements MouseListener, MouseMotionListener
        {
            //in case that a user presses using a mouse,
            //record the point where it was pressed.
            public void mousePressed (MouseEvent event) {}
            public void mouseClicked (MouseEvent event) {}
            public void mouseReleased (MouseEvent event) {}
            public void mouseEntered (MouseEvent event) {}
            public void mouseExited (MouseEvent event) {}
            public void mouseMoved(MouseEvent event) {}
            public void mouseDragged(MouseEvent event)
            {
                //to be filled
            }

        } // end of PointListener

    } // end of Canvas Panel Class

} // end of Whole Panel Class