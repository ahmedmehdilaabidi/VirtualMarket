package com.esprit.market.Test;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.esprit.market.domain.Market;
import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;

public class TestJtable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	
	
	
	MarketDao market=new MarketDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJtable frame = new TestJtable();
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
	public TestJtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 String[] colNames = {"col1", "col2", "col3","test"};
//	        Object[][] data = {
//	        {"blabla","hello","test"},
//	        {"sdfsdf","rtet","jhghjg"}
//	        };
	        
	        
	         
	        int i,j=0;
	        i=market.listMarket().size();
	        Object[][] data=new Object[i][4];
	        List<Market> l = market.listMarket();
	        System.out.println("la taille est:"+i);
	        
	        System.out.println("last  index:"+l.lastIndexOf(l));
	        for(Market m:market.listMarket())
	        {
	        	System.out.println(m.getIdMarket());
	        	
	        	data[j][0]=m.getIdMarket();
	        	data[j][1]=m.getNameMarket();
	        	data[j][2]=m.getLocationMarket();
	        	data[j][3]=m.getDescriptionMarket();
	        	j++;
	        	
	        }
	        
//	        for (int j = 0; j<sTeach1.size(); j++)
//            {
//                {
//                    SubjectTeacher myTeach = sTeach1.get(j);
//                     data[j][0] = myTeach.getName();
//                     data[j][1] = myTeach.getSurname();
//                     data[j][2] = myTeach.getID();
//                     data[j][3] = myTeach.getPay();
//                     data[j][4] = myTeach.getSubjectID();
//                };
//            }
	        
	        table = new JTable(data, colNames);
	        
		
		
		
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		
		
		
		
		
		
	}

}
