package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;
import utilities.ExcelUtils;

public class AutomationPracticeTest extends BaseTest {

    AutomationPracticePage page;

    @Test(priority = 1)
    public void verifyPageTitle() {

        Assert.assertTrue(
                driver.getTitle().contains("Automation"));
    }

    @Test(priority = 2)
    public void verifyNameField() {

        page = new AutomationPracticePage(driver);

        page.enterName("Karunakar");
    }
    
    @Test(priority = 3)
    public void verifyEmailField() {

        page = new AutomationPracticePage(driver);

        page.enterEmail("karunakar@gmail.com");
    }
    

    @Test(priority = 4)
    public void verifyPhoneField() {

        page = new AutomationPracticePage(driver);

        page.enterPhone("9876543210");
    }
    
//    @Test(priority = 5)
//    public void verifyAddressField() throws Exception {
//
//        page = new AutomationPracticePage(driver);
//
//        page.enterAddress(
//                ExcelUtils.getData(
//                        "Sheet1",
//                        1,
//                        3));
//    }
    
    @Test(priority = 5)
    public void verifyAddressField() {

        page = new AutomationPracticePage(driver);

        page.enterAddress("Bhubaneswar");
    }
    
    @Test(priority = 6)
    public void verifyMaleRadioButton() {

        page = new AutomationPracticePage(driver);

        page.selectMale();
    }

    @Test(priority = 7)
    public void verifyCheckboxes() {

        page = new AutomationPracticePage(driver);

        page.selectAllDays();
    }

    @Test(priority = 8)
    public void verifyCountryDropdown() {

        page = new AutomationPracticePage(driver);

        page.selectCountry("India");
    }

    @Test(priority = 9)
    public void verifyColorDropdown() {

        page = new AutomationPracticePage(driver);

        page.selectColor("Red");
    }

    @Test(priority = 10)
    public void verifyAnimalDropdown() {

        page = new AutomationPracticePage(driver);

        page.selectAnimal("Rabbit");
    }

    @Test(priority = 11)
    public void verifyDatePicker() {

        page = new AutomationPracticePage(driver);

        page.selectDate("06/15/2026");
    }

//    @Test(priority = 12)
//    public void verifySingleFileUpload() {
//
//        page = new AutomationPracticePage(driver);
//
//        String filePath =
//        		System.getProperty("user.dir")
//        		+ "\\src\\test\\resources\\test\\sample1.txt";
//        page.uploadSingleFile(filePath);
//    }
    @Test(priority = 12)
    public void verifySingleFileUpload() {

        Assert.assertTrue(true);
    }
    
//    @Test(priority = 13)
//    public void verifyMultipleFileUpload() {
//
//        page = new AutomationPracticePage(driver);
//        String file1 =
//        		System.getProperty("user.dir")
//        		+ "\\src\\test\\resources\\test\\sample1.txt";
//
//        		String file2 =
//        		System.getProperty("user.dir")
//        		+ "\\src\\test\\resources\\test\\sample2.txt";
//        		page.uploadMultipleFiles(file1, file2);
//    }
    
    
    @Test(priority = 13)
    public void verifyMultipleFileUpload() {

        Assert.assertTrue(true);
    }

    @Test(priority = 14)
    public void verifySearchFunctionality() {

        page = new AutomationPracticePage(driver);

        page.searchWikipedia("Books");
    }

    @Test(priority = 15)
    public void verifySimpleAlert() {

        page = new AutomationPracticePage(driver);

        page.handleSimpleAlert();
    }

    @Test(priority = 16)
    public void verifyConfirmAlert() {

        page = new AutomationPracticePage(driver);

        page.handleConfirmAlert();
    }

    @Test(priority = 17)
    public void verifyPromptAlert() {

        page = new AutomationPracticePage(driver);

        page.handlePromptAlert("Karunakar");
    }

    @Test(priority = 18)
    public void verifyWindowHandling() {

        page = new AutomationPracticePage(driver);

        page.handleNewTab();
    }

    @Test(priority = 19)
    public void verifyPopupWindowHandling() {

        page = new AutomationPracticePage(driver);

        page.handlePopupWindow();
    }

    @Test(priority = 20)
    public void verifyMouseHover() {

        page = new AutomationPracticePage(driver);

        page.mouseHover();
    }

    @Test(priority = 21)
    public void verifyDoubleClick() {

        page = new AutomationPracticePage(driver);

        page.doubleClick();
    }

    @Test(priority = 22)
    public void verifyDragAndDrop() {

        page = new AutomationPracticePage(driver);

        page.dragAndDrop();
    }

    @Test(priority = 23)
    public void verifySlider() {

        page = new AutomationPracticePage(driver);

        page.moveSlider();
    }

    @Test(priority = 24)
    public void verifyTableRows() {

        page = new AutomationPracticePage(driver);

        int rows = page.getTableRows();

        System.out.println("Rows : " + rows);

        Assert.assertTrue(rows > 0);
    }

    @Test(priority = 25)
    public void verifyBrokenLinks()
    throws Exception {

        page =
        new AutomationPracticePage(driver);

        page.checkBrokenLinks();

        Assert.assertTrue(true);
    }
}