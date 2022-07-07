package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassHotelBooking {
	Hello

	public static WebDriver driver;
	public static Select select;
	public static Robot robot;

	public static void chromeObject() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.close();
	}
	public static void sendText(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void Click(WebElement element) {
		element.click();
	}
	public static void RobotObject() throws AWTException {
		robot = new Robot();
	}
	public static void Enter() {
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void selectObject(WebElement element) {
		select = new Select(element);
	}
	public static void selectByText(String text) {
		select.selectByVisibleText(text);
	}
	public static void selectByValue(String index) {
		select.selectByValue(index);

	}
	public static String readTheExcel(String sheetname, int rownum,int column) throws IOException {
		File file = new File("C:\\Users\\Prithiv\\eclipse-workspace\\HotelBooking\\Excel\\Hotel.xlsx");
		FileInputStream read = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(read);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(column);
		int type = cell.getCellType();
		String name="";
		if (type==1) {
			name=cell.getStringCellValue();

		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat();
			name=d.format(date);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			name=String.valueOf(l);
		}
		return name;

	}
	public static void dateAndTime() {
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
		String a= d.format(d);
	}
}
