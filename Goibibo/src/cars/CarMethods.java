package cars;
import org.openqa.selenium.WebDriver;

public class CarMethods {
	public static void bookCar(WebDriver driver) throws InterruptedException 
	{
			POMCar.pickupLocation(driver).sendKeys("pune");
			POMCar.autoSuggetPickup(driver).click();
			POMCar.dropLocation(driver).sendKeys("Mumbai");
			POMCar.autoSuggetDrop(driver).click();
			POMCar.clickDate(driver).click();
			POMCar.changeMonth(driver).click();
			POMCar.selectDate(driver).click();
			POMCar.clickGetSetGo(driver).click();
			//Thread.sleep(5000);
			POMCar.schedulePickup(driver).click();
	}
}
