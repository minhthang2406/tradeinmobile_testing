package create_new_request;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.awt.Dimension;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

//import io.appium.java_client.remote.;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.*;
import io.appium.java_client.touch.offset.PointOption;
import config.common;
public class create_new_request {
  
  //static AppiumDriver driver;
  //static URL url;
  //static DesiredCapabilities cap;
  config.common com = new common();

  
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*
	  DesiredCapabilities cap = new DesiredCapabilities();
      cap.setCapability("deviceName", "Star 4");
      cap.setCapability("udid", "BCB00298680");
      cap.setCapability("platformName", "Android");1
      cap.setCapability("platformVersion", "11");
      cap.setCapability("appPackage","net.itads.tradein");
	  cap.setCapability("appActivity","com.itads.tradeinoffice.tradein.MainActivity");
	  URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	  System.out.println("Application Started");
      AppiumDriver driver = new AppiumDriver (url,cap);
      //khoi tao bien trong class
      create_new_request.cap = com.cap;
      create_new_request.url = com.url;
      */
	 
    
	  com.start_app();
  }
  
  
  
  @Test
  public void Case_001_Create_New_Request () throws Exception {
	  
	  AppiumDriver driver = new AppiumDriver (common.url,common.cap);
	/*
      String check_udid = (String) driver.getCapabilities().getCapability("udid");
      String check_os = (String) driver.getCapabilities().getPlatformName().name();
      String check_name = (String) driver.getCapabilities().getCapability("deviceName").toString();
      String check_android_version = (String) driver.getCapabilities().getCapability("platformVersion");
      System.out.println("UDID La "+check_udid);
      System.out.println("Device Name La "+check_name);
      System.out.println("Android Version La "+check_android_version);
      System.out.println("OS La "+check_os);
	*/
      Thread.sleep(3000);
      WebElement username = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
      username.click();   
      //username.sendKeys("sale.person.1");  
      username.sendKeys("puyos.man");
      Thread.sleep(2000);
      WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
      password.click();   
      password.sendKeys("Init123456");
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      WebElement signin = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign In\"]"));
      signin.click();
      Thread.sleep(8000);
      System.out.println("Login Successfully");
      //WebElement popup_confirm_1 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
      //popup_confirm_1.click();
      //Thread.sleep(2000);
      //WebElement popup_confirm_2 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
      //popup_confirm_2.click();
      //Thread.sleep(2000);
      //WebElement popup_confirm_3 = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
      //popup_confirm_3.click();
      //Thread.sleep(2000);
      //New Request Button
      WebElement new_request =  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"New Request\n"
      		+ "Get Price\"]"));
      new_request.isDisplayed();
      //Click on New Request Button
      new_request.click();
      Thread.sleep(3000);
      //Capture Screen
      WebElement vinid_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"VIN ID\"]"));
      vinid_label.getText().equals("VIN ID");
      //System.out.println("Checking VinId Label 🔎");
      //Verify Where To Get VIN ID
      WebElement where_to_get_vin = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Where to get Vin ID\"]"));
      where_to_get_vin.getText().equals("Where to get Vin ID");
     //Verify From Collection button
      WebElement from_collection_btn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"From collection\"]"));
      from_collection_btn.isDisplayed();
      //System.out.println("Checking From Collection Button 🔎");
      //Verify Skip button
      WebElement skip_btn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_btn.isDisplayed();
      //System.out.println("Checking Skip Button 🔎");
      //Verify Label Guide
      WebElement guide_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please fit the vehicle within the guide\"]"));
      guide_label.isDisplayed();
      //System.out.println("Checking Label Guide 🔎");
      //Verify Close Button
      WebElement close_btn = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Close\"]"));
      close_btn.isDisplayed();
      Thread.sleep(5000);
      //Capture button
      WebElement capture_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
      capture_btn.click();
      Thread.sleep(10000);
      //System.out.println("Checking Close Button 🔎");
      //Edit button
      System.out.println("Checking Edit Button 🔎");
      WebElement edit_btn = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
      edit_btn.click();
      Thread.sleep(10000);
      
      //Input Field
      //System.out.println("Checking Input Field 🔎");
      WebElement input_field = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
      input_field.click();
      Thread.sleep(2000);
      input_field.sendKeys("980009293994999");
      Thread.sleep(2000);
      //Done button
      WebElement done = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Done\"]"));
      done.click();
      //Next button
      WebElement next_btn = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_btn.click();
      Thread.sleep(15000);
  
      
      //Select Brand
      WebElement brand_field = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please select brand\"]"));
      brand_field.click();
      Thread.sleep(2000);
      WebElement selected_brand = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText/android.view.View/android.view.View/android.view.View[1]"));
      selected_brand.click();
      
      //Select Year
      WebElement year_field = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please select year\"]"));
      year_field.click();
      WebElement selected_year = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
      selected_year.click();
      
      //Select Model
      WebElement model = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please select model\"]/android.widget.Button"));
      model.click();
      WebElement selected_model = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText/android.view.View/android.view.View/android.view.View[2]"));
      selected_model.click();
      
      //Select Body
     // WebElement body = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please select body type\"]"));
      //body.click();
      //WebElement selected_body = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
      //selected_body.click();
      
      //Select fuel Type
      WebElement fuel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please select fuel type\"]"));
      fuel.click();
      WebElement selected_fuel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
      selected_fuel.click();
      
      //Next
      WebElement next = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next.click();
      Thread.sleep(5000);
      //Verify Front Label
      WebElement front_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Front\"]"));
      front_label.isDisplayed();
      Thread.sleep(500);
      //Verify Description label
      WebElement description_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please fit the vehicle within the guide\"]"));
      description_label.isDisplayed();
      Thread.sleep(500);
      //Verify Where to get vin id label
      WebElement where_get_vin_label = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Where to get Vin ID\"]"));
      where_get_vin_label.isDisplayed();
      Thread.sleep(500);
      //Verify Skip Button
      WebElement skip_btn_front = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_btn_front.isDisplayed();
      
      //Capture Front
      WebElement capture_front_btn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
      capture_front_btn.click();
      Thread.sleep(7000);
      
      //Next 
      WebElement next_front = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_front.click();
      Thread.sleep(2000);
      
      //Skip left
      WebElement skip_left = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_left.click();
      
      //Skip right
      WebElement skip_right = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_right.click();
      
     //Skip rear
      WebElement skip_rear = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_rear.click();
      
     //Skip steering wheel
      WebElement skip_steering = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]"));
      skip_steering.click();
      
     //Capture Mileage
      WebElement capture_mileage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
      capture_mileage.click();
      Thread.sleep(5000);
     //Edit Mileage
      WebElement edit_mileage = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
      edit_mileage.click();
      WebElement edit_mileage_field = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
      edit_mileage_field.click();
      WebElement edit_text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
      edit_text.sendKeys("224466");
      WebElement done_edit_mileage = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Done\"]"));
      done_edit_mileage.click();
      
      //Next
      WebElement next_mileage = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_mileage.click();
      Thread.sleep(5000);
      
      //Upload document
      //Verify Upload Document Label
      WebElement upload_doc_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
      upload_doc_label.isDisplayed();
      Thread.sleep(5000);
      
      //Select Vehicle Ownership
      WebElement upload_ownership = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Vehicle Ownership (*)\"]"));
      upload_ownership.click();
      Thread.sleep(2000);
      
      // Take new photo
      WebElement upload_ownership_take_photo = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Take New Photo\"]"));
      upload_ownership_take_photo.click();
      Thread.sleep(2000);
      
      // Capture Ownership
      WebElement upload_ownership_take_photo_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
      upload_ownership_take_photo_btn.click();
      Thread.sleep(5000);
      
      // Next upload
      WebElement upload_next = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      upload_next.click();
      Thread.sleep(8000);
      
      //Verify License Plate Number
      WebElement license_plate_number_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Lisence Plate Number\"]"));
      license_plate_number_label.isDisplayed();
      Thread.sleep(2000);
      
      //Scan Plate Number
      WebElement license_plate_number_scan = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Scan\"]"));
      license_plate_number_scan.click();
      Thread.sleep(3000);
      WebElement license_plate_number_scan_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
      license_plate_number_scan_btn.click();
      Thread.sleep(8000);
      
      //Edit Plate Number
      WebElement edit_plate_number_scan = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
      edit_plate_number_scan.click();
      Thread.sleep(3000);
      WebElement edit_plate_number_field = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
      edit_plate_number_field.sendKeys("n980");
      Thread.sleep(1000);
      
      //Select Region
      WebElement select_region = driver.findElement(By.xpath("//android.view.View[@content-desc=\"--\"]"));
      select_region.click();
      Thread.sleep(1000);
      WebElement selected_region = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
      selected_region.click();
      Thread.sleep(1000);
      
      //Select Exterior Color
      WebElement select_exterior_color = driver.findElement(By.xpath("//android.view.View[@content-desc=\"exterior\n"
      		+ "--\"]"));
      select_exterior_color.click();
      Thread.sleep(1000);
      WebElement selected_exterior_color = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText/android.view.View/android.view.View/android.view.View[2]"));
      selected_exterior_color.click();
      Thread.sleep(1000);
      WebElement ok_exterior = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
      ok_exterior.click();
      
      //Select Interior Color
      WebElement select_interior_color = driver.findElement(By.xpath("//android.view.View[@content-desc=\"interior\n"
      		+ "--\"]"));
      select_interior_color.click();
      Thread.sleep(1000);
      WebElement selected_interior_color = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText/android.view.View/android.view.View/android.view.View[2]"));
      selected_interior_color.click();
      Thread.sleep(1000);
      WebElement ok_interior = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
      ok_interior.click();
      
      //Select selling purpose
      
  	
     
      WebElement selling_purpose_label = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Selling Purpose\"]"));
      
/* 
      JavascriptExecutor js = (JavascriptExecutor) driver;
      HashMap<String, String> scrollObject = new HashMap<String, String>();
      scrollObject.put("direction", "down");
      scrollObject.put("element", ((RemoteWebElement) selling_purpose_label).getId());
      js.executeScript("mobile: scroll", scrollObject);
      */

      WebElement tradein_nc = driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Trade-in NC\"]"));
      tradein_nc.click();
      Thread.sleep(1000);
      WebElement tradein_uc = driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Trade-in UC\"]"));
      tradein_uc.click();
      Thread.sleep(1000);
      WebElement tradein_uc_input_field = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
      tradein_uc_input_field.click();
      tradein_uc_input_field.sendKeys("Some Thing To Write in this field");
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement sell_only = driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Sell Only\"]"));
      sell_only.click();
      Thread.sleep(1000);
      
      //Scroll into Expected Price
      WebElement expected_price_field = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
      Thread.sleep(1000);
      expected_price_field.click();
      Thread.sleep(3000);
      WebElement expected_price_field_input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
      expected_price_field_input.sendKeys("900000");
      Thread.sleep(1000);
      //Next 
      WebElement next_to_customer = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_to_customer.click();
      Thread.sleep(6000);
      
      //Customer Name
      WebElement customer_name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
      customer_name.click();
      Thread.sleep(1000);
      WebElement customer_name_input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
      customer_name_input.sendKeys("Minh Thang Tran");
      Thread.sleep(1000);
      
      //Customer phone
      WebElement customer_phone = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
      customer_phone.click();
      Thread.sleep(2000);
      WebElement customer_phone_input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
      customer_phone_input.sendKeys("0999998765");
      
      //Location
      WebElement location = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));
      location.click();
      Thread.sleep(2000);
      WebElement location_input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));
      location_input.sendKeys("Bangkok");
      
      //Back
      driver.navigate().back();
      
      //Chooose from Map
      WebElement map = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Choose from map\"]"));
      map.click();
      Thread.sleep(5000);
      WebElement map_search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
      map_search.click();
      Thread.sleep(1000);
      WebElement map_search_input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
      map_search_input.click();
      WebElement map_search_input_text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
      map_search_input_text.sendKeys("Bangkok");
      Thread.sleep(3000);
      //Back
      driver.navigate().back();
      Thread.sleep(1000);
      WebElement map_search_selected = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Bangkok, Thailand\"]"));
      map_search_selected.click();
      Thread.sleep(3000);
      WebElement map_search_selected_confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select here\"]"));
      map_search_selected_confirm.click();
      Thread.sleep(3000);
      
    //Back
      driver.navigate().back();
      
      //Next to Insurance
      WebElement next_to_insurance = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_to_insurance.click();
      Thread.sleep(6000);
      
      // Select Insurance Type
      WebElement insurance_type = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button[1]"));
      insurance_type.click();
      Thread.sleep(1000);
      WebElement insurance_type_selected = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Type 2\"]"));
      insurance_type_selected.click();
      Thread.sleep(1000);
      
   // Select company Insurance
      WebElement insurance_company = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button[2]"));
      insurance_company.click();
      Thread.sleep(4000);
      WebElement insurance_company_selected = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Bangkok insurance\"]"));
      insurance_company_selected.click();
      Thread.sleep(1000);
      
      //Select Expiry Insurance
      WebElement insurance_expiry = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"--\"])[1]"));
      insurance_expiry.click();
      Thread.sleep(2000);
      WebElement insurance_expiry_selected = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
      insurance_expiry_selected.click();
      Thread.sleep(1000);
      
      //Check PBR The Same
      WebElement pbr_check = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Same date as insurance\"]"));
      pbr_check.click();
      Thread.sleep(1000);
      
      //Next To Last Page
      WebElement next_to_last = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]"));
      next_to_last.click();
      Thread.sleep(5000);
      // Save Request
      WebElement save_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]"));
      save_btn.click();
      //WebElement notification_message = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Notifications\n"
      	//	+ "Please be patient while we review an offer to you\"]"));
      //notification_message.isDisplayed();
      Thread.sleep(2000);
      //Update Request
      /*
      WebElement update_btn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Update\"]"));
      update_btn.click();
      Thread.sleep(2000);
      
      WebElement accept_btn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Accept & Request Survey\"]"));
      accept_btn.click();
      Thread.sleep(2000);
      */
      
  } 
  @AfterTest
  public void afterTest() throws Exception{
	  

  }

}
