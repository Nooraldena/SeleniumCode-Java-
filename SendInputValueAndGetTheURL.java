import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendInputValueAndGetTheURL {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F-%2Fhe%2Fref%3Dnav_logo%2F%3F_encoding%3DUTF8%26language%3Dhe%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_39");

       /// send text(value) To any search) driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("NourAldenKh");
      ///3 To Get Text//) driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(Title);

        String Title = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[1]/label")).getText();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(Title);
            String Url = driver.getTitle();
            System.out.println(Url);
            String CurretUrl = driver.getCurrentUrl();
            System.out.println(CurretUrl);
            driver.manage().window().maximize();
        }

     ///1) Thread.sleep(3000);
     ///2) driver.quit();

}
