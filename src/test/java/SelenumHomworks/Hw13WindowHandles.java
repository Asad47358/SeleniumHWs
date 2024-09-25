package SelenumHomworks;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw13WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        String mainpage = driver.getWindowHandle();

        WebElement B1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1.click();

        Set<String> Allhandles = driver.getWindowHandles();

        for (String button1 : Allhandles) {
            driver.switchTo().window(button1);
            String url = driver.getCurrentUrl();
            if (url.equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement text = driver.findElement(By.xpath("//h2[text()='Welcome to B! page']"));
                if (text.getText().equals("Welcome to B1 page")) {
                    System.out.println("B1 button text Verified");
                } else {
                    System.out.println("B1 button is not Verified");
                }

            }
        }
        driver.switchTo().window(mainpage);

        WebElement B2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        B2.click();

        Set<String> AllHandals2 = driver.getWindowHandles();

        for (String button2 : AllHandals2) {
            driver.switchTo().window(button2);
            String urll = driver.getCurrentUrl();
            if (urll.equals("https://syntaxprojects.com/b2-page.php")) {
                WebElement tt = driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                if (tt.getText().equals("Welcome to B2 page")) {
                    System.out.println("B2 button text Verified");
                } else {
                    System.out.println("B2 button text is not Verified");
                }
            }


        }
    }
}
