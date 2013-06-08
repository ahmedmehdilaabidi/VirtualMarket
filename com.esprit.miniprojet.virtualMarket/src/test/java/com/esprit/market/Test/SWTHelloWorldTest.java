package com.esprit.market.Test;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.esprit.market.forms.AuthenForm;

 
public class SWTHelloWorldTest {
 
public static void main (String [] args) {
	
	Display display = new Display ();
	Shell shell = new Shell(display);
	
	AuthenForm a=new AuthenForm(shell,shell.getStyle());
	a.open();
	
//	MainMarketForm m=new MainMarketForm();
//	m.open();
	

	

	
	
	
	
	
	
 
	
	
	


}
}