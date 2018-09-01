package com.scp.app.login.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.scp.app.constants.AppConstants;
import com.scp.app.constants.AppConstants.BrowserNames;
import com.scp.app.util.AppUtil;
import com.scp.app.web.pageobjects.OrangeHRMLogin;

public class OrangeHRMLoginTest {


	
	public static void main(String[] args) {
		WebDriver driver = AppUtil.initializeBrowser(BrowserNames.Firefox, AppConstants.ORANGE_HRM_APP_URL);
		OrangeHRMLogin page = PageFactory.initElements(driver, OrangeHRMLogin.class);
		page.enterUserName("Admin");
		page.enterPassword("admin123");
		page.clickLoginWithSuccess();
		
	}
	
	
	
	
}