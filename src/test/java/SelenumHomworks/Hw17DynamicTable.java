package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.time.Duration;
import java.util.List;

public class Hw17DynamicTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        // navigate to PM tab
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //navigate to second row.
        driver.findElement(By.xpath("//table/tbody/tr[2]/td")).click();
        // select the checkbox.
        driver.findElement(By.id("btnDelete")).click();
        // click to the delete button.
        driver.findElement(By.id("dialogDeleteBtn")).click();

        //navigate to page 3.
        List<WebElement> allID = driver.findElements(By.xpath("//table/tbody/tr"));
        //click to next button

        boolean notFound = true;
        while (notFound) {
            int count = 1;
            for (WebElement ID : allID) {
                String oneID = ID.getText();
                if (oneID.equals("111045A")) {
                    System.out.println(count);
                   WebElement checkBox=driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td"));
                   checkBox.click();
                    notFound=false;
                }
                count++;
            }
            if(notFound){
                WebElement next = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                next.click();
                //we need again because page is refershing and we need all colum again.
                allID = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }

        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();


    }
}
