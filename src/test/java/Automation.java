import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main (String[] args) {

	WebDriver driver = new ChromeDriver();

    // Set implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // Navigate to URL
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();

    // Finding total number of pages (assuming there is a pagination element)
    String totalPagesText = driver.findElement(By.xpath("//a[normalize-space()='4']")).getText(); // Example for page '4'
    int totalPages = Integer.parseInt(totalPagesText);

    System.out.println("Total number of pages: " + totalPages);
	}
}
