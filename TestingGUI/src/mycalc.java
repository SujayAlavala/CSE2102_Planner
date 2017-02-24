import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.Box;

public class mycalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserInput;
	private JTextField txtAssignments;
	private JTextField txtHw;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JCheckBox chckbxDone;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_4;
	private JSeparator separator;
	private TextArea textArea;
	private JPopupMenu popupMenu;
	private final Action action = new SwingAction();
	private JMenuItem menuItem;
	private JLabel lblSup;
	private JTextField txtThisIsA;
	private JButton btnClickMe;
	private Box horizontalBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mycalc frame = new mycalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mycalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);
		
		lblSup = new JLabel("sup");
		popupMenu.add(lblSup);
		
		txtThisIsA = new JTextField();
		txtThisIsA.setText("this is a test text box");
		popupMenu.add(txtThisIsA);
		txtThisIsA.setColumns(10);
		
		btnClickMe = new JButton("click me");
		btnClickMe.setAction(action);
		btnClickMe.setForeground(Color.BLUE);
		btnClickMe.setBackground(Color.CYAN);
		popupMenu.add(btnClickMe);
		
		menuItem = popupMenu.add(action);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblClass = new JLabel("Class");
		GridBagConstraints gbc_lblClass = new GridBagConstraints();
		gbc_lblClass.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblClass.insets = new Insets(0, 0, 5, 5);
		gbc_lblClass.gridx = 0;
		gbc_lblClass.gridy = 0;
		contentPane.add(lblClass, gbc_lblClass);
		
		txtUserInput = new JTextField();
		txtUserInput.setText("User input");
		GridBagConstraints gbc_txtUserInput = new GridBagConstraints();
		gbc_txtUserInput.gridwidth = 3;
		gbc_txtUserInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUserInput.insets = new Insets(0, 0, 5, 5);
		gbc_txtUserInput.gridx = 1;
		gbc_txtUserInput.gridy = 0;
		contentPane.add(txtUserInput, gbc_txtUserInput);
		txtUserInput.setColumns(10);
		
		txtAssignments = new JTextField();
		txtAssignments.setText("assignments");
		GridBagConstraints gbc_txtAssignments = new GridBagConstraints();
		gbc_txtAssignments.gridwidth = 3;
		gbc_txtAssignments.insets = new Insets(0, 0, 5, 5);
		gbc_txtAssignments.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAssignments.gridx = 1;
		gbc_txtAssignments.gridy = 1;
		contentPane.add(txtAssignments, gbc_txtAssignments);
		txtAssignments.setColumns(10);
		
		checkBox = new JCheckBox("Done?");
		GridBagConstraints gbc_checkBox = new GridBagConstraints();
		gbc_checkBox.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox.gridx = 4;
		gbc_checkBox.gridy = 1;
		contentPane.add(checkBox, gbc_checkBox);
		
		txtHw = new JTextField();
		txtHw.setText("hw");
		GridBagConstraints gbc_txtHw = new GridBagConstraints();
		gbc_txtHw.gridwidth = 3;
		gbc_txtHw.insets = new Insets(0, 0, 5, 5);
		gbc_txtHw.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHw.gridx = 1;
		gbc_txtHw.gridy = 2;
		contentPane.add(txtHw, gbc_txtHw);
		txtHw.setColumns(10);
		
		checkBox_1 = new JCheckBox("Done?");
		GridBagConstraints gbc_checkBox_1 = new GridBagConstraints();
		gbc_checkBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_1.gridx = 4;
		gbc_checkBox_1.gridy = 2;
		contentPane.add(checkBox_1, gbc_checkBox_1);
		
		horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.anchor = GridBagConstraints.EAST;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 3;
		contentPane.add(horizontalBox, gbc_horizontalBox);
		
		textArea = new TextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(50, 0, 50, 5);
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 4;
		contentPane.add(textArea, gbc_textArea);
		
		JLabel label_2 = new JLabel("Class test");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 5;
		contentPane.add(label_2, gbc_label_2);
		
		textField_4 = new JTextField();
		textField_4.setText("User input");
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		contentPane.add(textField_4, gbc_textField_4);
		
		textField_3 = new JTextField();
		textField_3.setText("assignments");
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		contentPane.add(textField_3, gbc_textField_3);
		
		checkBox_2 = new JCheckBox("Done?");
		GridBagConstraints gbc_checkBox_2 = new GridBagConstraints();
		gbc_checkBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_2.gridx = 3;
		gbc_checkBox_2.gridy = 6;
		contentPane.add(checkBox_2, gbc_checkBox_2);
		
		textField = new JTextField();
		textField.setText("hw");
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 7;
		contentPane.add(textField, gbc_textField);
		
		checkBox_3 = new JCheckBox("Done?");
		checkBox_3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		GridBagConstraints gbc_checkBox_3 = new GridBagConstraints();
		gbc_checkBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_3.gridx = 3;
		gbc_checkBox_3.gridy = 7;
		contentPane.add(checkBox_3, gbc_checkBox_3);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 8;
		contentPane.add(separator, gbc_separator);
		
		JLabel label = new JLabel("Class");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 10;
		contentPane.add(label, gbc_label);
		
		textField_5 = new JTextField();
		textField_5.setText("User input");
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 10;
		contentPane.add(textField_5, gbc_textField_5);
		
		textField_2 = new JTextField();
		textField_2.setText("assignments");
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 11;
		contentPane.add(textField_2, gbc_textField_2);
		
		checkBox_4 = new JCheckBox("Done?");
		GridBagConstraints gbc_checkBox_4 = new GridBagConstraints();
		gbc_checkBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_4.gridx = 3;
		gbc_checkBox_4.gridy = 11;
		contentPane.add(checkBox_4, gbc_checkBox_4);
		
		textField_1 = new JTextField();
		textField_1.setText("hw");
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 12;
		contentPane.add(textField_1, gbc_textField_1);
		
		chckbxDone = new JCheckBox("Done?");
		GridBagConstraints gbc_chckbxDone = new GridBagConstraints();
		gbc_chckbxDone.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxDone.gridx = 3;
		gbc_chckbxDone.gridy = 12;
		contentPane.add(chckbxDone, gbc_chckbxDone);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
