import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ultimateqa_5_multiBrowser {
    static String browser = "Edge";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong Browser name");
        }
        // Open Url into browser
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //  Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // Print page source
        System.out.println("Page source :" + driver.getPageSource());

        // Enter the Email into email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("lisa08@gamil.com");

        // Enter Password into password field
        driver.findElement(By.id("user[password]")).sendKeys("lisa08");

        // close browser
        driver.close();

    }
}
