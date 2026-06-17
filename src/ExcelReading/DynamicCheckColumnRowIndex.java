package ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DynamicCheckColumnRowIndex {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");

       Sheet mysheet= WorkbookFactory.create(file).getSheet("Sheet1");

       int rowIndex = mysheet.getLastRowNum();
       System.out.println(rowIndex);

       int cellIndex = mysheet.getRow(0).getLastCellNum();
        System.out.println(cellIndex);

    }
}
