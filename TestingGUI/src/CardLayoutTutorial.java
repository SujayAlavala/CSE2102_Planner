import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CardLayoutTutorial 
{
	JFrame frmStudentPlanner = new JFrame("CardLayout demo");
	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JPanel panelThird = new JPanel();
	JButton buttonOne = new JButton("Assignments");
	JButton buttonSecond = new JButton("Planner");
	CardLayout cl = new CardLayout();
	private final JButton btnAddNewCourse = new JButton("Add New Course");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public int vertTicker = 25;
	public int vertTicker2 = 25;
	private JTextField textField_3;
	private final JLabel lblCourseName = new JLabel("Course Name");
	private final JLabel lblTeacher = new JLabel("Teacher");
	private final JLabel lblEmail = new JLabel("E-mail");
	private final JLabel lblCourseName_1 = new JLabel("Course Name");
	private final JLabel lblDescription = new JLabel("Description");
	private final JLabel lblDateDue = new JLabel("Date Due");
	private final JButton btnDeadlines = new JButton("Deadlines");
	private final JButton btnPlanner = new JButton("Planner ");
	private final JButton btnAssignments = new JButton("Assignments");
	private final JButton btnAddNewAssignment = new JButton("Add New Assignment");

	public CardLayoutTutorial() 
	{
		btnAssignments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				cl.show(panelCont, "2");
				cl.show(panelCont, "2");
				frmStudentPlanner.setSize(650, 400);
				frmStudentPlanner.setLocationRelativeTo(null);
				
			}
		});
		btnDeadlines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				cl.show(panelCont, "3");
				frmStudentPlanner.setSize(665, 435);
				frmStudentPlanner.setLocationRelativeTo(null);
			}
		});
		btnAddNewCourse.addMouseListener(new MouseAdapter() {
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
					panelFirst.add(textField);
					textField.setColumns(10);
					textField.setText(className.getText());
					textField.setEditable(false);
					textField.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(185, vertTicker, 86, 20);
					panelFirst.add(textField_1);
					textField_1.setText(teacherName.getText());
					textField_1.setEditable(false);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(310, vertTicker, 130, 20);
					panelFirst.add(textField_2);
					textField_2.setText(email.getText());
					textField_2.setEditable(false);
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 8));

				} 

			}
		});
		panelCont.setLayout(cl);
		buttonOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				cl.show(panelCont, "2");
				frmStudentPlanner.setSize(650, 400);
				frmStudentPlanner.setLocationRelativeTo(null);
				
			}
		});
		buttonSecond.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				cl.show(panelCont, "1");
				frmStudentPlanner.setSize(500, 331);
				frmStudentPlanner.setLocationRelativeTo(null);
			}
		});
		

		panelCont.add(panelFirst, "1");
		panelCont.add(panelThird, "3");
		GroupLayout gl_panelThird = new GroupLayout(panelThird);
		gl_panelThird.setHorizontalGroup(
			gl_panelThird.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelThird.createSequentialGroup()
					.addContainerGap(385, Short.MAX_VALUE)
					.addComponent(btnPlanner)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAssignments)
					.addContainerGap())
		);
		btnPlanner.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				cl.show(panelCont, "1");
				frmStudentPlanner.setSize(500, 331);
				frmStudentPlanner.setLocationRelativeTo(null);
			}
		});
		gl_panelThird.setVerticalGroup(
			gl_panelThird.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelThird.createSequentialGroup()
					.addContainerGap(258, Short.MAX_VALUE)
					.addGroup(gl_panelThird.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPlanner)
						.addComponent(btnAssignments))
					.addContainerGap())
		);
		panelThird.setLayout(gl_panelThird);
		GroupLayout gl_panelFirst = new GroupLayout(panelFirst);
		gl_panelFirst.setHorizontalGroup(
			gl_panelFirst.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelFirst.createSequentialGroup()
					.addGap(22)
					.addComponent(btnAddNewCourse)
					.addPreferredGap(ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
					.addComponent(buttonOne)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panelFirst.createSequentialGroup()
					.addGap(59)
					.addComponent(lblCourseName)
					.addGap(66)
					.addComponent(lblTeacher)
					.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
					.addComponent(lblEmail)
					.addGap(96))
		);
		gl_panelFirst.setVerticalGroup(
			gl_panelFirst.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelFirst.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panelFirst.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCourseName)
						.addComponent(lblEmail)
						.addComponent(lblTeacher))
					.addPreferredGap(ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
					.addGroup(gl_panelFirst.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonOne)
						.addComponent(btnAddNewCourse))
					.addContainerGap())
		);
		panelFirst.setLayout(gl_panelFirst);
		panelCont.add(panelSecond, "2");
		GroupLayout gl_panelSecond = new GroupLayout(panelSecond);
		gl_panelSecond.setHorizontalGroup(
			gl_panelSecond.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSecond.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSecond.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSecond.createSequentialGroup()
							.addComponent(lblCourseName_1)
							.addGap(138)
							.addComponent(lblDescription)
							.addPreferredGap(ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
							.addComponent(lblDateDue)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddNewAssignment))
						.addGroup(Alignment.TRAILING, gl_panelSecond.createSequentialGroup()
							.addComponent(buttonSecond)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeadlines)))
					.addContainerGap())
		);
		gl_panelSecond.setVerticalGroup(
			gl_panelSecond.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSecond.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSecond.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddNewAssignment)
						.addComponent(lblDateDue)
						.addComponent(lblDescription)
						.addComponent(lblCourseName_1))
					.addPreferredGap(ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
					.addGroup(gl_panelSecond.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonSecond)
						.addComponent(btnDeadlines))
					.addContainerGap())
		);
		btnAddNewAssignment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				JTextField className = new JTextField();
				JTextField description = new JTextField();
				JTextField dateDue = new JTextField();

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
					vertTicker2 = vertTicker2 + 35;

					textField = new JTextField();
					textField.setBounds(10, vertTicker2, 89, 14);
					panelSecond.add(textField);
					textField.setColumns(10);
					textField.setText(className.getText());
					textField.setEditable(false);
					textField.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(133, vertTicker2, 250, 30);
					panelSecond.add(textField_1);
					textField_1.setText(description.getText());
					textField_1.setEditable(false);
					textField_1.setFont(new Font("Tahoma", Font.BOLD, 8));

					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(404, vertTicker2, 70, 14);
					panelSecond.add(textField_2);
					textField_2.setText(dateDue.getText());
					textField_2.setEditable(false);
					textField_2.setFont(new Font("Tahoma", Font.BOLD, 8));

					JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Completed?");
					chckbxNewCheckBox_1.setBounds(500, vertTicker2, 97, 23);
					panelSecond.add(chckbxNewCheckBox_1);
					panelSecond.repaint();
					
			}
		}});
		panelSecond.setLayout(gl_panelSecond);
		cl.show(panelCont, "1");
		
				
		frmStudentPlanner.getContentPane().add(panelCont);
		frmStudentPlanner.setTitle("Student Planner");
			
		frmStudentPlanner.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStudentPlanner.setSize(500, 331);
		frmStudentPlanner.setLocationRelativeTo(null);	
		frmStudentPlanner.setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
			public void run() {
				new CardLayoutTutorial();
			}
		});
	}
}