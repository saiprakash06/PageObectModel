package com.util;

import com.base.Base;

public class TestUtil extends Base{
	
	public static final long PAGE_LOAD_TIMEOUT=50;
	public static final long IMPLICIT_WAIT=20;
	
	public void swithToFrame() {
		
		driver.switchTo().frame("mainpanel");
		
	}
	

}
