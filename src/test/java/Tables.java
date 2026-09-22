import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class Tables {

    @Test
    public void tableTest(){
        WebDriver driver = new ChromeDriver();
        File website = new File("src/test/resources/AutoProjectFinal/index.html");
        driver.get(website.toURI().toString());
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Tables")).click();

//        List<WebElement> rows = driver.findElements(By.cssSelector("#static-table tbody tr"));
//        System.out.println("Number of rows: " + rows.size());
//
//        List<WebElement> collumns = driver.findElements(By.cssSelector("#static-table thead th"));
//        System.out.println("Number of columns: " + collumns.size());
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            String studentName = cells.get(1).getText();
//            System.out.println("Student Name: " + studentName);
//
//            if (studentName.equals("Carol White")){
//                String role = cells.get(3).getText();
//                System.out.println("Role of Carol White: " + role);
//                break;
//            }
//        }
        WebElement score = driver.findElement(By.cssSelector("#searchable-table th[data-col='3']"));
        score.click();
        WebElement row1 = driver.findElement(By.cssSelector("#searchable-table tbody tr:nth-child(1) td:nth-child(4)"));
        WebElement row2 = driver.findElement(By.cssSelector("#searchable-table tbody tr:nth-child(2) td:nth-child(4)"));
        int row1Score = Integer.parseInt(row1.getText());

        int row2Score = Integer.parseInt(row2.getText());

        if (row1Score< row2Score) {
            System.out.println("Sorting is working correctly");
        }

//        List<WebElement> rows = driver.findElements(By.cssSelector("#static-table tbody tr"));
//        List<WebElement> cells = row.findElements(By.tagName("td"));

    }

}



