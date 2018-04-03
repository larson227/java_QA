package ru.stqa.pfr.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupPage(new GroupData("new super group", "gr", "gr2"));
        submitGroupCreaiton();
        returnToGroupPage();
    }

}
