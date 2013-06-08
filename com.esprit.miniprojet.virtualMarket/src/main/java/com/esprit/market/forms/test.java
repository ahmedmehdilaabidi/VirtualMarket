package com.esprit.market.forms;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;

public class test {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test window = new test();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(684, 300);
		shell.setText("SWT Application");
		shell.setLayout(new org.eclipse.swt.layout.FormLayout());
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmManageRoom = new MenuItem(menu, SWT.CASCADE);
		mntmManageRoom.setText("Manage Room");
		
		Menu menu_1 = new Menu(mntmManageRoom);
		mntmManageRoom.setMenu(menu_1);
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmNewItem = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem.setText("new");
		
		MenuItem mntmUpdate = new MenuItem(menu_1, SWT.NONE);
		mntmUpdate.setText("update");
		
		MenuItem mntmDelete = new MenuItem(menu_1, SWT.NONE);
		mntmDelete.setText("delete");
		
		MenuItem mntmShowAll = new MenuItem(menu_1, SWT.NONE);
		mntmShowAll.setText("show All");
		
		MenuItem mntmSearch = new MenuItem(menu_1, SWT.NONE);
		mntmSearch.setText("Search");
		
		MenuItem mntmManageMarket = new MenuItem(menu, SWT.CASCADE);
		mntmManageMarket.setText("Manage Market");
		
		Menu menu_2 = new Menu(mntmManageMarket);
		mntmManageMarket.setMenu(menu_2);
		
		MenuItem mntmManageProduct = new MenuItem(menu, SWT.CASCADE);
		mntmManageProduct.setText("Manage Product");
		
		Menu menu_3 = new Menu(mntmManageProduct);
		mntmManageProduct.setMenu(menu_3);
		
		MenuItem mntmAdvancedSettings = new MenuItem(menu, SWT.CASCADE);
		mntmAdvancedSettings.setText("Advanced Settings");
		
		Menu menu_4 = new Menu(mntmAdvancedSettings);
		mntmAdvancedSettings.setMenu(menu_4);
		
		
		mntmNewItem.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				// Handle the selection event
				new RoomForm().open();
			}

		});


	}
}
