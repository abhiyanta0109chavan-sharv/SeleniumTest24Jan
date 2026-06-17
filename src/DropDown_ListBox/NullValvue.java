package DropDown_ListBox;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class NullValvue {
    public static void main(String[] args) throws IOException {

        FileInputStream File = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");
        Sheet mysheet= WorkbookFactory.create(File).getSheet("Sheet1");

        for(int i =0; i<=5;i++)
        {
            for(int j = 0; j<=4;j++)
            {
                Cell Celldata = mysheet.getRow(i).getCell(j);
                //cellTypedata will be numeric , string ,boolean

                if(Celldata == null || Celldata.getCellType() == CellType.BLANK)
                {
                    System.out.print("Blank");
                    continue;

                }
                CellType CellTypedata = Celldata.getCellType();
                 if(CellTypedata==CellType.STRING)
                {
                    String myData = Celldata.getStringCellValue();
                    System.out.print(" "+myData);
                }
                else if(CellTypedata==CellType.NUMERIC)
                {
                    Double myData = Celldata.getNumericCellValue();
                    System.out.print(" "+myData);
                }
                else if (CellTypedata==CellType.BOOLEAN)
                {
                    boolean myData = Celldata.getBooleanCellValue();
                    System.out.print(" "+myData);
                }

            }
            System.out.println();
        }
    }}

