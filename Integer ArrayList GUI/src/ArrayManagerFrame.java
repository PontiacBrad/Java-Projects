import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This class sets up a GUI for an ArrayList program
 * @author Bradley
 *
 */
public class ArrayManagerFrame extends JFrame
{
	static ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
	static int arrayListSize = 0;
	static final int WIDTH = 725;
	static final int HEIGHT = 520;
	static final int LOCATION_X = 425;
	static final int LOCATION_Y = 175;
	JPanel panel;
	JPanel inputPanel;
	static JPanel headerPanel;
	static JTextField inputField;
	static JTextField inputField2;
	static JTextArea outputArea;
	static JLabel instruction;
	
	/**
	 * Constructs an ArrayManagerFrame with a set size and location on the screen
	 */
	public ArrayManagerFrame()
	{
		setSize(WIDTH, HEIGHT);
		setLocation(LOCATION_X, LOCATION_Y);
		add(setUpPanel());
	}
	/**
	 * This method creates the main frame panel
	 * @return The completed panel
	 */
	Component setUpPanel()
	{
		panel = new JPanel();
		panel.setLayout(new BorderLayout()); 
		headerPanel = new JPanel();
		instruction = new JLabel("Please click the command you wish to perform.");
		headerPanel.add(instruction);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 2));
		JPanel basicButtonPanel = new JPanel();
		basicButtonPanel.setLayout(new GridLayout(3, 2));
		basicButtonPanel.add(createAddButton("Add"));
		basicButtonPanel.add(createUpdateButton("Update"));
		basicButtonPanel.add(createDeleteButton("Delete"));
		basicButtonPanel.add(createDropButton("Drop"));
		basicButtonPanel.add(createResizeButton("Resize"));
		basicButtonPanel.add(createRemoveDuplicatesButton("Remove Duplicates"));
		buttonPanel.add(basicButtonPanel);
		JPanel advancedButtonPanel = new JPanel();
		advancedButtonPanel.setLayout(new GridLayout(3, 1));
		JPanel deletePanel = new JPanel();
		deletePanel.setLayout(new GridLayout(1, 2));
		deletePanel.add(createDeleteMaxButton("Delete Max"));
		deletePanel.add(createDeleteMinButton("Delete Min"));
		JPanel movePanel = new JPanel();
		movePanel.setLayout(new GridLayout(1, 2));
		movePanel.add(createMoveMaxButton("Move Max"));
		movePanel.add(createMoveMinButton("Move Min"));
		advancedButtonPanel.add(deletePanel);
		advancedButtonPanel.add(movePanel);
		advancedButtonPanel.add(createEndButton("End"));
		buttonPanel.add(advancedButtonPanel);
		JPanel outputPanel = new JPanel();
		outputPanel.setLayout(new BorderLayout());
		JLabel outputLabel = new JLabel("Current Array Contents");
		outputPanel.add(outputLabel, BorderLayout.NORTH);
		outputArea = new JTextArea();
		outputArea.setEditable(false);
		outputPanel.add(outputArea, BorderLayout.CENTER);
		panel.add(headerPanel, BorderLayout.NORTH);
		panel.add(buttonPanel, BorderLayout.WEST);
		panel.add(outputPanel, BorderLayout.EAST);
		inputPanel = new JPanel();
		inputPanel.add(new JLabel("Awaiting a command"));
		inputPanel.add(createTextField(), BorderLayout.SOUTH);
		inputPanel.add(new JButton("No Command"));
		panel.add(inputPanel, BorderLayout.SOUTH);
		Commands.resize(5);
		Commands.printArray();
		return panel;
	}
	/**
	 * This methods creates the ADD command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createAddButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				inputPanel.removeAll();
				inputPanel.add(new JLabel("Enter an integer"));
				inputPanel.add(createTextField(), BorderLayout.SOUTH);
				inputPanel.add(createApplyAddButton("Add"));
				inputPanel.revalidate();
				inputPanel.repaint();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the UPDATW command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createUpdateButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				inputPanel.removeAll();
				inputPanel.add(new JLabel("Enter the integer to replace"));
				inputPanel.add(createTextField(), BorderLayout.SOUTH);
				inputPanel.add(new JLabel("Enter an integer to add"));
				inputField2 = new JTextField(10);
				inputPanel.add(inputField2, BorderLayout.SOUTH);
				inputPanel.add(createApplyUpdateButton("Update"));
				inputPanel.revalidate();
				inputPanel.repaint();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the DELETE command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createDeleteButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				inputPanel.removeAll();
				inputPanel.add(new JLabel("Enter the integer"));
				inputPanel.add(createTextField(), BorderLayout.SOUTH);
				inputPanel.add(createApplyDeleteButton("Delete"));
				inputPanel.revalidate();
				inputPanel.repaint();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the DROP command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createDropButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				inputPanel.removeAll();
				inputPanel.add(new JLabel("Enter the index"));
				inputPanel.add(createTextField(), BorderLayout.SOUTH);
				inputPanel.add(createApplyDropButton("Drop"));
				inputPanel.revalidate();
				inputPanel.repaint();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the RESIZE command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createResizeButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				inputPanel.removeAll();
				inputPanel.add(new JLabel("Enter an integer"));
				inputPanel.add(createTextField(), BorderLayout.SOUTH);
				inputPanel.add(createApplyResizeButton("Resize"));
				inputPanel.revalidate();
				inputPanel.repaint();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the REMOVEDUPLICATES command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createRemoveDuplicatesButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.removeDuplicates();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the DELETEMAX command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createDeleteMaxButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.dlMax();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the DELETEMIN command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createDeleteMinButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.dlMin();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the MOVEMAX command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createMoveMaxButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.movMax();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the MOVEMIN command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createMoveMinButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.movMin();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the END command button
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createEndButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				Commands.end();
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the button to apply the ADD command
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createApplyAddButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				int number = Integer.valueOf(inputField.getText());
				Commands.add(number);
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the button to apply the UPDATE command
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createApplyUpdateButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				int number = Integer.valueOf(inputField.getText());
				int number2 = Integer.valueOf(inputField2.getText());
				Commands.update(number, number2);
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the button to apply the DELETE command
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createApplyDeleteButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				int number = Integer.valueOf(inputField.getText());
				Commands.delete(number);
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the button to apply the DROP command
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createApplyDropButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				int number = Integer.valueOf(inputField.getText());
				Commands.drop(number);
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the button to apply the RESIZE command
	 * @param name The name of the button
	 * @return The completed button
	 */
	Component createApplyResizeButton(String name) 
	{
		class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event) 
			{
				int number = Integer.valueOf(inputField.getText());
				Commands.resize(number);
			}
		}
		JButton button = new JButton(name);
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		return button;
	}
	/**
	 * This method creates the main text field
	 * @return The completed TextField
	 */
	static Component createTextField()
	{
		inputField = new JTextField(10);
		return inputField;
	}
	/**
	 * This method resets the header panel to default
	 * @param label The label to set header panel too
	 */
	static void resetHeaderPanel(String label)
	{
		headerPanel.removeAll();
		instruction = new JLabel(label);
		headerPanel.add(instruction);
		headerPanel.revalidate();
		headerPanel.repaint();
	}
	/**
	 * This method restes the output area to default
	 */
	static void resetOutputArea()
	{
		Commands.printArray();
		outputArea.revalidate();
		outputArea.repaint();
	}
}