import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeadlineJFrame {

	private JFrame frmPlanner;
	private String info;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public int vertTicker = 15;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
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
					DeadlineJFrame window = new DeadlineJFrame();
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
	public DeadlineJFrame() 
	{
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlanner = new JFrame();
		frmPlanner.setTitle("Deadlines Page");
		frmPlanner.setBounds(100, 100, 666, 379);
		frmPlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		JButton btnNewButton = new JButton("New Deadline");
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
						new JLabel("Assigment: "),
						description,
						new JLabel("Date Due: "),
						dateDue
				};
				int result = JOptionPane.showConfirmDialog(null, inputs, "New Assignment", JOptionPane.PLAIN_MESSAGE);
				if (result == JOptionPane.OK_OPTION) 
				{
					vertTicker = vertTicker + 35;

					textField = new JTextField();
					textField.setBounds(10, vertTicker, 86, 20);
					frmPlanner.getContentPane().add(textField);
					textField.setColumns(10);
					textField.setText(className.getText());
					textField.setEditable(false);
					textField.setFont(new Font("Tahoma", Font.BOLD, 8));
					
					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(108, vertTicker, 86, 20);
					frmPlanner.getContentPane().add(textField_1);
					textField_1.setText(description.getText());
					textField_1.setEditable(false);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 8));
					
					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(220, vertTicker, 86, 20);
					frmPlanner.getContentPane().add(textField_2);
					textField_2.setText(dateDue.getText());
					textField_2.setEditable(false);
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 8));
					

				
				} 
			}
		});

		frmPlanner.getContentPane().setLayout(null);
		frmPlanner.getContentPane().add(btnNewButton);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCourseName.setBounds(10, 11, 89, 23);
		frmPlanner.getContentPane().add(lblCourseName);

		JLabel lbldescription = new JLabel("Assignment");
		lbldescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldescription.setBounds(108, 11, 102, 23);
		frmPlanner.getContentPane().add(lbldescription);

		JLabel lbldateDue = new JLabel("Deadline");
		lbldateDue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldateDue.setBounds(220, 11, 70, 23);
		frmPlanner.getContentPane().add(lbldateDue);
		

	}
	
}
