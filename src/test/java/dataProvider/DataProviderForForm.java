package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderForForm {
	
    @DataProvider(name = "searchKeywordpassing")
    public Object[][] getLoginTestData() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\data\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int lastRow = sheet.getLastRowNum(); // it returns the last row number
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[lastRow][colCount];

        for (int row = 0; row < lastRow; row++) {
            XSSFRow currentRow = sheet.getRow(row);

            data[row][0] = currentRow.getCell(0).toString();
        }

        workbook.close();
        return data;
    }
}
