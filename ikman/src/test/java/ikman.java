import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ikman {
    WebDriver driver;
    @BeforeMethod
    public void googleTest() {
        driver = new ChromeDriver();
        driver.get("https://ikman.lk/en");
    }
    @Test
    public void ikman(){
        //click all ad buttton
        WebElement allads = driver.findElement(By.linkText("All ads"));
        allads.click();

        //back
        driver.navigate().back();

        //click chat
        WebElement chat = driver.findElement(By.linkText("Chat"));
        chat.click();

        //driver refresh
        driver.navigate().refresh();

        //enter number
        driver.findElement(By.id("input_intPhoneNumber")).sendKeys("715684560");
        // Wait until the text box is visible and interactable
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input_intPhoneNumber")));

        // Enter the phone number
        //phoneInput.sendKeys("715684560");


        //click continue with google
        driver.findElement(By.xpath("//button[@class='btn--1gFez tertiary--5kHib small--1MQ15 button--juoup gtm-google-login']")).click();

        //Back
        driver.navigate().back();

        //close
        driver.findElement(By.xpath("//button[@aria-label='Close modal']")).click();

        //click all of sri lanka
        driver.findElement(By.xpath("//button[@class='btn--1gFez default--T8kE3 small--1MQ15 location-picker-btn--p3-uX gtm-home-location-picker-click']")).click();

        //close
        driver.findElement(By.xpath("//button[@aria-label='Close modal']")).click();

        //driver refresh
        driver.navigate().refresh();

        //search bar
        driver.findElement(By.className("search-input--PtfH8")).sendKeys("Haylou" + Keys.ENTER);


        //Back
        driver.navigate().back();

        //click electronic
        driver.findElement(By.xpath("//a[@href='/en/ads/sri-lanka/electronics']")).click();

        //Back
        driver.navigate().back();

        //close
        driver.close();

    }





}









