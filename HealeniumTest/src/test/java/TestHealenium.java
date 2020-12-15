import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHealenium {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);
        driver.get("http://demo.guru99.com/");


        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}
