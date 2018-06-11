/**
 * Bradley Gray
 * 10-17-15
 * This program constructs an integer array list that can be modified with the following commands: add, update, delete, drop, resize, end, remove duplicates, delete max, delete minimum, move max, move minimum.
 */
import javax.swing.*;

public class Main extends JFrame
{
	public static void main(String args[])
	{
		JFrame frame = new ArrayManagerFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Array List Manager");
		frame.setVisible(true);
	}
}	