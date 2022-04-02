import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownsGetElementsLoop {
    public static void main(String[] args) {
        String name = "nour";
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQyMTcyMDkxLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");

        ////Nour find element = (get elemnt the day button)
        WebElement day = driver.findElement(By.id("day"));
        Select d1 = new Select(day);

        ////Nour Get the information inside the Buttun
        List<WebElement> dd = d1.getOptions();
        System.out.println(dd.size());

        for (int i = 0;i<dd.size();i++){
            if(dd.size()==31){
                System.out.println("The Test Done!! "+name);
                break;
            }else {
                System.out.println("The days Element is not 31");
            }
        }

    }
}
