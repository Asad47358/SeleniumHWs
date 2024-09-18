package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.CSS;

public class Hw6CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement UserID = driver.findElement(By.cssSelector("input#UserID"));
        UserID.sendKeys("Asad");
        WebElement UserName = driver.findElement(By.cssSelector("input#UserName"));
        UserName.sendKeys("Asad Ahmadzad");
        WebElement IntrotoLecture = driver.findElement(By.xpath("//input[@data-starts='introCSSAdv']"));
        IntrotoLecture.sendKeys("ABC");
        WebElement Feedback  = driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        Feedback .sendKeys("Good");
        WebElement Ducky = driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        Ducky.sendKeys("Very Good");
        WebElement ClienD = driver.findElement(By.xpath("//input[@name='ClientID']"));
        ClienD.sendKeys("222A");
        WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys("AsadAhmadzad@gmail.com");
        WebElement Course  = driver.findElement(By.xpath("//input[@name='CourseTopic']"));
        Course .sendKeys("Selenium");
    }
}
