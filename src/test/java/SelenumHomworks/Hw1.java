package SelenumHomworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // 1. The user should be able to launch a web browser and navigate to the URL `https://www.syntaxprojects.com/`.
        driver.get("https://www.syntaxprojects.com/");
        // 2. The user should be able to maximize the browser window.
        driver.manage().window().maximize();
        // 2. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
        String url = driver.getCurrentUrl();
        System.out.println(url);
        // The page title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.
        String title =  driver.getTitle();
        System.out.println(title);
        // 4. The browser should close automatically after retrieving both the URL and title.
        driver.close();
    }
}
