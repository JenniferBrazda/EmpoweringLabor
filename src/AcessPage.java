import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessPage {
	
	public static void acessing () throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Acessing Google Drive for Download a Document");
	driver.get("https://drive.google.com/open?id=1Po0rphLctC98phCRH8BrJecSM20xIAY0");
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div[2]/div[2]/div[3]/div")).click();
	System.out.println("Downloading Document");
//	PointerInfo a = MouseInfo.getPointerInfo();
//	Point b = a.getLocation();
//	int x = (int) b.getX();
//	int y = (int) b.getY();
//	Thread.sleep(2*1000);
//	System.out.print("Y: "+y+ " 690 ");
//	System.out.println("X: "+x+" 63 ");
	System.out.println("waiting 5 seconds");
	Thread.sleep(5*1000);
	System.out.println("clicking on the document");
	Robot r= new Robot();
	r.mouseMove(60,710);
	Thread.sleep(2*1000);
	r.mousePress(InputEvent.BUTTON1_MASK);
	r.mouseRelease(InputEvent.BUTTON1_MASK);

	
	

	}
	
}
