package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    
    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
    }
}
