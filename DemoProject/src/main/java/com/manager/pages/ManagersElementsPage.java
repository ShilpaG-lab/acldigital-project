package com.manager.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.base;

public class ManagersElementsPage extends base {

	public ManagersElementsPage() {

		PageFactory.initElements(driver, this);

	}

	//// label[text()='First Name :']/child::input[1]

	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	WebElement managerlinkchoose;

	@FindBy(xpath = "//button[@ng-click='addCust()']")
	WebElement addCustlink;

	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fname;

	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lname;

	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement postalCode;

	@FindBy(xpath = "//button[text()='Add Customer']")
	WebElement addCustSubmit;

	// ************For Open Account**********
	@FindBy(xpath = "//button[@ng-click='openAccount()']")
	WebElement openLink;

	@FindBy(id = "userSelect")
	WebElement custName;

	@FindBy(id = "currency")
	WebElement custCurrency;

	@FindBy(xpath = "//button[text()='Process']")
	WebElement processBtn;

	// ************Methods for page To add cust*******
	public void mangerLink() {
		managerlinkchoose.click();
	}

	public void mangerCustAdding() {
		addCustlink.click();

	}

	public String inputsonAddCust(String namef, String namel, String pcode) {
		fname.sendKeys(namef);
		lname.sendKeys(namel);
		postalCode.sendKeys(pcode);

		return namef + " " + namel;
	}

	public void addLink() {
		addCustSubmit.click();
	}

	public void alertPopup() {
		driver.switchTo().alert().accept();
	}

	// *************to Open Account******

	public void openCustomer() {
		openLink.click();
	}

	public void chooseName(String name) {

		// WebElement choosename=driver.findElement(By.id("currency"));
		custName.click();

		Select selname = new Select(custName);
		// selname.selectByValue(name);
		selname.selectByVisibleText(name);
	}

	public void curreyCheck() {

		custCurrency.click();

		Select custCurr = new Select(custCurrency);
		custCurr.selectByValue("Rupee");

	}

	public void processButton() {
		processBtn.click();
	}

	// ************Customer Search************

	@FindBy(xpath = "//button[@ng-click='showCust()']")
	WebElement custlink;

	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	WebElement custSearch;

	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]")
	WebElement firstnamefound;

	public void customerlink() {
		custlink.click();
	}

	public void custermerSearch(String fname) {
		custSearch.sendKeys(fname);

	}

	public String nameFound() {
		return firstnamefound.getText();

	}

}
