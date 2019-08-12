package ru.qa.igor.addressbook;

import org.testng.annotations.Test;

public class DeletionTestGroups extends TestBase {

  @Test
  public void testGroupsDeletion() throws Exception {
    gotoGroupPage();
    slectGroup();
    deleteSelectedGroups();
    reternToGroupPage();
  }

}
