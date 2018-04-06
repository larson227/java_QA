package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfr.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNaviagationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupPage(new GroupData("new super group", "gr", "gr2"));
        app.getGroupHelper().submitGroupCreaiton();
        app.getGroupHelper().returnToGroupPage();
    }

}
