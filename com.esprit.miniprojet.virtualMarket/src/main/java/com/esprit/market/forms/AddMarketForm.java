package com.esprit.market.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;

import com.esprit.market.domain.Market;
import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMarketForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtLocation;
	private JLabel lblDescriptionOfMarket;
	private JTextArea txtDescription;
	
	MarketDao marketDao=new MarketDaoImpl();
	Market market=new Market();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMarketForm frame = new AddMarketForm();
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
	public AddMarketForm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Add new Market"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNameOfMarket = new JLabel("Name of Market");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		JLabel lblLocationOfMarket = new JLabel("Location of Market");
		
		txtLocation = new JTextField();
		txtLocation.setColumns(10);
		
		lblDescriptionOfMarket = new JLabel("Description of Market");
		
		txtDescription = new JTextArea();
		
		JButton btnAddMarket = new JButton("Add Market");
		btnAddMarket.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				market.setNameMarket(txtName.getText());
				market.setLocationMarket(txtLocation.getText());
				market.setDescriptionMarket(txtDescription.getText());
			
				marketDao.addMarket(market);
				
				
				txtName.setText("");
				txtLocation.setText("");
				txtDescription.setText("");
				
				System.out.println("ajout avec succes d'un nouveau Market");
				
				
			}
		});
		
		JButton btnReset = new JButton("Reset");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescriptionOfMarket)
						.addComponent(lblLocationOfMarket)
						.addComponent(lblNameOfMarket))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(btnAddMarket)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReset)
							.addGap(49))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescription)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLocation, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
							.addGap(56))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNameOfMarket)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLocationOfMarket)
						.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescriptionOfMarket)
						.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddMarket)
						.addComponent(btnReset))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
