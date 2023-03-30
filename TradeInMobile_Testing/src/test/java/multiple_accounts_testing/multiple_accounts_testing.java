package multiple_accounts_testing;

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
public class multiple_accounts_testing {
  
  config.common com = new common();

	  
  @BeforeTest
  public void beforeTest() throws Exception {
	com.start_app();
  }
	
  @Test
  public void account_test() throws Exception {
	  AppiumDriver driver = new AppiumDriver (com.url,com.cap);
	  Thread.sleep(3000);
	  //"puyos.man","suthada.jam","phuwadol.srichampa","chutikarn.thangkitcharoenrot","waranyu.malikul","wipawee.srisakda","kodchaporn.mooksri","tanyared.wadudom","thidarat.kusolkumbot","witsarut.sak",
	  String pass = "Init123456";
	  int i;
	  String user_name[] = {"puyos.man","suthada.jam","phuwadol.srichampa","chutikarn.thangkitcharoenrot","waranyu.malikul","wipawee.srisakda","kodchaporn.mooksri","tanyared.wadudom","thidarat.kusolkumbot","kullaporn.rungaudomsup","tachar.nateelertphadung","nithipoj.rujichai","wiranat.pathomcharoenroth",
			  "worrawut.wongtaecha","chanon.panupaisal","cheryada.jiaranairungroch","anongporn.chusri","prakasit.patarapolprut","yutthasard.thongjerm","titipong.ratanachottrakul","chairit.unh","korakod.pan","panupan.wiw","cherdluck.khumsawad","arisa.kit","kannika.saramont","nareerat.upp","rungnapa.roe","komkorn.dan","arkom.tum","jittra.pra",
			  "kannika.sun","nat.din","tanathuch.pan","nadphapat.sir","poorich.cha","raveewan.tha","teerasak.mee","natthawat.poo","kanin.tim","paphonthanai.kiattisakkajorn","karn.mah","phakkanat.jinamanee","butree.molipan","rotjana.mun","sutanya.kas","tawan.rak","jansuda.bin","poonpailin.jan","pheukjika.nil","chutiya.pha","kasem.hemman",
			  "khanittha.saweangdee","punnapa.khw","supanan.pum","nantawat.tec"};
	  System.out.println("Total User : " + user_name.length);
	  for(i=0;i<user_name.length;i++) {
		  WebElement username = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
	      username.click();   
	      //username.sendKeys("sale.person.1");  
	      username.sendKeys(user_name[i]);
	      Thread.sleep(2000);
	      WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
	      password.click();   
	      password.sendKeys(pass);
	      Thread.sleep(2000);
	      driver.navigate().back();
	      Thread.sleep(2500);
	      WebElement signin = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign In\"]"));
	      signin.click();
	      Thread.sleep(6000);
	      int j = i+1;
	      System.out.println(j + ". " + user_name[i] + "  ✅ ");
	      //Logout
	      WebElement profile_btn = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\n"
	      		+ "Tab 4 trong tổng số 4\"]"));
	      profile_btn.click();
	      Thread.sleep(3000);
	      WebElement log_out_btn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign out\"]"));
	      log_out_btn.click();
	      Thread.sleep(3000);
	  }
      
  }
 

  @AfterTest
  public void afterTest() {
  }

}
