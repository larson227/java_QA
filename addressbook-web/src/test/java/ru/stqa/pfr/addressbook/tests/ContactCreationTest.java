package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfr.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNaviagationHelper().gotoHomePage();
        app.getcontactHelper().createNewGroup();
        app.getcontactHelper().fillContactPage(new ContactData("contact", "contact2", "contact3", "contact4", "titlecontact", "company", "address", "sdf"),true);
        app.getcontactHelper().saveContact();
        app.getcontactHelper().returtToHomePage();
    }
}
