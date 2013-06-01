package com.esprit.market.forms;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class test extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public test(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public void open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	}

	/**
	 * Create contents of the dialog.
	 */
	public void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(450, 300);
		shell.setText(getText());
		
		Label lblLogin = new Label(shell, SWT.NONE);
		lblLogin.setBounds(21, 48, 70, 17);
		lblLogin.setText("login");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(21, 93, 70, 17);
		lblPassword.setText("password");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(108, 48, 175, 27);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(108, 83, 175, 27);
		
		Button btnConnect = new Button(shell, SWT.NONE);
		btnConnect.setBounds(108, 151, 91, 29);
		btnConnect.setText("connect");
		
		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.setBounds(213, 151, 70, 29);
		btnReset.setText("reset");

	}
}
