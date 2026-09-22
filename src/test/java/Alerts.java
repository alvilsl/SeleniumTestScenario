import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Alerts {
    @Test
    public void alerts(){
        WebDriver driver = new ChromeDriver();
        File website = new File("src/test/resources/AutoProjectFinal/index.html");
        driver.get(website.toURI().toString());
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Alerts & Popups")).click();

        driver.findElement(By.id("trigger-alert-btn")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("trigger-confirm-btn")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("trigger-prompt-btn")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Test input Alvils");
        alert.accept();

        driver.findElement(By.id("show-success-alert-btn")).click();

        driver.findElement(By.id("open-modal-btn")).click();

        driver.findElement(By.id("modal-input")).sendKeys("Test input Alvils");
        driver.findElement(By.id("modal-confirm-btn")).click();

        driver.findElement(By.id("open-danger-modal-btn")).click();
        driver.findElement(By.id("danger-modal-confirm-btn")).click();
        driver.quit();

    }
}
