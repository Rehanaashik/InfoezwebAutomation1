package locator;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myreview {
	
	WebDriver driver;

    public Myreview(WebDriver driver) {
    	this.driver = driver;
    	
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	
	 @FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	 public WebElement profilebtn;
	 
	 @FindBy(xpath="//div[@data-testid='menu-reviews']")
	 public WebElement myreviews;
	 
	 @FindBy(xpath="//button[starts-with(@data-testid,'delete-review-')]")
	 public WebElement dlticon;
	 
	 
	 @FindBy(xpath = "//li[@data-type='success']")
	    public WebElement welcomback;
	 
	 @FindBy(xpath = "//*[normalize-space()='Review removed']")
	    public WebElement reviewremoved;
	 
	 
	 
	     
	 
	 
	 


    

}
