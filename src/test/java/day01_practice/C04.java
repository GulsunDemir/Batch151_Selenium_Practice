package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String actualTitle =driver.getTitle();
        String exceptionTitle ="Teknoloji";
        if (actualTitle.contains(exceptionTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("teknosa")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String actualMedunnaTitle =driver.getTitle();
        String exceptionMedunnaTitle ="MEDUNNA";
        if (actualMedunnaTitle.contains(exceptionMedunnaTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("medunna")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
