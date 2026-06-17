package ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ColumnRowRead {
    public static void main(String[] args) throws IOException {

        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Sheet mysheet= WorkbookFactory.create(File).getSheet("Sheet1");

        // row--- 0 to 5 coulmn 0 to 4 outer for loop for row inner for loop for column
        for(int i =0; i<=5;i++)
        {
            for(int j = 0; j<=4;j++)
            {
                String  Celldata = mysheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(" "+Celldata);
            }
            System.out.println();
        }


}}
