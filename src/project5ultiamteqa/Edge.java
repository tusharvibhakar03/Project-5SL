package project5ultiamteqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","Driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        // Launch the URL

// Get the title of the page.

        System.out.println("Page title is"+ driver.getTitle());

        // Get Current URL

        System.out.println("Current URl"+driver.getCurrentUrl());

        // Get page source

        System.out.println("page source"+driver.getPageSource());

// Find the Email  field element and send email
        WebElement EMailField=driver.findElement(By.id("user[email]"));
        EMailField.sendKeys("tvibhaker@gmail.co.uk");

        // Find the password field

        WebElement passwordField=driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("123pass");

        driver.quit();


    }}
