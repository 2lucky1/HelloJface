package com.muntian;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class HelloJface extends ApplicationWindow {

	public HelloJface() {
		super(null);
	}
	
	protected Control createContents(Composite parent) {
		Label label = new Label(parent, SWT.CENTER);
		label.setText("Hello World");
		parent.pack();
		return parent;
	}

	public static void main(String[] args) {
		HelloJface awin = new HelloJface();
		awin.setBlockOnOpen(true);
		awin.open();
		Display.getCurrent().dispose();
	}

}
