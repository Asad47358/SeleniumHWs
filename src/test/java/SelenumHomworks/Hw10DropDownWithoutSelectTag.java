package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw10DropDownWithoutSelectTag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");


        WebElement fruitDD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruitDD.click();

        List<WebElement> allfruits = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for(WebElement fruit:allfruits){
            if(fruit.getText().equals("Pear")){
                fruit.click();
            }
        }




    }
}
