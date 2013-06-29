package com.esprit.market.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.esprit.market.domain.Market;
import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ShowMarketForm extends JFrame {

	private JPanel contentPane;
	public JTable table;
	MarketDao market = new MarketDaoImpl();
	private JButton btnUpd;
	private JButton btnDelete;
	private JTextField txtSearch;

	public JTable getTable() {
		String[] colNames = { "col1", "col2", "col3", "test" };

		int i, j = 0;
		i = market.listMarket().size();
		Object[][] data = new Object[i][4];
		List<Market> l = market.listMarket();
		System.out.println("la taille est:" + i);

		System.out.println("last  index:" + l.lastIndexOf(l));
		for (Market m : market.listMarket()) {
			System.out.println(m.getIdMarket());

			data[j][0] = m.getIdMarket();
			data[j][1] = m.getNameMarket();
			data[j][2] = m.getLocationMarket();
			data[j][3] = m.getDescriptionMarket();
			j++;

		}

		table = new JTable(data, colNames);

		return this.table;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowMarketForm frame = new ShowMarketForm();
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
	public ShowMarketForm() {
		setTitle("List Of Market\r\n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblListOfMarket = new JLabel("List Of Market");

		JScrollPane scrollPane = new JScrollPane();

		btnUpd = new JButton("Update");
		btnUpd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int id = (Integer) table.getValueAt(table.getSelectedRow(), 0);
				String name=(String)table.getValueAt(table.getSelectedRow(),1);
				String location=(String)table.getValueAt(table.getSelectedRow(),2);
				String description=(String)table.getValueAt(table.getSelectedRow(),3);
				
			  MarketDialog md=new MarketDialog();
			  md.setTxtid((Integer) table.getValueAt(table.getSelectedRow(), 0)+"");
			  md.setTxtName(table.getValueAt(table.getSelectedRow(), 1)+"");
			  md.setTxtLocation(table.getValueAt(table.getSelectedRow(), 2)+"");
			  md.setTxtdesc(table.getValueAt(table.getSelectedRow(), 3)+"");
			  
			  md.setVisible(true);
				
//				
//				System.out.println("id:"+id);
//				System.out.println("name:"+name);
//				System.out.println("location:"+location);
//				System.out.println("description:"+description);
				
				
			}
		});

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteMarket();

			}

			private void deleteMarket() {

				int response = JOptionPane.showConfirmDialog(null,
						"whould you Like delete this Market", "Delete Market",
						JOptionPane.YES_NO_OPTION);
				int id = (Integer) table.getValueAt(table.getSelectedRow(), 0);
				Market m = new Market();
				m.setIdMarket(id);
				try {
					market.deleteMarket(m);

					table.repaint();

					System.out.println("delete with success");
				} catch (Exception e) {
					System.out.println("error !!");
				}

			}
		});
		
		JLabel lblEnterNameMarket = new JLabel("enter Name Market:");
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				DefaultTableModel model =(DefaultTableModel)table.getModel(); 
//				model.removeRow(2); 
				//recherche market with name
				DefaultTableModel df=new DefaultTableModel();
				
				Market m1=new Market();
				int id = Integer.parseInt(txtSearch.getText()); 
				m1=market.listMarketById(id);
				int i, j = 0;
				i = market.listMarket().size();
				Object[][] data = new Object[1][4];
				String[] colNames = new String[] { "col1", "col2", "col3", "test" };
				List<Market> l = market.listMarket();
				// System.out.println("la taille est:"+i);
				//
				// System.out.println("last  index:"+l.lastIndexOf(l));
				

					 data[0][0]= m1.getIdMarket();
					data[0][1] = m1.getNameMarket();
					data[0][2] = m1.getLocationMarket();
					data[0][3] = m1.getDescriptionMarket();
				
					df.setValueAt(data[0][0],0,0);
					df.setValueAt(data[0][1],0,1);
					df.setValueAt(data[0][2],0,2);
					df.setValueAt(data[0][3],0,3);
				table = new JTable(data, colNames);
				
				
				
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblEnterNameMarket)
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSearch)
							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
							.addComponent(lblListOfMarket, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(236, Short.MAX_VALUE)
					.addComponent(btnUpd)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDelete)
					.addGap(52))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblListOfMarket)
						.addComponent(lblEnterNameMarket)
						.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUpd)
						.addComponent(btnDelete)))
		);

	String[] colNames = new String[] { "col1", "col2", "col3", "test" };

		int i, j = 0;
		i = market.listMarket().size();
		Object[][] data = new Object[i][4];
		List<Market> l = market.listMarket();
		// System.out.println("la taille est:"+i);
		//
		// System.out.println("last  index:"+l.lastIndexOf(l));
		for (Market m : market.listMarket()) {
			System.out.println(m.getIdMarket());

			data[j][0] = m.getIdMarket();
			data[j][1] = m.getNameMarket();
			data[j][2] = m.getLocationMarket();
			data[j][3] = m.getDescriptionMarket();
			j++;

		}

		table = new JTable(data, colNames);

		scrollPane.setColumnHeaderView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
