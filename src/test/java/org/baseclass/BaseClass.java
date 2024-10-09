package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

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

public class BaseClass {

	public static WebDriver driver;
	public static Robot r;

	public static void browserLaunch() {
		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());
	}

	public static void browserClose() {
		driver.close();
	}

	public static void browserQuit() {
		driver.quit();
	}

	public static void fillTextBox(WebElement webRefName, String sendvalue) {
		webRefName.sendKeys(sendvalue);
	}

	public static void buttonClick(WebElement webRefName) {
		webRefName.click();
	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static void sleep() throws InterruptedException {

		Thread.sleep(5000);
	}

	public static void listOfElement(WebElement listRef, int indexposition) {
		Select s = new Select(listRef);
		s.selectByIndex(indexposition);

	}

	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void loopDown(int count) throws AWTException {
		for (int i = 0; i < count; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public static String DataDrivenRead(String fileName, String SheetName, int rowNum, int cellNum) throws IOException {

		File f = new File("C:\\Users\\saranya\\eclipse-workspace\\Maven\\Ex\\" + fileName + ".xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);

		Sheet sheet = book.getSheet(SheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(cellNum);

		int cellType = cell.getCellType();

		String value = "";// convert all to String

		if (cellType == 1) {
			value = cell.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
			value = sim.format(dateCellValue);
		}

		else {
			double numericCellValue = cell.getNumericCellValue();// down casting
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}
}
