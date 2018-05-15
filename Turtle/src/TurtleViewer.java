/*
 * Bradley Gray
 * Version 5-8-2015
 * Requirements: This program shall
 * 					have a Turtle class
 * 					use methods from the provided table to create a square method (public void square(int lengthOfSide)
 * Design: Three classes
 * 			TurtleViewer - to display the frame also has main method
 * 			Turtle - to create the methods including the constructor, draw, up, down, left, right, and square
 * 			TurtleComponent - to piece together the turtle to draw
 */
import javax.swing.JFrame;
import java.util.Scanner;

public class TurtleViewer 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setSize(810, 600);
		frame.setTitle("Turtle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TurtleComponent component = new TurtleComponent();
		frame.add(component);
		frame.setVisible(true);
		Turtle.square(100);
		System.out.println("Enter a number: 1 for up, 2 for down, 3 for left, 4 for right");
		
		while(in.hasNextInt() == true)
		{   
			int command = in.nextInt();
			
			if(command == 1)
			{
				Turtle.up(100);
				TurtleComponent componentUp = new TurtleComponent();
				frame.add(componentUp);
				frame.repaint();
			}
			if(command == 2)
			{
				Turtle.down(100);
				TurtleComponent componentDown = new TurtleComponent();
				frame.add(componentDown);
				frame.repaint();
			}
			if(command == 3)
			{
				Turtle.left(100);
				TurtleComponent componentLeft = new TurtleComponent();
				frame.add(componentLeft);
				frame.repaint();
			}
			if(command == 4)
			{
				Turtle.right(100);
				TurtleComponent componentRight = new TurtleComponent();
				frame.add(componentRight);
				frame.repaint();
			}
		}
	}
}
/*
 * Test: Sample input: 1 1 1 4 4 
 * 			Output: the turtle moves as directed, up up up right right
 */
