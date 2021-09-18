package test;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTest {
    @Test
    public void Test()
    {
        WebDriver driver=new ChromeDriver();

        driver.get("https://mvnrepository.com/");
        driver.findElement(By.cssSelector("#logo"));
        driver.findElement(By.cssSelector(".button"));
        driver.findElement(By.cssSelector("div#navigation"));
        driver.findElement(By.cssSelector("source[type='image/webp']"));
        driver.findElement(By.cssSelector(".im-subtitle,a"));

        driver.findElement(By.xpath("//a[text()='Popular']"));
        driver.findElement(By.xpath("//a[contains(text(),'Categories')]"));
        driver.findElement(By.xpath("//div [@id ='header']"));
        driver.findElement(By.xpath("//*[@type='image/webp']"));
        driver.findElement(By.xpath("//span[contains(@class,'lic' ) and text() ='Apache']"));



       

    }
    @Test
        public void TestPositive()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://regenxbio.itc-portal.com/");

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("mariiaktest@gmail.com");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Qwerty1Qwerty@");

        driver.findElement(By.xpath("//span[contains(@class, 'Login')]")).click();

        String ForgotPass =driver.findElement(By.xpath("//h6")).getText();
        Assertions.assertThat(ForgotPass).contains("Forgot password");
    }
    @Test
    public void TestNegative()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://regenxbio.itc-portal.com/");

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("mariiaktest@gmail.com");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Qwerty1Qwerty@");

        driver.findElement(By.xpath("//span[contains(@class, 'Login')]")).click();

        String ForgotPass =driver.findElement(By.xpath("//h6")).getText();
        Assertions.assertThat(ForgotPass).contains("Reset password");
    }
}
