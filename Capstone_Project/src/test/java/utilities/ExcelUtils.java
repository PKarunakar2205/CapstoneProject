package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

    public static String getData(String sheetName, int rowNum, int colNum)
                                 throws Exception {

    	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test\\TestData1.xlsx";
        FileInputStream fis =  new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        DataFormatter formatter = new DataFormatter();

        String value = formatter.formatCellValue(wb.getSheet(sheetName).getRow(rowNum).getCell(colNum));

        wb.close();
        fis.close();

        return value;
    }
}