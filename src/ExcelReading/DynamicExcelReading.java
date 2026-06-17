package ExcelReading;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class DynamicExcelReading {

        public static void main(String[] args) throws IOException {
            FileInputStream file = new FileInputStream("C:\\Users\\Win-10\\Desktop\\test.xlsx");

            Sheet mysheet= WorkbookFactory.create(file).getSheet("Sheet1");

            int rowIndex = mysheet.getLastRowNum();
            System.out.println(rowIndex);

            int cellIndex = mysheet.getRow(0).getLastCellNum()-1;
            System.out.println(cellIndex);

            for(int i = 0;i<=rowIndex;i++)
            {
                for(int j=0;j<=cellIndex;j++)
                {
                    Cell myCellData = mysheet.getRow(i).getCell(j);
                    if(myCellData==null || myCellData.getCellType() == CellType.BLANK)
                    {
                        System.out.print("* ");
                    }
                    CellType myCellType = myCellData.getCellType();
                   if(myCellType==CellType.STRING)
                    {
                        System.out.print(" "+myCellData.getStringCellValue());
                    }
                   else if(myCellType==CellType.NUMERIC)
                   {
                       System.out.print(" "+myCellData.getNumericCellValue());
                   }
                   else if(myCellType==CellType.BOOLEAN)
                   {
                       System.out.print(" "+myCellData.getBooleanCellValue());
                   }

                }
                System.out.println();
            }

        }}
