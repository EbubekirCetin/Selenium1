package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.get("https://form.jotform.com/221934510376353");


        WebElement isimkutusu=driver.findElement(By.id("first_8"));
        isimkutusu.sendKeys("ismet");

        MyFunc.Bekle(5);
        driver.quit();









    }
}
