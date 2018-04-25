package ru.stqa.pfr.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pfr.addressbook.appmanager.ApplicationManager;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }



    @AfterMethod
    public void tearDown() {
        app.stop();
    }



    public ApplicationManager getApp() {
        return app;
    }
}
