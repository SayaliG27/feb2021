package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Alert1 {

 public static void main(String args[]) throws InterruptedException {

        //This program is example of Simple Alert
        //Set chrome path
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.gogawale\\Downloads\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         //Launch webapplication
         driver.get("https://ksrtc.in/oprs-web/");
         //to scroll page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");

         driver.findElement(By.xpath(("//button[contains(text(),'Search for Bus')]"))).click();
         Thread.sleep(20000);

         //Gettext from Alert
          String AlertMsg;
          AlertMsg = driver.switchTo().alert().getText();
          System.out.println("My Alert" +AlertMsg);
          Thread.sleep(20000);
          // Accept Alert
         driver.switchTo().alert().accept();
          Thread.sleep(20000);
          driver.quit();
 }

}
