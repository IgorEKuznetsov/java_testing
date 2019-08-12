package ru.qa.igor.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testUntitledTestCase() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("example", "test101", "test102"));
    submitGroupCreation();
    reternToGroupPage();
  }


}
