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
        WebElement IntrotoLecture = driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        IntrotoLecture.sendKeys("ABC");
        WebElement Feedback  = driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        Feedback .sendKeys("Good");
        WebElement Ducky = driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        Ducky.sendKeys("Very Good");
        WebElement ClienD = driver.findElement(By.cssSelector("input[data-ends$='conclientID']"));
        ClienD.sendKeys("222A");
        WebElement Email = driver.findElement(By.cssSelector("input[name*='email']"));
        Email.sendKeys("AsadAhmadzad@gmail.com");
        WebElement Course  = driver.findElement(By.cssSelector("input[data-content^='CSS is an']"));
        Course .sendKeys("Selenium");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
