package ExcelReading;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReurnTypes {
    public static void main(String[] args) throws IOException {
        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Workbook FileCreated = WorkbookFactory.create(File);
        Sheet SheetValue = FileCreated.getSheet("Sheet1");
        Row RowValue = SheetValue.getRow(1);
        Cell cellValue = RowValue.getCell(1);
        String ValueRead = cellValue.getStringCellValue();
        System.out.println(ValueRead);

}}
