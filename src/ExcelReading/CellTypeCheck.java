package ExcelReading;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class CellTypeCheck {
    public static void main(String[] args) throws IOException {

        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Sheet mysheet= WorkbookFactory.create(File).getSheet("Sheet1");
        for(int i =0; i<=5;i++)
        {
            for(int j = 0; j<=4;j++)
            {
                CellType celltype = mysheet.getRow(i).getCell(j).getCellType();
                System.out.print(" "+celltype);
            }
            System.out.println();
        }


}}
