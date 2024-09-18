package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement Hobbes = driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        Hobbes.sendKeys("I like working JAVA code");

         WebElement click = driver.findElement(By.xpath("//button[text()='Click Here']"));
         click.click();

         WebElement movie = driver.findElement(By.xpath("//input[@name='favoriteMovies']"));

         movie.sendKeys("Lord of the Ring");

       WebElement praghraph = driver.findElement(By.xpath("//label[contains(text(),'sit amet consectetur adipisicing')]"));
      String a = praghraph.getText();
        System.out.println(a);

    WebElement  City = driver.findElement(By.xpath("//input[starts-with(@id,'yourCity')]"));
        City.sendKeys("Ceres City");
        WebElement PEmail= driver.findElement(By.xpath("(//input[@name='PersonalEmail'])[1]"));
        PEmail.sendKeys("asad@gmail.com");

        WebElement officE = driver.findElement(By.xpath("(//input[@name='OfficeEmail'])[1]"));
        officE.sendKeys("officeEmail@gmail.com");

        WebElement ProEmail = driver.findElement(By.xpath("((//input[@name='ProfessionalEmail'])[1]"));
        ProEmail.sendKeys("ProfessionalEmail@yahoo.com");

        WebElement ClintN = driver.findElement(By.xpath("(//input[@data-detail='one'])[1]"));
        ClintN.sendKeys("Ahmad");

        WebElement ClintID =driver.findElement(By.xpath("(//input[@data-detail='two'])[1]"));

        WebElement street = driver.findElement(By.xpath("(//input[@data-detail='one'])[2]"));
        street.sendKeys("123 Moon city");

        WebElement House = driver.findElement(By.xpath("(//input[@data-detail='two'])[2]"));
        House.sendKeys("333 house 3030");

    }
}
