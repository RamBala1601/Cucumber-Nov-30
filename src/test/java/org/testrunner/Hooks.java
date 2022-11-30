package org.testrunner;

import java.awt.Window;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void precondition() {
		edgelaunch();
		windowMax();

	}
	@After
	public void postcondition() {
		closeChrome();

	}
	
	
		
		
		
		
	}


