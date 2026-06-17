package ExcelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ColumRead {
        public static void main(String[] args) throws IOException {
        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Sheet mysheet= WorkbookFactory.create(File).getSheet("Sheet1");
        //row---> 0.1  cell --->0,1 we are reading columnor or cell so here row value changing  or cell value remains same
            //while reading column value row value changes so in getrow i used i value from 1 to 2
        for(int i =0; i<=2;i++)
        {
            String  Celldata = mysheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(Celldata);
        }

}}
