package ExcelReading;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReading {
    public static void main(String[] args) throws IOException {
        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
       String CellValue = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(CellValue);
    }}
