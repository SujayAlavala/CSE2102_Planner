import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

//test for sujay


public class PlannerMainJFrame {

	private JFrame frmPlanner;
	private String info;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public int vertTicker = 25;
	private JTextField textField_3;
	
	private AssignmentsJFrame assign;
	
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
					PlannerMainJFrame window = new PlannerMainJFrame();
					window.frmPlanner.setVisible(true); ///Use the for setting visible 
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
	public PlannerMainJFrame() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlanner = new JFrame();
		frmPlanner.setTitle("Planner");
		frmPlanner.setBounds(100, 100, 500, 300);
		frmPlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Add New Course");
		btnNewButton.setBounds(10, 227, 129, 23);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//anc.newScreen();
				JTextField className = new JTextField();
				JTextField teacherName = new JTextField();
				JTextField email = new JTextField();

				JTextField poop = new JTextField();
				final JComponent[] inputs = new JComponent[] {
						new JLabel("Class Name: "),
						className,
						new JLabel("Teacher: "),
						teacherName,
						new JLabel("Email: "),
						email
				};
				int result = JOptionPane.showConfirmDialog(null, inputs, "Add New Course", JOptionPane.PLAIN_MESSAGE);
				if (result == JOptionPane.OK_OPTION) 
				{
					vertTicker = vertTicker + 20;

					textField = new JTextField();
					textField.setBounds(50, vertTicker, 86, 20);
					frmPlanner.getContentPane().add(textField);
					textField.setColumns(10);
					textField.setText(className.getText());
					textField.setEditable(false);
					textField.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(185, vertTicker, 86, 20);
					frmPlanner.getContentPane().add(textField_1);
					textField_1.setText(teacherName.getText());
					textField_1.setEditable(false);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(310, vertTicker, 130, 20);
					frmPlanner.getContentPane().add(textField_2);
					textField_2.setText(email.getText());
					textField_2.setEditable(false);
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 8));

				} 

			}
		});

		frmPlanner.getContentPane().setLayout(null);
		frmPlanner.getContentPane().add(btnNewButton);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCourseName.setBounds(50, 11, 89, 14);
		frmPlanner.getContentPane().add(lblCourseName);

		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTeacher.setBounds(199, 11, 58, 14);
		frmPlanner.getContentPane().add(lblTeacher);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(351, 11, 37, 14);
		frmPlanner.getContentPane().add(lblEmail);

		JButton btnAssignments = new JButton("Assignments");
		btnAssignments.addMouseListener(new MouseAdapter()
				{
			public void mouseClicked(MouseEvent arg0)
			{
				assign.main(null);
			}
				});
		btnAssignments.setBounds(385,227,89,23);
		frmPlanner.getContentPane().add(btnAssignments);



	}
}
