package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Verify;

import stepDefinition.DriverManager;
import utilities.Loggerload;
import utilities.PaginationUtility;

public class Attendance_POM {
	
	public static WebDriver driver=DriverManager.getChromedriver();
	public static int Flag;
	
	@FindBy (id="")WebElement header;
	@FindBy (id="")WebElement footer;
	@FindBy (id="")WebElement attendancebutton;
	@FindBy (id="")WebElement page;
	@FindBy (id="")WebElement editButton;
	@FindBy (id="")WebElement deleteButton;
	@FindBy (id="")WebElement closeButton;
	@FindBy (id="")WebElement checkbox;
	@FindBy (id="")WebElement present;
	@FindBy (id="")WebElement absent;
	@FindBy (id="")WebElement save;
	@FindBy (id="") WebElement cancel;
	@FindBy (id="")WebElement successmsg;
	@FindBy (id="") WebElement errormsg;
	
	@FindBy (id="") WebElement yes;
	@FindBy (id="") WebElement no;
	

	public void validlogin()
	{
		driver.get("https://lms-frontend-phase2.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("pwd");
		driver.findElement(By.id("login")).click();
		Loggerload.info("User Enter Valid login details");
		setFlags();
		PageFactory.initElements(driver, this);
		
	}
	
	private void setFlags() {
		
		Loggerload.info("Based on their status set the Flag values:");
		Loggerload.info("*** Flag = 1 for commom User*****  ");
		Flag=1;
	}

	public void attendanceButton() {
		
		Loggerload.info("User clicks on Attendance link");
		attendancebutton.click();
	}

	public void attendanceHeader(String string) {
		
		Loggerload.info("Attendance header is Visible");
		String text=header.getText();
		assertEquals(text, string,"Validated header");
		
	}

	public void attendancePage() {
		
		Loggerload.info("User lands on the Attendance Page");
		String text=driver.getTitle();
		assertEquals(text,"Attendance","user in Attendance page");
	
	}

	public void attendanceFooter(String string) {
		
		Loggerload.info("Attendanc Footer is Visibele");
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
	
	public void validuser(String User, String Staff) {
		  Loggerload.info("*** If user logged in as User/Staff set Flag=2*****");
		if(User.equalsIgnoreCase("user")||(Staff.equalsIgnoreCase("staff")))  
		 Flag=2;
			   
	}
	public void clickCheckbox() {
		
		Loggerload.info("User clicks on SDET checkbox to see list of users in that program");
		driver.findElement(By.xpath("//*[@id=tablename.table[1]/tbody/tr[1]/td[1]]")).click();
	
	}

	public void checkboxdisplay() {
	
		if(checkbox.isDisplayed()==true)
			Loggerload.info("checkbox is present");
		else 
        Loggerload.info("No one registerd");
		
	}

	public void verifyPresent() {
		
		if(present.isDisplayed()==true)
			Loggerload.info("present option is available");
		
	}
    public void clickPresent() {
		
		Loggerload.info("User clicks on Present ");
			present.click();
			
	}

	public void displayPresent() {
		
		Loggerload.info("All names in Present cloumn will display ");
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
	   	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	int rows_count = rows_table.size();
      	for (int row = 0; row < rows_count; row++) {
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
		
		Loggerload.info("All names in Absent cloumn will display ");
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
	   	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	int rows_count = rows_table.size();
      	for (int row = 0; row < rows_count; row++) {
    	  WebElement Column = rows_table.get(row).findElement(By.tagName("td[3]"));
    	   String celtext = Column.getText();
    	       Loggerload.info("Cell Value of row number " + row + " Is " + celtext);
    	    }
    	    Loggerload.info("-------------------------------------------------- ");
    	}
		
		
	public void clickEditButton() {
		
		Loggerload.info("USer clicks on Edit Button");
		if(Flag==2) {
			Loggerload.info("*** Flag Value is 2 *****");
			Loggerload.info("*********User/Staff have permission to modify********");
			editButton.click();}
		else if (Flag==3) {
			Loggerload.info("***Flag value is 3*****");
			Loggerload.info("*********Admin dont have access********");
		}}
	
		
	public void saveButton() {
		
		Loggerload.info("*********Flag = 2 ********");
		if(Flag==2) {
			save.click();
			Loggerload.info("User clicks on save Button");
			}
		
	}
   public void successmsg(String str) {
    	
	   Loggerload.info("Displays success message");
	   String text=successmsg.getText();
	   assertEquals(text,str,str);
	}

	public void cancelButton() {
		Loggerload.info("*********Flag = 2 ********");
		 if(Flag==2)
		  cancel.click();
		 Loggerload.info("User clicks on cancel Button");
	}

	public void closeButton() {
		
		Loggerload.info("User clicks on close Button");
		if(Flag==2)
			  closeButton.click();
	}

	
	public void deleteButton() {
		
		Loggerload.info("User clicks on Delete Button");
		if (Flag==2) {
			Loggerload.info("*** Flag Value is 2 *****");
			Loggerload.info("*********User/Staff have permission to modify********");
			deleteButton.click();
		
		}
		else if (Flag==3) {
			Loggerload.info("*** Flag Value is 3 *****");
			Loggerload.info("****Admin don't have access******");}
	}
	
	public void deletepopup() {
		driver.switchTo().activeElement();
	}

	public void clickYes() {
		Loggerload.info("User clicks on YES Button");
		if (Flag==2)
			yes.click();
		
	}
	public void clickNO() {
		Loggerload.info("User clicks on No Button");
		if (Flag==2)
			no.click();
	
	}
	public void validadmin(String Admin) {
		
		Loggerload.info("****if user logged in as ADmin then Set Flag = 3****");
        if(Admin.equalsIgnoreCase("admin"))
		Flag=3;
        Loggerload.info("******Flag=3***********");
	
}
	
	public void errorMsg(String str) {
		
	   Loggerload.info("Displays Error message");
	   String text=successmsg.getText();
		assertEquals(text,str,str);
	}

	

}
