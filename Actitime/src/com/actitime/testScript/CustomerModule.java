package com.actitime.testScript;


import java.io.IOException;


import org.testng.Reporter;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

 
public class CustomerModule extends BaseClass {

	@Test
	public void TestCreateCustomer() throws IOException, InterruptedException
	{
		Reporter.log("TestCreateCustomer",true);
		FileLib f=new FileLib();
		String custname = f.getExcelData("CreateCustomer",1,3);
		String custdesc = f.getExcelData("CreateCustomer", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		
		TaskListPage tlp=new TaskListPage(driver);
		tlp.getAddNewCustomerDp().click();
		tlp.getNewCustomerBt().click();
		tlp.getCustomerNameField().sendKeys(custname);	
		tlp.getCustomerDescField().sendKeys(custdesc);
		tlp.getSelectCustomerFeild().click();
		tlp.getSelectcustName().click();
		tlp.getCreateCustBt().click();
		Thread.sleep(4000);
	
	}
}
