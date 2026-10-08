package utilities;

import java.io.File;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
//	@DataProvider(name="LoginData")
//	public String [][] getData() throws IOException
//	{
//		String path=".\\testData\\Opencart_LoginData.xlsx";//taking xl file from testData
//		
//		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
//		
//		int totalrows=xlutil.getRowCount("Sheet1");	
//		int totalcols=xlutil.getCellCount("Sheet1",1);
//				
//		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
//		
//		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
//		{		
//			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
//			{
//				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
//			}
//		}
//	return logindata;//returning two dimension array
//				
//	}
	
	//DataProvider 1
	
	//DataProvider 1
	
//		@DataProvider(name="LoginData")
//		public String [][] getData() throws IOException
//		{
//			String path=".\\testData\\Opencart_LoginData.xlsx";//taking xl file from testData
//			
//			ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtilit79
//			
//			int totalrows=xlutil.getRowCount("Sheet1");	
//			int totalcols=xlutil.getCellCount("Sheet1",1);
//					
//			String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
//			
//			for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
//			{		
//				for(int j=0;j<totalcols;j++)  //0    i is rows j is col
//				{
//					logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
//				}
//			}
//		return logindata;//returning two dimension array
//					
//		}
	
//	@DataProvider(name="LoginData")
//	public String[][] getData() throws IOException
//	{
//	    String path = ".\\testData\\Opencart_LoginData.xlsx";
//
//	    System.out.println("Excel path: " + path);
//	    System.out.println("File exists: " + new File(path).exists());
//	    System.out.println("Absolute path: " + new File(path).getAbsolutePath());
//
//	    ExcelUtility xlutil = new ExcelUtility(path);
//
//	    int totalrows = xlutil.getRowCount("Sheet1");
//	    int totalcols = xlutil.getCellCount("Sheet1", 1);
//
//	    System.out.println("Total rows: " + totalrows);
//	    System.out.println("Total columns: " + totalcols);
//
//	    String logindata[][] = new String[totalrows][totalcols];
//
//	    for(int i=1; i<=totalrows; i++)
//	    {
//	        for(int j=0; j<totalcols; j++)
//	        {
//	            logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j);
//	        }
//	    }
//
//	    return logindata;
//	}

//	  @DataProvider(name = "LoginData")
//	    public String[][] getData() throws IOException {
//
//		  
//		  
//	        String path = ".\\testData\\Opencart_LoginData.xlsx";
//
//	        System.out.println("========== DATA PROVIDER START ==========");
//	        System.out.println("Excel path: " + path);
//	        System.out.println("File exists: " + new File(path).exists());
//	        System.out.println("Absolute path: " + new File(path).getAbsolutePath());
//
//	        ExcelUtility xlutil = new ExcelUtility(path);
//
//	        int totalrows = xlutil.getRowCount("Sheet1");
//	        System.out.println("Total rows: " + totalrows);
//
//	        int totalcols = xlutil.getCellCount("Sheet1", 1);
//	        System.out.println("Total columns: " + totalcols);
//
//	        String logindata[][] = new String[totalrows][totalcols];
//
//	        for (int i = 1; i <= totalrows; i++) {
//
//	            for (int j = 0; j < totalcols; j++) {
//
//	                logindata[i - 1][j] =
//	                        xlutil.getCellData("Sheet1", i, j);
//
//	                System.out.println(
//	                        "Row: " + i +
//	                        " Column: " + j +
//	                        " Data: " + logindata[i - 1][j]
//	                );
//	            }
//	        }
//
//	        System.out.println("========== DATA PROVIDER END ==========");
//
//	        return logindata;
//	    }
	
//	@DataProvider(name="LoginData")
//	public String[][] getData() throws IOException {
//
//	    String path = ".\\testData\\Opencart_LoginData.xlsx";
//
//	    ExcelUtility xlutil = new ExcelUtility(path);
//
//	    int totalrows = xlutil.getRowCount("Sheet1");
//	    int totalcols = xlutil.getCellCount("Sheet1", 1);
//
//	    System.out.println("Total rows: " + totalrows);
//	    System.out.println("Total columns: " + totalcols);
//
//	    String logindata[][] = new String[totalrows][totalcols];
//
//	    for(int i=1; i<=totalrows; i++) {
//	        for(int j=0; j<totalcols; j++) {
//
//	            logindata[i-1][j] =
//	                    xlutil.getCellData("Sheet1", i, j);
//
//	            System.out.println(
//	                logindata[i-1][j]
//	            );
//	        }
//	    }
//
//	    return logindata;
//	}


//    @DataProvider(name = "LoginData")
//    public String[][] getData() throws IOException {
//
//        String path = ".\\testData\\Opencart_LoginData.xlsx";
//
//        ExcelUtility xlutil = new ExcelUtility(path);
//
//        int totalRows = xlutil.getRowCount("Sheet1");
//        int totalCols = xlutil.getCellCount("Sheet1", 1);
//
//        String[][] loginData = new String[totalRows][totalCols];
//
//        for (int i = 1; i <= totalRows; i++) {
//
//            for (int j = 0; j < totalCols; j++) {
//
//                loginData[i - 1][j] =
//                        xlutil.getCellData("Sheet1", i, j);
//            }
//        }
//
//        return loginData;
//    }
    
//	@DataProvider(name = "LoginData")
//    public String[][] getData() throws IOException {
//
//        String path = ".\\testData\\Opencart_LoginData.xlsx";
//
//        System.out.println("========== DATA PROVIDER START ==========");
//
//        System.out.println("Excel path: " + path);
//        System.out.println("File exists: " + new File(path).exists());
//
//        ExcelUtility xlutil = new ExcelUtility(path);
//
//        int totalRows = xlutil.getRowCount("Sheet1");
//        System.out.println("Total rows: " + totalRows);
//
//        int totalCols = xlutil.getCellCount("Sheet1", 1);
//        System.out.println("Total columns: " + totalCols);
//
//        String[][] loginData = new String[totalRows][totalCols];
//
//        for (int i = 1; i <= totalRows; i++) {
//
//            for (int j = 0; j < totalCols; j++) {
//
//                loginData[i - 1][j] =
//                        xlutil.getCellData("Sheet1", i, j);
//
//                System.out.println(
//                    "Row " + i +
//                    " Column " + j +
//                    " = " + loginData[i - 1][j]
//                );
//            }
//        }
//
//        System.out.println("========== DATA PROVIDER END ==========");
//
//        return loginData;
//    }

	
	@DataProvider(name = "LoginData")
    public String[][] getData() {

        String path = ".\\testData\\Opencart_LoginData.xlsx";

        System.out.println("========== DATA PROVIDER START ==========");
        System.out.println("Excel path: " + path);
        System.out.println("File exists: " + new File(path).exists());
        System.out.println("Absolute path: " + new File(path).getAbsolutePath());

        try {

            System.out.println("Creating ExcelUtility...");

            ExcelUtility xlutil = new ExcelUtility(path);

            System.out.println("ExcelUtility created.");

            System.out.println("Calling getRowCount...");

            int totalRows = xlutil.getRowCount("Sheet1");

            System.out.println("Total rows: " + totalRows);

            System.out.println("Calling getCellCount...");

            int totalCols = xlutil.getCellCount("Sheet1", 1);

            System.out.println("Total columns: " + totalCols);

            String[][] loginData = new String[totalRows][totalCols];

            for (int i = 1; i <= totalRows; i++) {

                for (int j = 0; j < totalCols; j++) {

                    loginData[i - 1][j] =
                            xlutil.getCellData("Sheet1", i, j);

                    System.out.println(
                            "Row " + i +
                            " Column " + j +
                            " = " + loginData[i - 1][j]
                    );
                }
            }

            System.out.println("========== DATA PROVIDER END ==========");

            return loginData;

        } catch (Throwable e) {

            System.err.println("======================================");
            System.err.println("DATA PROVIDER FAILED");
            System.err.println("Exception: " + e.getClass().getName());
            System.err.println("Message: " + e.getMessage());
            System.err.println("======================================");

            e.printStackTrace(System.err);

            throw new RuntimeException(
                    "Excel DataProvider failed: " + e.getMessage(), e
            );
        }
    }
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4

	
}
