package ua.com.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.com.rozetka.runers.BaseRuner;

public class SeleniumDemo extends BaseRuner {
    @BeforeTest
    public void BeforeTest() {
        setDriver();
    }

    @Test
    public void firstUnsuccessfulTest1() {

        WebElement userIcon = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        userIcon.click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        password.sendKeys("pass");
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();
        WebElement errorMes = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p"));
        System.out.println("Message: " + errorMes.getText());

    }

    @Test
    public void SuccessfulTest() {
        WebElement userIcon = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        userIcon.click();
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
        emailField.sendKeys("pass1@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        password.sendKeys("123asdF");
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();
        sleep(5);
        WebElement recaptcha = driver.findElement(By.id("ngrecaptcha-0"));
recaptcha.click();
sleep(10);
        loginBtn.click();
        sleep(10);
        WebElement listOrdering = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]"));
listOrdering.click();
    }
@Test
    public void firstUnsuccessfulTest2(){
    WebElement userIcon = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
    userIcon.click();
    WebElement emailField = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
    emailField.sendKeys("pass1@gmail.com");
    WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
    password.sendKeys("fghj");
    WebElement loginBtn = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
    loginBtn.click();
    sleep(5);
    WebElement recaptcha = driver.findElement(By.id("ngrecaptcha-0"));
    recaptcha.click();
    sleep(10);
    loginBtn.click();
    sleep(10);
    WebElement erorrMeassengePassw = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[2]/div[2]/strong"));
//String expected  = "Введено невірний пароль!";
//Assert.assertTrue(erorrMeassengePassw.getText().contains(expected));
    System.out.println("Message: " + erorrMeassengePassw.getText());

}
}