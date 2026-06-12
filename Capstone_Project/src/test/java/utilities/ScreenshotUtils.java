package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

    public static void capture(
            WebDriver driver,
            String fileName) throws Exception {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File src =
                ts.getScreenshotAs(OutputType.FILE);

        File dest =
                new File("./screenshots/"
                        + fileName + ".png");

        FileUtils.copyFile(src, dest);
    }
}