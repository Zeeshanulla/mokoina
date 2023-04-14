package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewCustomerDp;
	
	@FindBy(xpath = "//div[text()='+ New Customer' and @class='item createNewCustomer']")
	private WebElement newCustomerBt;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNameField;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescField;
	
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerFeild;
	
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectcustName;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBt;
	
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddNewCustomerDp() {
		return addNewCustomerDp;
	}
	public WebElement getNewCustomerBt() {
		return newCustomerBt;
	}
	public WebElement getCustomerNameField() {
		return CustomerNameField;
	}
	public WebElement getCustomerDescField() {
		return customerDescField;
	}
	public WebElement getSelectCustomerFeild() {
		return selectCustomerFeild;
	}
	public WebElement getSelectcustName() {
	return selectcustName;
	}
	public WebElement getCreateCustBt() {
		return createCustBt;
	}
	

}
