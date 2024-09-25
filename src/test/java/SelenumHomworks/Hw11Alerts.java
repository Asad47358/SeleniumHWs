package SelenumHomworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw11Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
        WebElement select = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        select.click();

     Alert alerts = driver.switchTo().alert();
     alerts.accept();
        Thread.sleep(2000);
     WebElement delet = driver.findElement(By.xpath("//button[@style='background:yellow;']"));
     delet.click();

     Alert al = driver.switchTo().alert();
     al.dismiss();
     WebElement pr = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        String print = pr.getText();
        System.out.println(print);

     WebElement name = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));

     name.click();
     Alert ale = driver.switchTo().alert();
     ale.sendKeys("Asad");
     ale.accept();

     WebElement prName = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
       String pp = prName.getText();
        System.out.println(pp);



    }
}
