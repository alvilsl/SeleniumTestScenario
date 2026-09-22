import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;



public class DynamicElements {
    @Test
    public void dynamic() {
        WebDriver driver = new ChromeDriver();
        File website = new File("src/test/resources/AutoProjectFinal/index.html");
        driver.get(website.toURI().toString());
        driver.manage().window().maximize();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(3000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.linkText("Dynamic Elements")).click();
        driver.findElement(By.id("load-delayed-btn")).click();
        //WebElement hidden = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayed-element")));
        WebElement hidden = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayed-element")));
        String  text = hidden.getText();
        System.out.println("Hidden element text: " + text);



    }
}
