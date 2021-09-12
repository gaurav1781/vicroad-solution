package vicroad_solution.vicroad_solution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testcase2 
{
	WebDriver dr=null;
	@Given("User is logged in to vicroads website")
    public void runner( ) throws Exception
    {
    	
    	System.out.println("Inside Step-user logs in to vicroads website");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
			/* Step to open the vicroads URL */
			dr.navigate().to(objectrepos.URL);
			dr.manage().window().maximize();
    }
	@Given("User selects passenger vehicle")
	public void vehicle_drpdwon()
	{
				/* Step to select the vehicle type  */
				Select veh_typ_drpdwn=new Select(dr.findElement(By.xpath(objectrepos.vehicle_drpdwn)));
				/* Select passenger vehicle  */
				veh_typ_drpdwn.selectByIndex(1);
	}
	@And("User selects passenger vehicle type")
	public void passenger_type()
	{
				/* Select Passenger vehicle type  */
				Select psng_veh_type=new Select(dr.findElement(By.xpath(objectrepos.psng_type)));
				psng_veh_type.selectByIndex(1);
	}
	@And("User fills Address")
	public void fill_address()
	{
				/* Fill the Address */
				dr.findElement(By.xpath(objectrepos.address)).sendKeys("Unit 13 King Street Dandenong 3175");
				/* Fill the Permit Date */
	}
	@And("User fills the Permit Date")
	public void fill_date() throws Exception
	{
				dr.findElement(By.xpath(objectrepos.date)).clear();
				TimeUnit.SECONDS.sleep(5);
				dr.findElement(By.xpath(objectrepos.date)).sendKeys("13/09/2021");
	}
	@And("User fills the Permit Duration")
	public void fill_duration()
	{
				/* Fill the Permit Duration */
				Select permit_duration=new Select(dr.findElement(By.xpath(objectrepos.permit_duration)));
				permit_duration.selectByIndex(2);
	}
	@And("User clicks calculator - Submit Order")
	public void click_calc()
	{
				/* Click the calculator to calculate the amount */
				dr.findElement(By.xpath(objectrepos.click_calc)).click();
				/* Submit the request */
				dr.findElement(By.xpath(objectrepos.submit)).click();
				
		//dr.quit();
	}
	@Then("Pass amount is calculated and User is taken to next pages")
	public void user_next_page()
	{
	System.out.println("Execution complete");
	dr.quit();
	}
	@Given("User1 selects Goods carrying vehicle")
	public void vehicle_dropdown()
	{
		/* Step to select the vehicle type  */
		Select veh_typ_drpdwn=new Select(dr.findElement(By.xpath(objectrepos.vehicle_drpdwn)));
		/* Select passenger vehicle  */
		veh_typ_drpdwn.selectByIndex(2);
	}
	@And("User1 selects carrying vehicle type")
	public void select_vehicle()
	{
		/* Select Goods carrying vehicle type  */
		Select psng_veh_type=new Select(dr.findElement(By.xpath(objectrepos.goods_carrier_type)));
		psng_veh_type.selectByIndex(2);
	}
	@And("User1 fills Address")
	public void fill_address1()
	{
				/* Fill the Address */
				dr.findElement(By.xpath(objectrepos.address)).sendKeys("Unit 13 King Street Dandenong 3175");
				/* Fill the Permit Date */
	}
	@And("User1 fills the Permit Date")
	public void fill_date1() throws Exception
	{
				dr.findElement(By.xpath(objectrepos.date)).clear();
				TimeUnit.SECONDS.sleep(5);
				dr.findElement(By.xpath(objectrepos.date)).sendKeys("13/09/2021");
	}
	@And("User1 fills the Permit Duration")
	public void fill_duration1()
	{
				/* Fill the Permit Duration */
				Select permit_duration=new Select(dr.findElement(By.xpath(objectrepos.permit_duration)));
				permit_duration.selectByIndex(2);
	}
	@And("User1 clicks calculator - Submit Order")
	public void click_calc1()
	{
				/* Click the calculator to calculate the amount */
				dr.findElement(By.xpath(objectrepos.click_calc)).click();
				/* Submit the request */
				dr.findElement(By.xpath(objectrepos.submit)).click();
				
		//dr.quit();
	}
	@Then("Pass amount is calculated and User1 is taken to next pages")
	public void user_next_page1()
	{
	System.out.println("Execution complete");
	dr.quit();
	}
}
    

