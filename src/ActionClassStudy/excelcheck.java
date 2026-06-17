package ActionClassStudy;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class excelcheck {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        System.out.println("excel location found");

        String myData = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println("Data from excel "+myData);

}}



