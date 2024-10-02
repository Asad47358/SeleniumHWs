package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class Hw15ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");/*
/*
    Acceptance Criteria

1. **Change Text**:
   - Click on the button **"Click me to change text!"**.
   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.
*/
        WebElement button = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        button.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement text = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        String t = text.getText();
        System.out.println(t);

/*
2. **Enable Button**:
   - Click on the button **"Click me to enable button"**.
   - Wait for the button to be enabled, and once it's enabled, click on it.
   */
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement buttton = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button2.click();

        /*
        3. **Checkbox Checked Based on Click**:
   - Click on the button **"Click me to check the checkbox"**.
   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
         */


        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println (cb.isSelected());







    }
}
