package org.demo;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class HotelBooking extends BaseClassHotelBooking{
	public static PojoHotel p;
	@BeforeClass
	public static void broserLaunch() {
		chromeObject();
		maximize();
		implicitWait();
		dateAndTime();
		System.out.println("Browser launch time:");
	}
	@Test
	public void tc1() {
		url("http://adactinhotelapp.com/SearchHotel.php");
	}
	@Test
	public void tc2() throws IOException, AWTException {
		p = new PojoHotel();
		RobotObject();
		sendText(p.getUseNmae(), readTheExcel("Sheet1", 1, 0));
		sendText(p.getPassword(), readTheExcel("Sheet1", 1, 1));
		Click(p.getLogIn());
		Click(p.getLocation());
		selectObject(p.getLocation());
		selectByText(readTheExcel("Sheet1", 1, 2));

		selectObject(p.getHotels());
		Click(p.getHotels());
		selectByText(readTheExcel("Sheet1", 1, 3));

		selectObject(p.getRoomType());
		Click(p.getRoomType());
		selectByText(readTheExcel("Sheet1", 1, 4));

		selectObject(p.getRoomNos());
		Click(p.getRoomNos());	
		select.selectByVisibleText(readTheExcel("Sheet1", 1, 5));
		Enter();

		sendText(p.getCheckInDate(), readTheExcel("Sheet1", 1, 6));
		sendText(p.getCheckInDate(), readTheExcel("Sheet1", 1, 7));

		selectObject(p.getAdultsPerRoom());
		Click(p.getAdultsPerRoom());
		select.selectByVisibleText(readTheExcel("Sheet1", 1, 8));

		selectObject(p.getChildPerRevision());
		Click(p.getChildPerRevision());
		selectByText(readTheExcel("Sheet1", 1, 9));

		Click(p.getSearch());
		Click(p.getSelectButton());
		Click(p.getContin());
		sendText(p.getFirstName(), readTheExcel("Sheet1", 1, 10));
		sendText(p.getLastName(), readTheExcel("Sheet1", 1, 11));
		sendText(p.getAddress(), readTheExcel("Sheet1", 1, 12));
		sendText(p.getCreditCardNum(), readTheExcel("Sheet1", 1, 13));
		selectObject(p.getCreditCardType());
		Click(p.getCreditCardType());
		select.selectByVisibleText(readTheExcel("Sheet1", 1, 14));
		selectObject(p.getCcExpireMonth());
		Click(p.getCcExpireMonth());
		select.selectByVisibleText(readTheExcel("Sheet1", 1, 15));
		selectObject(p.getCcExpireYear());
		Click(p.getCcExpireYear());
		select.selectByVisibleText(readTheExcel("Sheet1", 1, 16));
		sendText(p.getCCV(), readTheExcel("Sheet1", 1, 17));
		Click(p.getBookNow());

		String orderNo = p.getOrderNo().getAttribute("value");
		System.out.println(orderNo);

		HSSFWorkbook book = new HSSFWorkbook();
		HSSFSheet sheet = book.createSheet();
		HSSFRow row = sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Booking Id");
		HSSFRow createRow = sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(orderNo);
		File file = new File("C:\\Users\\Prithiv\\eclipse-workspace\\HotelBooking\\Excel\\Booking.xlsx");
		book.write(file);
		book.close();


	}
	@AfterClass
	public static void closingBrowser() {
		close();
		dateAndTime();
		System.out.println("Closing time of browser");
	}		 

}
