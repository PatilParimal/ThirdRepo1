package com.QA.TestExecution;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.QA.PageLayer.PageLayer;
import com.QA.TestBase.TestBase;
import com.QA.Utilities.Utilities;

public class TestExecution extends TestBase {
	Utilities s = new Utilities();
	PageLayer p;
	@Test(priority = 1)
	public void SignIn() throws IOException {
		p = new PageLayer();
		p.ClickOnSignInButton();
		s.TakeScreenShot("SS1");
		
		p.InputUsername();
		s.TakeScreenShot("SS2");
		
		p.InputPassword();
		s.TakeScreenShot("SS3");
		
	}
	
	@Test(priority = 2)
	public void CheckLogo() throws IOException {
		p = new PageLayer();
		boolean f = p.CheckLogo();
		s.TakeScreenShot("SS4");
		Assert.assertEquals(f, true);
	}

}
