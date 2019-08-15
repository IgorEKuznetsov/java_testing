package ru.qa.igor.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testUntitledTestCase() throws Exception {
    for (int i = 1; i <= 10; i++) {
      gotoGroupPage();
      initGroupCreation();
      fillGroupForm(new GroupData("example", "test101", "test102"));
      submitGroupCreation();
      reternToGroupPage();
    }


  }
}