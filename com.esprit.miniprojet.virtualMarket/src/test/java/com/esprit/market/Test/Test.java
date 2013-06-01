package com.esprit.market.Test;

import com.esprit.market.domain.User;
import com.esprit.market.forms.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Test {

	
	
	@org.junit.Test
	public void testForm()
	{
		
		
		Display display = new Display ();
		Shell shell = new Shell(display);
	 
		Text helloWorldTest = new Text(shell, SWT.NONE);
		helloWorldTest.setText("Hello World SWT");
		helloWorldTest.pack();
	 
		shell.pack();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
		
	}

}
