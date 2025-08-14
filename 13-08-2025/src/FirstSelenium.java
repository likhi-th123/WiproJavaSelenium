import org.openqa.selenium.By; // used to locate elements on a webpage 
import org.openqa.selenium.WebDriver; //main interface for controlling the browser.
import org.openqa.selenium.WebElement; //represents an element on the page
import org.openqa.selenium.chrome.ChromeDriver; //a Selenium class that launches and controls the Google Chrome browser.

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null; 
		try {
		// Launch Chrome browser
		driver = new ChromeDriver();
 
		// Go to Google
//		driver.get("https://www.amazon.com");
//		driver.get("https://www.google.com");
//		driver.get("https://www.youtube.com");
		driver.get("https://www.gmail.com");
//		driver.get("https://www.twitter.com");
//		driver.get("https://www.facebook.com");
 
		// Find the search box and type a query google
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("Selenium WebDriver");
		
		//youtube
//		WebElement searchBox = driver.findElement(By.name("search_query"));
//		searchBox.sendKeys("iphone 16 pro max");
		// Submit the search form
//		searchBox.submit();
//		WebElement searchButton = driver.findElement(By.cssSelector("search-icon-legacy")); 
//		searchButton.click();
//		
		//amazon
	//	using id
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchBox.sendKeys("nothing-phone2a");
		
		//search button
//		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
//		searchButton.click();
		
		
		//gmail input
		WebElement searchBox = driver.findElement(By.id("identifierId"));
		searchBox.sendKeys("likhithkumarv788@gmail.com");
		
		//gmail password input
//		WebElement searchBox = driver.findElement(By.name("Passwd"));
//		searchBox.sendKeys("Selenium WebDriver");
		
		//Twitter
//		WebElement searchBox = driver.findElement(By.name("text"));
//		searchBox.sendKeys("Selenium WebDriver");
		
		//using passwrod input 
//		WebElement searchBox = driver.findElement(By.name("password"));
//		searchBox.sendKeys("viratkohli");
		
		//facebook
//		WebElement searchBox = driver.findElement(By.id("email"));
//		searchBox.sendKeys("Selenium WebDriver");
		
		// Submit the search form
		searchBox.submit();
 
		// Wait a bit (basic pause, not best practice)
			Thread.sleep(10000); // Wait 2 seconds for results to load
		} catch (Exception e) {
			// e.printStackTrace();
		}
 
		// Print the title of the results page
		System.out.println("Search Results Page Title: " + driver.getTitle());
 
		// Close the browser
		driver.quit();
		
		// Set the path to your browser driver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe"); 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\selenium-java-4.12.1"); 
//        WebDriver driver = new ChromeDriver(); // Initialize the browser
//        driver.get("https://www.google.com"); // Navigate to a website
//        System.out.println("Title: " + driver.getTitle()); // Print the page title
//        driver.quit(); // Close the browser
//    }
	}
}
