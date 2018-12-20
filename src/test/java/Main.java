import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;


public class Main {

    @Test
    public void verifyThatCategoryTshirtsOpen() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        String Url = driver.getCurrentUrl();

        driver.findElement(By.linkText("T-SHIRTS")).click();



        try {
            driver.findElement(By.xpath("//span[contains(@class,'cat-name') and contains(text(),'T-sshirts')]"));
            System.out.println("T-SHIRTS category is open");
        } catch (NoSuchElementException e) {
           System.out.println("T-SHIRTS category is not found");
        }



        driver.quit();
    }
}

    //protected boolean isElementPresent(By by){
            //        try{
            //            driver.findElement(by);
            //            return true;
            //        }
            //        catch(NoSuchElementException e){
            //            return false;
            //        }
            //    }

  /*  }catch(NoSuchElementException e){
            System.out.println("isElementFound : false :"+text);
            return false;
            }
            return true;*/


