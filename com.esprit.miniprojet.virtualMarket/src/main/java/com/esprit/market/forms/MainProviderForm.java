package com.esprit.market.forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import com.esprit.market.technic.MailJframe;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainProviderForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProviderForm window = new MainProviderForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainProviderForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println("gggg");
			}
		});
		frame.setBounds(100, 100, 486, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 262, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnManageMarket = new JMenu("Manage Market");
		menuBar.add(mnManageMarket);
		
		JMenuItem mntmAddMarket = new JMenuItem("Add Market");
		mntmAddMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AddMarketForm().setVisible(true);
			}
		});
		mnManageMarket.add(mntmAddMarket);
		
		JMenuItem mntmShowMarket = new JMenuItem("Show Market");
		mntmShowMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShowMarketForm().setVisible(true);
			}
		});
		mnManageMarket.add(mntmShowMarket);
		
		JMenu mnManageRoom = new JMenu("Manage Room");
		menuBar.add(mnManageRoom);
		
		JMenuItem mntmAddRoom = new JMenuItem("Add Room");
		mnManageRoom.add(mntmAddRoom);
		
		JMenuItem mntmShowRoom = new JMenuItem("Show Room");
		mnManageRoom.add(mntmShowRoom);
		
		JMenu mnManageProduct = new JMenu("Manage Product");
		menuBar.add(mnManageProduct);
		
		JMenuItem mntmAddProduct = new JMenuItem("Add Product");
		mnManageProduct.add(mntmAddProduct);
		
		JMenuItem mntmShowProduct = new JMenuItem("Show Product");
		mnManageProduct.add(mntmShowProduct);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmStatictics = new JMenuItem("Statictics");
		mnOptions.add(mntmStatictics);
		
		JMenuItem mntmSendMail = new JMenuItem("Send Mail");
		mntmSendMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MailJframe().setVisible(true);
			
			}
		});
		mnOptions.add(mntmSendMail);
		
		JMenuItem mntmGenerateReport = new JMenuItem("Generate Report");
		mnOptions.add(mntmGenerateReport);
	}

}
