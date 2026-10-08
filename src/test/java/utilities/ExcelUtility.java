package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

//	public FileInputStream fi;
//	public FileOutputStream fo;
//	public XSSFWorkbook workbook;
//	public XSSFSheet sheet;
//	public XSSFRow row;
//	public XSSFCell cell;
//	public CellStyle style;   
//	String path;
//	
//	public ExcelUtility(String path)
//	{
//		this.path=path;
//	}
//		
//	public int getRowCount(String sheetName) throws IOException 
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		int rowcount=sheet.getLastRowNum();
//		workbook.close();
//		fi.close();
//		return rowcount;		
//	}
//	
//	public int getCellCount(String sheetName,int rownum) throws IOException
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		row=sheet.getRow(rownum);
//		int cellcount=row.getLastCellNum();
//		workbook.close();
//		fi.close();
//		return cellcount;
//	}
//	
//	
//	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		row=sheet.getRow(rownum);
//		cell=row.getCell(colnum);
//		
//		DataFormatter formatter = new DataFormatter();
//		String data;
//		try{
//		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
//		}
//		catch(Exception e)
//		{
//			data="";
//		}
//		workbook.close();
//		fi.close();
//		return data;
//	}
//	
//	public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
//	{
//		File xlfile=new File(path);
//		if(!xlfile.exists())    // If file not exists then create new file
//		{
//		workbook=new XSSFWorkbook();
//		fo=new FileOutputStream(path);
//		workbook.write(fo);
//		}
//				
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//			
//		if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
//			workbook.createSheet(sheetName);
//		sheet=workbook.getSheet(sheetName);
//					
//		if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
//				sheet.createRow(rownum);
//		row=sheet.getRow(rownum);
//		
//		cell=row.createCell(colnum);
//		cell.setCellValue(data);
//		fo=new FileOutputStream(path);
//		workbook.write(fo);		
//		workbook.close();
//		fi.close();
//		fo.close();
//	}
//	
//	
//	public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		
//		row=sheet.getRow(rownum);
//		cell=row.getCell(colnum);
//		
//		style=workbook.createCellStyle();
//		
//		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
//				
//		cell.setCellStyle(style);
//		workbook.write(fo);
//		workbook.close();
//		fi.close();
//		fo.close();
//	}
//	
//	
//	public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		row=sheet.getRow(rownum);
//		cell=row.getCell(colnum);
//		
//		style=workbook.createCellStyle();
//		
//		style.setFillForegroundColor(IndexedColors.RED.getIndex());
//		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
//		
//		cell.setCellStyle(style);		
//		workbook.write(fo);
//		workbook.close();
//		fi.close();
//		fo.close();
//	}
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;   
	String path;
	
	public ExcelUtility(String path)
	{
		this.path=path;
	}
		
//	public int getRowCount(String sheetName) throws IOException 
//	{
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		int rowcount=sheet.getLastRowNum();
//		workbook.close();
//		fi.close();
//		return rowcount;		
//	}
	
//	public int getRowCount(String sheetName) throws IOException {
//
//	    System.out.println("Opening Excel file...");
//	    
//	    fi = new FileInputStream(path);
//	    workbook = new XSSFWorkbook(fi);
//
//	    System.out.println("Excel opened successfully.");
//	    System.out.println("Requested sheet: " + sheetName);
//	    System.out.println("Actual sheet: " + workbook.getSheetName(0));
//
//	    sheet = workbook.getSheet(sheetName);
//
//	    if (sheet == null) {
//	        workbook.close();
//	        fi.close();
//	        throw new RuntimeException("Sheet '" + sheetName + "' not found in Excel file.");
//	    }
//
//	    int rowcount = sheet.getLastRowNum();
//
//	    System.out.println("Last row number: " + rowcount);
//
//	    workbook.close();
//	    fi.close();
//
//	    return rowcount;
//	}
	
//	public int getRowCount(String sheetName) throws IOException {
//
//	    System.out.println("Opening Excel file...");
//
//	    try {
//	        fi = new FileInputStream(path);
//
//	        System.out.println("FileInputStream created.");
//
//	        workbook = new XSSFWorkbook(fi);
//
//	        System.out.println("Excel opened successfully.");
//
//	        System.out.println("Number of sheets: " + workbook.getNumberOfSheets());
//
//	        System.out.println("Requested sheet: " + sheetName);
//
//	        sheet = workbook.getSheet(sheetName);
//
//	        if (sheet == null) {
//	            throw new RuntimeException(
//	                "Sheet '" + sheetName + "' does not exist."
//	            );
//	        }
//
//	        int rowcount = sheet.getLastRowNum();
//
//	        System.out.println("Last row number: " + rowcount);
//
//	        workbook.close();
//	        fi.close();
//
//	        return rowcount;
//
//	    } catch (Exception e) {
//
//	        System.out.println("========== EXCEL ERROR ==========");
//	        e.printStackTrace();
//
//	        throw e;
//	    }
//	}
	
	public int getRowCount(String sheetName) throws IOException {

	    fi = new FileInputStream(path);

	    workbook = new XSSFWorkbook(fi);

	    sheet = workbook.getSheet(sheetName);

	    int rowcount = sheet.getLastRowNum();

	    workbook.close();
	    fi.close();

	    return rowcount;
	}
		
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;
	}
	
	
	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
	}
	
	public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
	{
		File xlfile=new File(path);
		if(!xlfile.exists())    // If file not exists then create new file
		{
		workbook=new XSSFWorkbook();
		fo=new FileOutputStream(path);
		workbook.write(fo);
		}
				
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
			
		if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
			workbook.createSheet(sheetName);
		sheet=workbook.getSheet(sheetName);
					
		if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
				sheet.createRow(rownum);
		row=sheet.getRow(rownum);
		
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		workbook.write(fo);		
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}

	
}
