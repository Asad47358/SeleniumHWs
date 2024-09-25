package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw8RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        WebElement tea = driver.findElement(By.xpath("//input[@value='Tea']"));
        tea.click();

        List<WebElement> all = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement allpr : all) {
            if (allpr.getAttribute("value").equals("hybrid")) {
                allpr.click();

            }
        }


        WebElement toogle1=driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        toogle1.click();

        List<WebElement> seasons= driver.findElements(By.xpath("//input[@name='season']"));
        for (WebElement Seasons : seasons) {
            if (Seasons.getAttribute("value").equals("spring")) {
                Seasons.click();
            }

        }

        WebElement toogle2=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        toogle2.click();

        WebElement radioButton4=driver.findElement(By.xpath("//label[@class='radio-inline hidden_radio']"));
        boolean stateOfBtn4=radioButton4.isDisplayed();

        WebElement winterRB=driver.findElement(By.xpath("//input[@value='winter']"));
        if (winterRB.isDisplayed()&& winterRB.isEnabled()){
            System.out.println("Winter Radio button is displayed ");
        }else {
            System.out.println("Winter Radio button is not displayed ");
        }


        List<WebElement> meals= driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement meal : meals) {
            if (meal.getAttribute("value").equals("breakfast")) {
                meal.click();


            }
        }

    }
}

