package ru.stqa.pfr.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pfr.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void returtToHomePage() {
        click(By.linkText("home page"));
    }

    public void saveContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
//        click(By.linkText("submit"));
    }

    public void fillContactPage(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }


    public void editContact() {
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void createNewGroup() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.id("13"));
    }

    public void updateContact() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void returnToHomePageWithContact() {
        click(By.linkText("home page"));
    }


    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }
}
