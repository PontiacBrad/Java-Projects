import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * 
 * @author Bradley
 * This class combines the target and graphical user interface classes
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(0, 0, 0);
        target1.draw(g2);
    }
}