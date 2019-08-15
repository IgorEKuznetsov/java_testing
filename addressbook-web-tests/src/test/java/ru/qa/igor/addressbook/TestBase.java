package ru.qa.igor.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
     WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

    protected void reternToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }


    protected void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    protected void slectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();

    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }


    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }
}
