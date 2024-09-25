package SelenumHomworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw10DropDownSelectTag {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");


//        select tag
        WebElement fvrtFruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
//
        Select sel=new Select(fvrtFruit);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Apple");
        Thread.sleep(2000);
        sel.selectByValue("Pear");
        //check if the drop down is multi select or single ?
        System.out.println(sel.isMultiple()); //output: false


        WebElement MutliSelectDD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selectMulitple =new Select(MutliSelectDD);

        selectMulitple.selectByIndex(0);
        selectMulitple.selectByVisibleText("Cooking");
        selectMulitple.selectByValue("Teaching");
        Thread.sleep(2000);
        selectMulitple.deselectByIndex(0);



    }
}
