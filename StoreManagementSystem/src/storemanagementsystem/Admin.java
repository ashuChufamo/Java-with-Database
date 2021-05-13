package storemanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Admin {

    private static String[] columns = {"First name", "Last name", "UserName", "Password"};

    public void newRegiser(String sheetName, String f_name, String l_name, String u_name, String password) {

        String[] value1 = {f_name, l_name, u_name, password};
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 17);
        headerFont.setColor(IndexedColors.BLUE.getIndex());
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        int y = 0;
        Row row = sheet.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }

        int rowNum = 1;

        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        FileOutputStream file;
        try {
            file = new FileOutputStream("AdminAcount.xls");

            workbook.write(file);
            file.close();
            workbook.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void newSheet(String sheetName, String f_name, String l_name, String u_name, String password) throws IOException {
        String[] value1 = {f_name, l_name, u_name, password};
        FileInputStream x = new FileInputStream("StoreManagementSystem\\AdminAcount.xls");
        Workbook wo = new HSSFWorkbook(x);
        Sheet sheet = wo.createSheet(sheetName);
        Font headerFont = wo.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 17);
        headerFont.setColor(IndexedColors.BLUE.getIndex());
        CellStyle headerCellStyle = wo.createCellStyle();
        headerCellStyle.setFont(headerFont);
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        int y = 0;
        Row row = sheet.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }

        int rowNum = 1;

        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        FileOutputStream file;
        try {
            file = new FileOutputStream("AdminAcount.xls");

            wo.write(file);
            file.close();
            wo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void register_StoreKeeper(String f_name, String l_name, String u_name, String password) throws IOException {
        String[] value1 = {f_name, l_name, u_name, password};

        try {
            FileInputStream x = new FileInputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\AdminAcount.xls");
            Workbook wo = new HSSFWorkbook(x);
            Sheet s = wo.getSheet("StoreKeepers");
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
            try {
                FileOutputStream file = new FileOutputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\AdminAcount.xls");
                wo.write(file);
                file.close();
            } catch (FileNotFoundException ex) {
                newRegiser("StoreKeepers", f_name, l_name, u_name, password);
            }

        } catch (FileNotFoundException ex) {
            newRegiser("StoreKeepers", f_name, l_name, u_name, password);
        } catch (NullPointerException e) {
            newSheet("StoreKeeper", f_name, l_name, u_name, password);
        }
    }

    public void register_Auditor(String f_name, String l_name, String u_name, String password) throws IOException {
        String[] value1 = {f_name, l_name, u_name, password};
        try {
            FileInputStream x = new FileInputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\AdminAcount.xls");
            Workbook wo = new HSSFWorkbook(x);
            Sheet s = wo.getSheet("Auditors");
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
            try {
                FileOutputStream file = new FileOutputStream("C:\\Users\\selam computer\\Documents\\NetBeansProjects\\StoreManagementSystem\\AdminAcount.xls");
                wo.write(file);
                file.close();
            } catch (FileNotFoundException ex) {
                newRegiser("StoreKeepers", f_name, l_name, u_name, password);
            }
        } catch (FileNotFoundException ex) {
            newRegiser("StoreKeepers", f_name, l_name, u_name, password);
        } catch (NullPointerException e) {
            newSheet("Auditors", f_name, l_name, u_name, password);
        }
    }
}
