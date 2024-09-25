package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw12Iframe {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement city = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel = new Select(city);
        sel.selectByVisibleText("Los Angeles");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement name = driver.findElement(By.xpath("//input[@name='Username']"));
        name.sendKeys("Ahmadzad");

    }
}
