package thetestingacdamy.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    static Workbook book;
    static Sheet sheet;

    public static String FileName = "src/test/java/thetestingacademy/TestDATA/TestData.xlsx";

    public static Object[][] getTestData(String sheetName) {
        //write the logic to read excel file and convert this to 2D array

        FileInputStream file = null; // to read xlxe file we need this
        try {
            file = new FileInputStream(FileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);// we will create book from workbookfactory
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow((i + 1)).getCell(j).toString();
            }
        }
        return data;
    }

    @DataProvider
    public Object[][] getData(){
        return  getTestData("Sheet1");
    }
}
