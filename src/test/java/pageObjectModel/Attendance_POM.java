package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Verify;

import io.cucumber.datatable.DataTable;
import stepDefinition.DriverManager;
import utilities.Loggerload;
import utilities.PaginationUtility;

public class Attendance_POM {
	
	public static WebDriver driver=DriverManager.getChromedriver();
	public static int Flag;
	
	@FindBy (id="username")WebElement Username;
	@FindBy (id="password")WebElement Password;
	@FindBy (id="login")WebElement login;
	@FindBy (xpath="")WebElement header;
	@FindBy (xpath="")WebElement footer;
	@FindBy (xpath="")WebElement attendancebutton;
	@FindBy (xpath="")WebElement page;
	@FindBy (xpath="")WebElement editButton;
	@FindBy (xpath="")WebElement deleteButton;
	@FindBy (xpath="")WebElement closeButton;
	@FindBy (xpath="")WebElement checkbox;
	@FindBy (xpath="")WebElement present;
	@FindBy (xpath="")WebElement absent;
	@FindBy (xpath="")WebElement save;
	@FindBy (xpath="") WebElement cancel;
	@FindBy (xpath="")WebElement successmsg;
	@FindBy (xpath="") WebElement errormsg;
	
	@FindBy (xpath="") WebElement yes;
	@FindBy (xpath="") WebElement no;
	

	public void homepage() {
		Loggerload.info("User lands on Login PAge");
		driver.get("");
		PageFactory.initElements(driver, this);
		
		
	}
	public void validlogin(String user, String pwd) {
			
		Loggerload.info("User Enter Valid login details");
				Username.sendKeys(user); 
				Password.sendKeys(pwd);
			
	}
	
	public void clicklogin() {
		
		Loggerload.info("User clicks on login Button");
		login.click();
	}
	public void attendanceButton() {
		
		Loggerload.info("User clicks on Attendance Button");
		attendancebutton.click();
	}

	public void attendanceHeader(String string) {
		
		Loggerload.info("User check Attendance header is Visible ");
		String text=header.getText();
		assertEquals(text, string,"Validated header");
		
	}

	public void attendancePage() {
		
		Loggerload.info("User lands on the Attendance Page");
		String text=driver.getTitle();
		assertEquals(text,"Attendance","user in Attendance page");
		
	}

	public void attendanceFooter(String string) {
		
		Loggerload.info("Attendance Footer is Visibele");
		String text=footer.getText();
		assertEquals(text, string,"Validated footer");
	}
	
   public void pagination(String string) {
		
	   Loggerload.info("User able to the pages at bottom");
	   String text= PaginationUtility .getElementText(page);
	   assertEquals(string, text);
		
	}

	public void paginationValidation() throws Exception {
		
		Loggerload.info("Pagination is Disabled");
		PaginationUtility.clickElement(page);
		
	}
   public void clickCheckbox() {
		
		Loggerload.info("User clicks on SDET checkbox to see list of users in that program");
		driver.findElement(By.xpath("//*[@id=tablename.table[1]/tbody/tr[1]/td[1]]")).click();
	
	}
   public void checkboxdisplay() {
		
	   Loggerload.info("user validates Checkbox");
	  	if(checkbox.isDisplayed()==true)
			Loggerload.info("checkbox is present");
		else 
            Loggerload.info("No one registerd");
		
	}

	public void verifyPresent() {
		Loggerload.info("user validates present button");
		if(present.isDisplayed()==true)
			Loggerload.info("present option is available");
		
	}
   public void clickPresent() {
		
		Loggerload.info("User clicks on Present ");
		present.click();
			
	}

	public void displayPresent() {
		
		Loggerload.info("user see names display on present ");
		Loggerload.info("All names in Present cloumn will display ");
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
	   	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	int rows_count = rows_table.size();
     	for (int row = 0; row < rows_count; row++) 
     	{
   	    WebElement Column = rows_table.get(row).findElement(By.tagName("td[2]"));
   	    String celtext = Column.getText();
   	       Loggerload.info("Cell Value of row number " + row + " Is " + celtext);
   	    }
   	    Loggerload.info("-------------------------------------------------- ");
		
}
		
	public void clickAbsent() {
		Loggerload.info("User clicks on Absent ");
		absent.click();

	}
		
	public void displayabsense() {
		Loggerload.info("user see names display on absent");
		Loggerload.info("All names in Absent cloumn will display ");
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
	   	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
   	    int rows_count = rows_table.size();
     	for (int row = 0; row < rows_count; row++)
     	{
   	    WebElement Column = rows_table.get(row).findElement(By.tagName("td[3]"));
   	    String celtext = Column.getText();
   	       Loggerload.info("Cell Value of row number " + row + " Is " + celtext);
   	    }
   	    Loggerload.info("-------------------------------------------------- ");
		    	
    	}
		
   
	public void validuser(String User, String Staff) {
		
		if(User.equalsIgnoreCase("user")||(Staff.equalsIgnoreCase("staff")))
			Flag=1;
	   			   
	}
	
	public void clickEditButton() {
		
		Loggerload.info("User clicks on Edit Button");
        if(Flag==1)
		editButton.click();
        else
        	Loggerload.info("Denied Access");
   }  
		
	public void saveButton() {
		
		Loggerload.info("User clicks on save Button");
			save.click();
			
			}
   public void successmsg(String str) {
    	
	   Loggerload.info("Displays success message");
	   String text=successmsg.getText();
	   assertEquals(text,str,str);
	}

	public void cancelButton() {
		Loggerload.info("User clicks on cancel Button");
		  cancel.click();
		 
	}

	public void closeButton() {
		
		Loggerload.info("User clicks on close Button");
		closeButton.click();
	}

	
	public void deleteButton() {
		
		Loggerload.info("User clicks on Delete Button");
		if(Flag==1)
			deleteButton.click();
		else
			Loggerload.info("Denied Access");
	}
	
	public void deletepopup() {
		driver.switchTo().activeElement();
	}

	public void clickYes() {
		Loggerload.info("User clicks on YES Button");
			yes.click();
		
	}
	public void clickNO() {
		Loggerload.info("User clicks on No Button");
			no.click();
	
	}
	public void validadmin(String Admin) {
		
		if(Admin.equalsIgnoreCase("admin"))
		Flag=2;
	}
	
	public void errorMsg(String str) {
		
	   Loggerload.info("Displays Error message");
	   String text=errormsg.getText();
	   assertEquals(text,str,str);
	}
	
	

	

	

}
