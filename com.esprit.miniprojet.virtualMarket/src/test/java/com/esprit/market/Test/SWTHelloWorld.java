package com.esprit.market.Test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.esprit.market.forms.AuthenForm;
import com.esprit.market.forms.MainMarketForm;
 
public class SWTHelloWorld {
 
public static void main (String [] args) {
	
	Display display = new Display ();
	Shell shell = new Shell(display);
	
//	AuthenForm a=new AuthenForm(shell,shell.getStyle());
//	a.open();
	
	MainMarketForm m=new MainMarketForm();
	m.open();
	
	
	
	
	
	
	
 
	
	
	


}
}