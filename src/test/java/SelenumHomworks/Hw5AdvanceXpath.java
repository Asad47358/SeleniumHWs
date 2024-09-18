package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw5AdvanceXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");


        //Acceptance Criteria
        //1.The user should enter the names of books in reverse order from
       // least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
       WebElement name= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        name.sendKeys("Lord of the Ring");

        //2. The user should enter the name of their favorite book using advanced Xpath.
        WebElement second =driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        second.sendKeys("Shah Medas");
        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        WebElement third = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        third.sendKeys("Jadugar");
        //4. The form should submit successfully only if all fields are filled out correctly using the appropriate
        // advanced Xpath expressions.
        WebElement B = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        B.sendKeys("Sport Book");
        WebElement Ba = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        Ba.sendKeys("sport one Book");
        WebElement Bb = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        Bb.sendKeys("sport tow Book");
        WebElement C = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        WebElement Ca = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        WebElement Cab = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        C.sendKeys("Fitness one Book");
        Ca.sendKeys("Fitness two Book");
        Cab.sendKeys("Fitness tree Book");


    }
}
