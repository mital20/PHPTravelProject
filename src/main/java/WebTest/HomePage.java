package WebTest;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;


public class HomePage extends Util
{

    public void userClickOnLoggInPage()
    {
        driver.findElement(By.linkText("Login")).click();

    }
    public void clickoncreateaccount()
    {
        String MainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.id("inputEmail")).sendKeys("mital+\"+System.currentTimeMillis()+\"@gmail.com");
                driver.findElement(By.id("inputPassword")).sendKeys("Pranaya123");
                driver.findElement(By.className("class=\"recaptcha-checkbox-checkmark\"")).click();
                driver.findElement(By.id("login")).click();


                // Closing the Child Window.
                driver.close();
            }
            // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);

        }


    }


}
