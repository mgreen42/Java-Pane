// Assignment #: 7
//         Name: Your name
//    StudentID: Your id
//      Lecture: Your lecture
//  Description: it needs to be filled

import javax.swing.*;

public class Assignment7 extends JApplet
{

    public void init()
    {
        // create a WholePanel object and add it to the applet
        WholePanel wholePanel = new WholePanel();
        getContentPane().add(wholePanel);

        //set applet size to 400 X 400
        setSize (500, 500);
    }

}