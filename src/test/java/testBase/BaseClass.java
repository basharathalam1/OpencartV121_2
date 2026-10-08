package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
//	public Logger logger;//log4j
//	public WebDriver driver;
//	public Properties p;
//	
//	@BeforeClass
//	@Parameters({"os","browser"})
//	public void setup(String os, String br) throws IOException, InterruptedException {
//		
//		Thread.sleep(5000);
//		//loading config.properties
//		FileReader file = new FileReader("./src//test//resources//config.properties");
//		p=new Properties();
//		p.load(file);
//				
//				
//		logger = LogManager.getLogger(this.getClass());
//		
//		switch(br.toLowerCase()) {
//		case "chrome" : driver=new ChromeDriver(); break;
//		case "edge" : driver=new EdgeDriver();break;
//		case "firefox" : driver=new FirefoxDriver();break;
//		default : System.out.println("Invalid browser"); return;
//		}
//		
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().window().maximize();
//		
//		
//		switch(br.toLowerCase()) {
//
//		case "chrome":
//		    driver = new ChromeDriver();
//		    break;
//
//		case "edge":
//		    driver = new EdgeDriver();
//		    break;
//
//		case "firefox":
//		    driver = new FirefoxDriver();
//		    break;
//
//		default:
//		    System.out.println("Invalid browser");
//		    return;
//		}
//
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.get(p.getProperty("appURL"));
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
	
	public Logger logger;
    public static WebDriver driver;
    public Properties p;

    @BeforeClass(groups= {"Sanity", "Regression", "Master"})
    @Parameters({"os", "browser"})
    public void setup(String os, String br) throws IOException {

    	FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
    	
        System.out.println("===== SETUP START =====");

        logger = LogManager.getLogger(this.getClass());

        System.out.println("Logger initialized");

        System.out.println("OS: " + os);
        System.out.println("Browser: " + br);
        
        if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
        	DesiredCapabilities capabilities = new DesiredCapabilities();
        	if(os.equalsIgnoreCase("windows")) {
        		capabilities.setPlatform(Platform.WIN11);
        	}else if(os.equalsIgnoreCase("linux")){
        		capabilities.setPlatform(Platform.LINUX);
        	}else if(os.equalsIgnoreCase("mac")){
        		capabilities.setPlatform(Platform.MAC);
        	}else {
        		System.out.println("No matching os");
        		return;
        	}
        	
        	//browser
        	switch(br.toLowerCase()) {
        	case "chrome": capabilities.setBrowserName("chrome"); break;
        	case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
        	case "firefox": capabilities.setBrowserName("firefox"); break;
        	default: System.out.println("No matching browser"); return;
        	}
        	
        	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        }
        
        if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
        switch (br.toLowerCase()) {

        case "chrome":
            System.out.println("Starting Chrome...");
            driver = new ChromeDriver();
            break;

        case "edge":
            System.out.println("Starting Edge...");
            driver = new EdgeDriver();
            break;

        case "firefox":
            System.out.println("Starting Firefox...");
            driver = new FirefoxDriver();
            break;

        default:
            throw new RuntimeException("Invalid browser: " + br);
        }
        }
        System.out.println("Browser started");
        
        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().window().maximize();

        System.out.println("Window maximized");

        System.out.println("===== SETUP COMPLETE =====");
    }
    
	
	
	@AfterClass(groups= {"Sanity","Regression", "Master"})
	public void tearDown() {
		driver.quit();
	}
	
	public String randomeString() {
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomeNumber() {
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomeAplhaNumeric() {
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
	}
	
//	public String captureScreen(String tname) throws IOException {
//
//		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//				
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
//		File targetFile=new File(targetFilePath);
//		
//		sourceFile.renameTo(targetFile);
//			
//		return targetFilePath;
//
//	}
	
	public String captureScreen(String testName) throws IOException {

	    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
	            .format(new Date());

	    String targetPath = System.getProperty("user.dir")
	            + "\\screenshots\\"
	            + testName + "_" + timeStamp + ".png";

	    File destination = new File(targetPath);

	    TakesScreenshot ts = (TakesScreenshot) driver;

	    File source = ts.getScreenshotAs(OutputType.FILE);

	    File parent = destination.getParentFile();

	    if (!parent.exists()) {
	        parent.mkdirs();
	    }

	    Files.copy(source.toPath(), destination.toPath(),
	            StandardCopyOption.REPLACE_EXISTING);

	    System.out.println("Screenshot saved at: " + destination.getAbsolutePath());

	    return destination.getAbsolutePath();
	}

}
