package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
    @Test
    public void testContactDeletion(){
        app.getcontactHelper().selectContact();
        app.getcontactHelper().deleteContact();
    }
}
