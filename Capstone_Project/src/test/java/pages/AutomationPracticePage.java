package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPracticePage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public AutomationPracticePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }



    By txtName = By.id("name");
    By txtEmail = By.id("email");
    By txtPhone = By.id("phone");
    By txtAddress = By.id("textarea");

    By maleRadio = By.id("male");
    By femaleRadio = By.id("female");

    By sunday = By.id("sunday");
    By monday = By.id("monday");
    By tuesday = By.id("tuesday");
    By wednesday = By.id("wednesday");
    By thursday = By.id("thursday");
    By friday = By.id("friday");
    By saturday = By.id("saturday");

    By country = By.id("country");

    By colors = By.id("colors");

    By animals = By.id("animals");

    By datePicker = By.id("datepicker");

    By singleFileUpload = By.id("singleFileInput");
    By multipleFileUpload = By.id("multipleFilesInput");


    By searchBox = By.id("Wikipedia1_wikipedia-search-input");

    By searchBtn = By.xpath("//input[@type='submit']");

    By alertBtn = By.id("alertBtn");
    By confirmBtn = By.id("confirmBtn");
    By promptBtn = By.id("promptBtn");


    By newTabBtn = By.xpath("//*[@id='HTML4']/div[1]/button");
 
    By popupBtn = By.id("PopUp");


    By hoverBtn = By.xpath("//*[@id='HTML3']/div[1]/div/button");

    By copyBtn = By.xpath("//button[contains(text(),'Copy Text')]");


    By source = By.id("draggable");
    By destination = By.id("droppable");

    By sliderLeft = By.xpath("//*[@id='slider-range']/span[1]");

    By sliderRight = By.xpath("//*[@id='slider-range']/span[2]");

    
    By productTable = By.id("productTable");

    By allLinks = By.tagName("a");


    public void enterName(String name) {
        driver.findElement(txtName).clear();
        driver.findElement(txtName).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(txtEmail).clear();
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(txtPhone).clear();
        driver.findElement(txtPhone).sendKeys(phone);
    }

    public void enterAddress(String address) {
        driver.findElement(txtAddress).clear();
        driver.findElement(txtAddress).sendKeys(address);
    }

    public void selectMale() {
        driver.findElement(maleRadio).click();
    }

    public void selectFemale() {
        driver.findElement(femaleRadio).click();
    }


    public void selectAllDays() {

        driver.findElement(sunday).click();
        driver.findElement(monday).click();
        driver.findElement(tuesday).click();
        driver.findElement(wednesday).click();
        driver.findElement(thursday).click();
        driver.findElement(friday).click();
        driver.findElement(saturday).click();
    }



    public void selectCountry(String countryName) {

        Select select = new Select(driver.findElement(country));

        select.selectByVisibleText(countryName);
    }

    public void selectColor(String colorName) {

        Select select = new Select(driver.findElement(colors));

        select.selectByVisibleText(colorName);
    }

    public void selectAnimal(String animalName) {

        Select select = new Select(driver.findElement(animals));

        select.selectByVisibleText(animalName);
    }


    public void selectDate(String date) {

        WebElement element =  driver.findElement(datePicker);

        element.clear();

        element.sendKeys(date);

        element.sendKeys(Keys.ENTER);
    }

    public void uploadSingleFile(String path) {

        js.executeScript("window.scrollBy(0,1500)");

        driver.findElement(singleFileUpload).sendKeys(path);
    }

    public void uploadMultipleFiles(String file1, String file2) {

        js.executeScript("window.scrollBy(0,1500)");

        driver.findElement(multipleFileUpload).sendKeys(file1 + "\n" + file2);
    }



    public void searchWikipedia(String text) {

        driver.findElement(searchBox).sendKeys(text);

        driver.findElement(searchBtn).click();
    }

 
    public void handleSimpleAlert() {

        driver.findElement(alertBtn).click();

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    public void handleConfirmAlert() {

        driver.findElement(confirmBtn).click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();
    }

    public void handlePromptAlert(String name) {

        driver.findElement(promptBtn).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(name);

        alert.accept();
    }

 

    public void handleNewTab() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(newTabBtn).click();

        Set<String> windows =
                driver.getWindowHandles();

        for (String win : windows) {

            if (!win.equals(parent)) {

                driver.switchTo().window(win);

                driver.close();
            }
        }

        driver.switchTo().window(parent);
    }

    public void handlePopupWindow() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(popupBtn).click();

        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {

            if (!win.equals(parent)) {

                driver.switchTo().window(win);

                driver.close();
            }
        }

        driver.switchTo().window(parent);
    }


    public void mouseHover() {

        Actions act = new Actions(driver);

        act.moveToElement( driver.findElement(hoverBtn)).perform();
    }

    
    public void doubleClick() {

        Actions act = new Actions(driver);

        act.doubleClick( driver.findElement(copyBtn)).perform();
    }

  

    public void dragAndDrop() {

        Actions act = new Actions(driver);

        act.dragAndDrop( driver.findElement(source), driver.findElement(destination)).perform();
    }

    
    public void moveSlider() {

        Actions act =
                new Actions(driver);

        act.dragAndDropBy( driver.findElement(sliderLeft), 50,0).perform();

        act.dragAndDropBy( driver.findElement(sliderRight),  -50, 0).perform();
    }


    public int getTableRows() {

        List<WebElement> rows = driver.findElements( By.xpath("//*[@id='productTable']/tbody/tr"));

        return rows.size();
    }

    
    public void checkBrokenLinks() throws Exception {

        List<WebElement> links =
                driver.findElements(allLinks);

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                continue;
            }

            HttpURLConnection connection = (HttpURLConnection)
                            new URL(url).openConnection();

            connection.connect();

            int code = connection.getResponseCode();

            System.out.println(url + " -> " + code);
        }
    }
}