package com.esprit.market.forms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

import com.esprit.market.domain.Market;
import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarketDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtid;
	private JTextField txtName;
	private JTextField txtLocation;
	
	private JTextField txtdesc;
	MarketDao market=new MarketDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MarketDialog dialog = new MarketDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MarketDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblId = new JLabel("id");
		JLabel lblNameOfMarket = new JLabel("Name of Market:");
		JLabel lblLocationOfMarket = new JLabel("Location of Market:");
		JLabel lblDescription = new JLabel("Description:");
		txtid = new JTextField();
		txtid.setColumns(10);
		txtName = new JTextField();
		txtName.setColumns(10);
		txtLocation = new JTextField();
		txtLocation.setColumns(10);
		
		txtdesc = new JTextField();
		txtdesc.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNameOfMarket)
						.addComponent(lblLocationOfMarket)
						.addComponent(lblId)
						.addComponent(lblDescription))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtdesc, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(txtid, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(txtLocation, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(txtName, 202, 202, Short.MAX_VALUE))
					.addGap(101))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNameOfMarket)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocationOfMarket)
						.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescription)
						.addComponent(txtdesc, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						Market m=new Market();
						int id = Integer.parseInt(txtid.getText()); 
						m.setIdMarket(id);
						m.setNameMarket(txtName.getText());
						m.setLocationMarket(txtLocation.getText());
						m.setDescriptionMarket(txtdesc.getText());
						market.updateMarket(m);
					}
				});
				okButton.setActionCommand("Save");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTxtid() {
		return txtid;
	}

	public void setTxtid(String txtid) {
		this.txtid.setText(txtid);
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(String txtName) {
		this.txtName.setText(txtName);
	}

	public JTextField getTxtLocation() {
		return txtLocation;
	}

	public void setTxtLocation(String txtLocation) {
		this.txtLocation.setText(txtLocation);
	}

	public JTextField getTxtdesc() {
		return txtdesc;
	}

	public void setTxtdesc(String txtdesc) {
		this.txtdesc.setText(txtdesc);
	}
}
