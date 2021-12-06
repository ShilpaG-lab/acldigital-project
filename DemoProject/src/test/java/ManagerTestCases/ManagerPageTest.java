package ManagerTestCases;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.base;
import com.manager.pages.ManagersElementsPage;

public class ManagerPageTest extends base {

	ManagersElementsPage page;
	String nameChoose;
	String fname;

	@BeforeTest
	public void lauchBrowser() {

		Intializer();

	}

	@Test(priority = 1)
	public void addingCustomerValidation() {
		page = new ManagersElementsPage();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		page.mangerLink();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		page.mangerCustAdding();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		nameChoose = page.inputsonAddCust("Shilpa", "G", "1234");

		page.addLink();
		page.alertPopup();

		System.out.println(nameChoose);
	}

	@Test(priority = 2)
	public void openAccountTest() {
		page.openCustomer();
		page.chooseName(nameChoose);
		page.curreyCheck();
		page.processButton();
		driver.switchTo().alert().accept();
	}

	@Test(priority = 3)
	public void customerSearchtTest() {
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		page.customerlink();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		page.custermerSearch("Shilpa");

		String nameval = page.nameFound();

		Assert.assertEquals(nameval, "Shilpa");
	}
	
	   @AfterTest 
	  public void tearDown() { 
		   driver.close(); 
		   }
	   
	 
}
