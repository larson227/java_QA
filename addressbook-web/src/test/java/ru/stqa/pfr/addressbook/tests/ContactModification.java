package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfr.addressbook.model.ContactData;

public class ContactModification extends TestBase {
    @Test
    public void testModificationContacts(){
        app.getNaviagationHelper().gotoHomePage();
//        app.getcontactHelper().selectContact();
        app.getcontactHelper().editContact();
        app.getcontactHelper().fillContactPage(new ContactData("contact", "contact2", "contact3", "contact4", "titlecontact", "company", "address", null),false);
        app.getcontactHelper().updateContact();
        app.getcontactHelper().returtToHomePage();
    }
}
