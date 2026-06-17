package ExcelReading;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class RowRead {
        public static void main(String[] args) throws IOException {

        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Sheet mysheet= WorkbookFactory.create(File).getSheet("Sheet1");
// while reading row column value changes so i will be coulmn
            for(int i =0; i<=6;i++)
            {
                String  Celldata = mysheet.getRow(0).getCell(i).getStringCellValue();
                System.out.println(Celldata);
            }

}}
