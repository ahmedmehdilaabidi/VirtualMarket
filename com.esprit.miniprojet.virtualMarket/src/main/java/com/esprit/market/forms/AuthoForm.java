/*
 * Created by JFormDesigner on Sat Jun 01 09:20:58 CET 2013
 */

package com.esprit.market.forms;

import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author ahmed laabidi
 */
public class AuthoForm extends JPanel {
	public AuthoForm() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - ahmed laabidi
		ResourceBundle bundle = ResourceBundle.getBundle("resourcesForms");
		label1 = new JLabel();
		textField1 = new JTextField();
		panel1 = new JPanel();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"6*(default, $lcgap), default",
			"7*(default, $lgap), default"));

		//---- label1 ----
		label1.setText(bundle.getString("AuthoForm.label1.text"));
		add(label1, CC.xy(5, 7));
		add(textField1, CC.xywh(7, 7, 5, 1));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"4*(default, $lcgap), default",
				"2*(default, $lgap), default"));
		}
		add(panel1, CC.xywh(11, 11, 1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - ahmed laabidi
	private JLabel label1;
	private JTextField textField1;
	private JPanel panel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
