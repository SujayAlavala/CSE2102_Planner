import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.Font;

//this is a test to see if thara can see this commit 

public class Assignments {

	private JFrame frmPlanner;
	private String info;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public int vertTicker = 25;
	private JTextField textField_3;
	public String getInfo()
	{
		return info;
	}
	public void setInfo(String info)
	{
		this.info = info;
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(62, 66, 46, 14);
		frmPlanner.getContentPane().add(lblNewLabel);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					Assignments window = new Assignments();
					window.frmPlanner.setVisible(true);
					window.frmPlanner.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignments() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlanner = new JFrame();
		frmPlanner.setTitle("Planner");
		frmPlanner.setBounds(100, 100, 666, 379);
		frmPlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("New Assignment");
		btnNewButton.setBounds(500, 9, 140, 23);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//anc.newScreen();
				JTextField className = new JTextField();
				JTextField description = new JTextField();
				JTextField dateDue = new JTextField();

				JTextField poop = new JTextField();
				final JComponent[] inputs = new JComponent[] {
						new JLabel("Class Name: "),
						className,
						new JLabel("Description: "),
						description,
						new JLabel("Date Due: "),
						dateDue
				};
				int result = JOptionPane.showConfirmDialog(null, inputs, "New Assignment", JOptionPane.PLAIN_MESSAGE);
				if (result == JOptionPane.OK_OPTION) 
				{
					vertTicker = vertTicker + 35;

					textField = new JTextField();
					textField.setBounds(10, vertTicker, 89, 14);
					frmPlanner.getContentPane().add(textField);
					textField.setColumns(10);
					textField.setText(className.getText());
					textField.setEditable(false);
					textField.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(133, vertTicker, 250, 30);
					frmPlanner.getContentPane().add(textField_1);
					textField_1.setText(description.getText());
					textField_1.setEditable(false);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(404, vertTicker, 70, 14);
					frmPlanner.getContentPane().add(textField_2);
					textField_2.setText(dateDue.getText());
					textField_2.setEditable(false);
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 8));
					
					JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Completed?");
					chckbxNewCheckBox_1.setBounds(500, vertTicker, 97, 23);
					frmPlanner.getContentPane().add(chckbxNewCheckBox_1);
				} 
			}
		});

		frmPlanner.getContentPane().setLayout(null);
		frmPlanner.getContentPane().add(btnNewButton);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCourseName.setBounds(10, 11, 89, 14);
		frmPlanner.getContentPane().add(lblCourseName);

		JLabel lbldescription = new JLabel("Description");
		lbldescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldescription.setBounds(133, 11, 102, 14);
		frmPlanner.getContentPane().add(lbldescription);

		JLabel lbldateDue = new JLabel("Date Due");
		lbldateDue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldateDue.setBounds(404, 11, 70, 14);
		frmPlanner.getContentPane().add(lbldateDue);
		
		
		JButton btnDeadlines = new JButton("Deadlines");
		btnDeadlines.setBounds(551, 306, 89, 23);
		frmPlanner.getContentPane().add(btnDeadlines);
		
		JButton btnMain = new JButton("Main");
		btnMain.setBounds(452, 306, 89, 23);
		frmPlanner.getContentPane().add(btnMain);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(292, 166, 29, 20);
		frmPlanner.getContentPane().add(spinner);


	}
}
