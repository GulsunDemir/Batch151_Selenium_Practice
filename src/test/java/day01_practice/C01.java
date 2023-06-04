package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk = driver.findElement(By.xpath("//input[@id='number1']"));
        ilkKutucuk.sendKeys("20"+ Keys.ENTER);

        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk =driver.findElement(By.xpath("//*[@id='number2']"));
        ikinciKutucuk.sendKeys("30"+Keys.ENTER);

        // calculate'e tıklayınız
        WebElement calculateButonu = driver.findElement(By.xpath("//*[@id='calculate']"));
        calculateButonu.click();

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("Toplama Isleminin Sonucu: "+sonuc.getText());

        Thread.sleep(2000);

        // sayfayi kapatiniz
        driver.close();




    }
}
