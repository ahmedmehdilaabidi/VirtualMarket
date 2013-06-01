package com.esprit.market.forms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class authenForms extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			authenForms dialog = new authenForms();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public authenForms() {
		setBounds(100, 100, 450, 300);
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.WEST);
		}
	}

}
