import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertCheckIfIsraelOnElement {

    private static JavascriptExecutor js;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQyMTcyMDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
        driver.manage().window().maximize();

        WebElement day = driver.findElement(By.id("day"));
        Select d1 = new Select(day);

        List<WebElement> dd = d1.getOptions();
        System.out.println(dd.size());

        for(int i = 0 ; i<dd.size() ; i++)
        {
            if(dd.get(i).getText().equals("1"))
            {
                js =(JavascriptExecutor) driver;
                js.executeScript("alert('israel on i');");
            }
            break;
        }
    }

}
