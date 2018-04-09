import javax.swing.JFrame;
/*
 * Bradley Gray
 * Version 2-3-14
 * Requirements: This program shall
 *      1. draw a target as a set of concentric rings
 *      2. fill them in alternating black and white
 *      3. be composed of three classes Target TargetComponent and TargetViewer
 * Design: Three classes as per requirements with methods to draw ellipses
 *          based on rectangle and car example from book
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TargetComponent component = new TargetComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
/*
 * Test: The program displays five rings in alternating black and white colors 
 *          adherring to the requirements. It looks like a target. 
 */
