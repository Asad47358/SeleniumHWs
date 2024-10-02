package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hw14ImplicitWait {
    public static void main(String[] args) {

    //    User Story
    //    I want to navigate to `https://syntaxprojects.com/synchronization-waits-homework.php`
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
/*
         Acceptance Criteria

1. **Button Click and Checkbox Selection**:
   - Click on the button labeled **"Click me"**.
   - Use an appropriate wait method to wait until the checkbox options appear.
   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
 */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement click = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        click.click();

        WebElement check = driver.findElement(By.xpath("//input[@value='Option-1']"));
        check.click();





    }
}
