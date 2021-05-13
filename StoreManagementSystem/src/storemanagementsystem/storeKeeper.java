package storemanagementsystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
public class storeKeeper 
{
    public void register_department_head(String f_name, String l_name, String u_name, String password, String department_it_own, int number) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, department_it_own, password};
        
        FileInputStream x = new FileInputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\StoreKeeperAccount.xlsx");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet("Departments");
        int y = s.getLastRowNum();
        System.out.println(y);
        Row row = s.createRow(y + 1);
        for (int k = 0; k < 5; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
        for (int i = 0; i < 4; i++) {
            s.autoSizeColumn(i);
        }
        FileOutputStream file = new FileOutputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\StoreKeeperAccount.xlsx");
        wo.write(file);
        file.close();
    } 
    public void register_librery_head(String f_name, String l_name, String u_name, String password, int number) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, password};
                FileInputStream x = new FileInputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\StoreKeeperAccount.xlsx");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet("Libereries");
        int y = s.getLastRowNum();
        System.out.println(y);

        Row row = s.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
        for (int i = 0; i < 4; i++) {
            s.autoSizeColumn(i);
        }
//         
//         
//        
//        
//    
//    
//    }
//
        FileOutputStream file = new FileOutputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\StoreKeeperAccount.xlsx");
        wo.write(file);
        file.close();
    }

public void registerItem(String item_name, String brand_name, String type_name, String item_id, String damagedd,int num1) throws FileNotFoundException, IOException {
        String[] value1 = {item_name, brand_name, type_name, item_id,damagedd};
          FileInputStream x = new FileInputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\Storekeeper_store.xlsx");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet("TotalStore");
        int y = s.getLastRowNum();
        System.out.println(y);

        Row row = s.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
        for (int i = 0; i < 4; i++) {
            s.autoSizeColumn(i);
        }
//         
//         
//        
//        
//    
//    
//    }
//
        FileOutputStream file = new FileOutputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\Storekeeper_store.xlsx");
        wo.write(file);
        file.close();
    }
}    