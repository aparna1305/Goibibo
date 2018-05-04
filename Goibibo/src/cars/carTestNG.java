package cars;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class carTestNG {
	static WebDriver driver;

  @Test
  public void carBooking() throws Exception {
	//  CarMethods.bookCar(driver);
	  System.out.println(driver.getTitle());
//	  String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//	  String subWindowHandler = null;
//	  Thread.sleep(8000);
//	  Set<String> handles = driver.getWindowHandles(); // get all window handles
//	  System.out.println(handles);
//	  Iterator<String> iterator = handles.iterator();
//	  while (iterator.hasNext()){
//	      subWindowHandler = iterator.next();
//	  }
//	  driver.switchTo().window(subWindowHandler).close(); // switch to popup window
//	// System.out.println( subWindowHandler);
//	  
//	  //html/body/div[2]/div[2]/div/div/a
//	  
//	  // Now you are in the popup window, perform necessary actions here
//
//	  driver.switchTo().window(parentWindowHandler);
	  
	  //****************************************//
	  String parent = driver.getWindowHandle();
Thread.sleep(20000);
      Set<String> pops=driver.getWindowHandles();
      {
      Iterator<String> it =pops.iterator();
     System.out.println(it.next().toString());
      while (it.hasNext()) 
      {

          String popupHandle=it.next().toString();
          if(!popupHandle.contains(parent))
          {
          driver.switchTo().window(popupHandle);
          System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
          driver.close();
          }
      }
      }
	  
	  //************************//
      try {
    	    WebDriverWait winwait = new WebDriverWait(driver, 15);
    	    String mainWindow = driver.getWindowHandle();

    	    // wait for 2 windows and get the handles
    	    Set<String> handles = winwait.until((WebDriver drv) -> {
    	        Set<String> items = drv.getWindowHandles();
    	        return items.size() == 15 ? items : null;
    	    });

    	    // set the context on the last opened window
    	    handles.remove(mainWindow);
    	    driver.switchTo().window(handles.iterator().next());

    	    // close the window
    	    driver.close();

    	    // set the context back to the main window
    	    driver.switchTo().window(mainWindow);

    	} catch (TimeoutException ex) {
    	    System.out.println("No window present within 15 seconds");
    	}
	  
	  //************//
      driver.switchTo().frame(driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[2]/a/img")));       
      driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/a")).click(); //Close Ad
      driver.switchTo().defaultContent(); // Return to main window
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  }

  @AfterMethod
  public void afterMethod() {
  }

}
