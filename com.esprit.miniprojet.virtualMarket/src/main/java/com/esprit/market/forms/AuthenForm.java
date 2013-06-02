package com.esprit.market.forms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class AuthenForm extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Create the dialog.
	 * 
	 * @param parent
	 * @param style
	 */
	public AuthenForm(Shell parent, int style) {
		super(parent, style);
		setText("Authentication");
	}

	/**
	 * Open the dialog.
	 * 
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(450, 300);
		shell.setText(getText());

		Label lblLogin = new Label(shell, SWT.NONE);
		lblLogin.setBounds(62, 71, 70, 17);
		lblLogin.setText("login:");

		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(62, 122, 70, 17);
		lblPassword.setText("password:");

		text = new Text(shell, SWT.BORDER);
		text.setBounds(151, 71, 162, 27);

		text_1 = new Text(shell, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(151, 122, 162, 27);

		Button btnConnect = new Button(shell, SWT.PUSH);
		btnConnect.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				// Handle the selection event
				System.out.println("Called!");
			}

		});

		btnConnect.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnConnect.setBounds(101, 194, 91, 29);
		btnConnect.setText("Connect");

		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.setBounds(221, 194, 91, 29);
		btnReset.setText("Reset");

	}
}
