package com.QA.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.QA.TestBase.TestBase;

public class Utilities extends TestBase {
	
	public void TakeScreenShot(String CS) throws IOException {
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\parim\\eclipse-workspace\\Amazon_FrameWork\\src\\main\\java\\screenshots\\"+CS+".png");
		FileHandler.copy(src, des);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
