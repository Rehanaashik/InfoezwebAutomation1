package locator;


    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Sendenquiry {
		
	WebDriver driver;
		
		public Sendenquiry(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//button[@data-testid='open-enquiry-btn']")
		public WebElement sendenquiry;
		
		@FindBy(xpath="//input[@data-testid='enquiry-name']")
		public WebElement name;
		
		@FindBy(xpath="//input[@data-testid='enquiry-email']")
		public WebElement email;
		
		@FindBy(xpath="//input[@data-testid='enquiry-phone']")
		public WebElement phone;
		
		@FindBy(xpath="//textarea[@data-testid='enquiry-message']")
		public WebElement message;
		
		@FindBy(xpath="//button[@data-testid='enquiry-submit-btn']")
		public WebElement submit;
		
		// Login locators
	    @FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	    public WebElement signin;

	    @FindBy(xpath = "//input[@id='email']")
	    public WebElement emails;

	    @FindBy(xpath = "//input[@id='password']")
	    public WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    public WebElement submitted;
	    
	    @FindBy(xpath = "//h3[contains(text(),'Bloom Beauty Studio')]")
	    public WebElement businessname;
	    
	    @FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	    public WebElement profilebtn;
	    
	    @FindBy(xpath = "//li[@data-sonner-toast]")
	    public WebElement toastmsg;
	    
	    @FindBy(xpath = "//div[@data-testid='menu-enquiries']")
	    public WebElement myenquiry;
	    
	    
	    
		
		
		
	}
		
		


