package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw9CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement newsLetter=driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (newsLetter.isEnabled()){
            newsLetter.click();
        }

        List<WebElement> allHobbies=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement hobby:allHobbies){
            String valueOfOption=hobby.getAttribute("id");
            if (valueOfOption.equals("gardening") || valueOfOption.equals("reading")){
                hobby.click();
            }
        }

        WebElement supportChB=driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musicChB=driver.findElement(By.xpath("//input[@value='Music']"));

        if(!supportChB.isDisplayed() && !musicChB.isDisplayed()){
            WebElement showBtn=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            showBtn.click();
            Thread.sleep(2000);
            musicChB.click();
        }

        WebElement receiveNotificationsChB=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        if (!receiveNotificationsChB.isEnabled()){
            WebElement enableCheckBoxesB=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            enableCheckBoxesB.click();
            Thread.sleep(2000);
            receiveNotificationsChB.click();
        }


    }
}
