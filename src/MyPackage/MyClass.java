package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

    public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.gogawale\\Downloads\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com/");
            driver.manage().window().maximize();
            driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
            driver.findElement(By.name("q")).getText();
            Thread.sleep(10000);
            driver.findElement(By.name("q")).clear();
            Thread.sleep(10000);
            driver.close();
        System.out.println("test git");








        }

    }
