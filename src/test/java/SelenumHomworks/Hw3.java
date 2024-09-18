package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Acceptance Criteria:
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        // 1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Asad Ahmadzad");
        // 2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign),
        // the form should not be submitted, and an error message should be displayed.
        WebElement Email = driver.findElement(By.name("yourEmail"));
        Email.sendKeys("asadaahmadf@gmail.com");

        WebElement ClintName = driver.findElement(By.name("ClientName"));
        ClintName.sendKeys("Asad");

        WebElement ClientId = driver.findElement(By.id("ClientId"));
        ClientId.sendKeys("ID 2222");

        WebElement Clientfeedback = driver.findElement(By.name("Clientfeedback"));
        Clientfeedback.sendKeys("FB asad");

        WebElement ProjectName = driver.findElement(By.id("ProjectNameId"));
        ProjectName.sendKeys("AAA");

        WebElement ProjectTime = driver.findElement(By.name("ProjectTime"));
        ProjectTime.sendKeys("End of Sep");

        WebElement CurrentAddress = driver.findElement(By.name("CurrentAddress"));
        CurrentAddress.sendKeys("124 clock Street");

        WebElement PermanentAddress = driver.findElement(By.name("PermanentAddress"));
        PermanentAddress.sendKeys("555 city Downtown ");

// 4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.
        WebElement btn = driver.findElement(By.name("btn-submit"));
        btn.click();
// 3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
        WebElement Click = driver.findElement(By.linkText("Click Here."));
        Click.click();
    }
}
