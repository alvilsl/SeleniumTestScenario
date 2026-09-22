import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class DropDown {

    @Test
    public void dropDown() {
        WebDriver driver = new ChromeDriver();
        File website = new File("src/test/resources/AutoProjectFinal/index.html");
        driver.get(website.toURI().toString());
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdowns")).click();
        Select select = new Select(driver.findElement(By.id("country-select")));
        select.selectByIndex(1);
        select.selectByIndex(0);
        select.selectByValue("eg");
        select.selectByVisibleText("India");

        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }

        Select skillSelect = new Select(driver.findElement(By.id("skills-select")));
        skillSelect.selectByIndex(1);
        skillSelect.selectByIndex(2);
        skillSelect.selectByIndex(3);

        WebElement customDropdown = driver.findElement(By.cssSelector("#custom-dropdown-toggle"));

        customDropdown.click();

        driver.findElement(By.id("option-java")).click();


    }

    @Test
    public void radioButtons(){
        WebDriver driver = new ChromeDriver();
        File website = new File("src/test/resources/AutoProjectFinal/index.html");
        driver.get(website.toURI().toString());
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Checkboxes & Radio")).click();
        WebElement termsCheckbox = driver.findElement(By.id("terms-checkbox"));
        //termsCheckbox.click();
        if(termsCheckbox.isSelected()) {
            termsCheckbox.click();
        }

        driver. findElement(By.id("select-all-btn")).click();
        driver.findElement(By.id("radio-beginner")).click();




    }
}
