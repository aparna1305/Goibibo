package cars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMCar {
	static WebDriver driver;
	static WebElement element;
	
	public static WebElement pickupLocation(WebDriver driver)
	{
		element = driver.findElement(By.xpath(CarElements.txt_car_pickup));
		return element;
				
	}
	public static WebElement autoSuggetPickup(WebDriver driver)
	{
		element = driver.findElement(By.xpath(CarElements.autosuggest_pickup));
		return element;
	}
	public static WebElement dropLocation(WebDriver driver)
	{
		element = driver.findElement(By.xpath(CarElements.txt_car_drop));
		return element;
				
	}
	public static WebElement autoSuggetDrop(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='react-autosuggest-1-suggestion--0']"));
		return element;
	}
	
	public static WebElement clickDate(WebDriver driver)
	{
		element = driver.findElement(By.xpath(CarElements.select_date));
		return element;
	}
	public static WebElement changeMonth(WebDriver driver)
	{
		element= driver.findElement(By.xpath(CarElements.btn_nextMonth));
		return element;
	}
	public static WebElement selectDate(WebDriver driver)
	{
		element=driver.findElement(By.xpath(CarElements.btn_date));
		return element;
	}
	
	public static WebElement clickGetSetGo(WebDriver driver)
	{
		element=driver.findElement(By.xpath(CarElements.btn_getSetGo));
		return element;
				
	}
	public static WebElement schedulePickup(WebDriver driver)
	{
		element=driver.findElement(By.xpath(CarElements.btn_schedulePickup));
		return element;
	}
}
