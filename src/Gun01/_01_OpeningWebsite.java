package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.get("https://techno.study/tr");  //tarayıcı driver oluşturuldu
            //3 sn bekle
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();  //hafızdan temizle, boşalt


    }
}
