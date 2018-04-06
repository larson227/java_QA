package ru.stqa.pfr.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private NaviagationHelper naviagationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        naviagationHelper = new NaviagationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.close();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NaviagationHelper getNaviagationHelper() {
        return naviagationHelper;
    }

    public ContactHelper getcontactHelper(){
        return contactHelper;
    }

}
