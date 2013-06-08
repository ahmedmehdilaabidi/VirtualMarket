package com.esprit.market.forms;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import com.esprit.market.domain.Room;
import com.esprit.market.serviceImpl.RoomDaoImpl;

public class RoomForm {

	protected Shell shell;
	private Text text;
	private Text text_1;
	
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			RoomForm window = new RoomForm();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblNameRoom = new Label(shell, SWT.NONE);
		lblNameRoom.setBounds(10, 51, 83, 17);
		lblNameRoom.setText("Name Room");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(113, 41, 244, 27);
		
		Label lblDescription = new Label(shell, SWT.NONE);
		lblDescription.setBounds(10, 113, 90, 17);
		lblDescription.setText("Description");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(119, 113, 238, 27);
		
		
		Button btnAddRoom = new Button(shell, SWT.NONE);
		btnAddRoom.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				Room r=new Room();
				RoomDaoImpl room = new RoomDaoImpl();
				r.setNameRoom(text.getText());
				r.setDesctiptionRoom(text_1.getText());
				text.setText("");
				text_1.setText("");

			room.addRoom(r);	
				
			}
		});
		btnAddRoom.setBounds(112, 188, 91, 29);
		btnAddRoom.setText("add Room");
		
		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.setBounds(234, 188, 91, 29);
		btnReset.setText("Reset");

	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public Text getText_1() {
		return text_1;
	}

	public void setText_1(Text text_1) {
		this.text_1 = text_1;
	}
}
