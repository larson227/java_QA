package ru.stqa.pfr.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfr.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {
    @Test
    public void testGroupModification(){
        app.getNaviagationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupPage(new GroupData("new super group", "gr", "gr2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
 