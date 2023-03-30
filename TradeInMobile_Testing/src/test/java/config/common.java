package config;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.*;

import create_new_request.create_new_request;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.remote.;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.*;
/*
import android.os.Build;
import android.os.Bundle;
android.os.Build.MODEL;
*/
public class common {
	
	public static AppiumDriver driver;
	public static URL url;
	public static DesiredCapabilities cap;
	public static int set_server;
	private static String deviceName1;
	private static String platformVersion;
	
	
	
	
	  public static int scan_server () {
    	  Scanner scan = new Scanner(System.in);  
          System.out.println("Select Server Test : ");
          System.out.println("1. Develop 💻");
          System.out.println("2. Product 🅿️ ");
          System.out.print("Your choice 👉_  ");
      int selected_server = scan.nextInt();
      common.set_server = selected_server; 
      return selected_server;
      }
	  /*
      if(selected_server==1) {
    	  System.out.println("Trade In Mobile");
    	  Thread.sleep(1000);
    	  System.out.println("Testing On Develop Server");
      }
      if(selected_server==2) {
    	  System.out.println("Trade In Mobile");
    	  Thread.sleep(1000);
    	  System.out.println("Testing On Product Server");
      }else {
    	  System.out.println("Select Server Test : ");
          System.out.println("1. Develop");
          System.out.println("2. Product");
    	  
      }
      
      System.out.println("");  
      String sname = scan.next();  
      System.out.println("Your Rollno:" + rllnum + " name:" + sname);
      */
	/*
	static AppiumDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			//openCalculator();
			mobile();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
			
		}
		
	}
	*/
	public void start_app () throws Exception {
		try {
			wellcome ();
			getDeviceName();
			System.out.println("Device Name is " + getDeviceName());
			getPlatformVersion();
			System.out.println("Platform Version is Android " + getPlatformVersion());
			scan_server();
			mobile();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getLocalizedMessage());
			exp.printStackTrace();
		}
	}
	
	public static void wellcome () throws Exception {
		System.out.println("🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸");
		System.out.println("🔸 🇼 🇪 🇱 🇱 🇨 🇴 🇲 🇪                 ");
		System.out.println("");
		System.out.println("🔸 🆃🆁🅰🅳🅴  🅸🅽                            ");
		Thread.sleep(500);
		System.out.println("🔸 Program : Automated Mobile Test          ");
		Thread.sleep(500);
		System.out.println("🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸");
		Thread.sleep(500);
		System.out.println("Checking device 📀");
		int j;
		for (j=0; j<5 ; j++) {
			System.out.print("🚀 ");
			Thread.sleep(20);
		}
		System.out.println("");
		Thread.sleep(500);
		
	}
	//@SuppressWarnings("deprecation")
	public static void mobile () throws Exception {
		String app_package = null;
		   if(common.set_server ==1) {
		    	  System.out.println("Trade In Mobile");
		    	  Thread.sleep(1000);
		    	  System.out.println("Testing On Develop Server 💻");
		    	  app_package = "com.itads.tradeinoffice.tradein";
		    	
		      }
		      if(common.set_server==2) {
		    	  System.out.println("Trade In Mobile");
		    	  Thread.sleep(1000);
		    	  System.out.println("Testing On Product Server 🅿️");
		    	  app_package = "net.itads.tradein";
		      }else if(common.set_server != 1 && common.set_server != 2) {
		    	  int i;
		    	  for (i=0; i<20; i++) {
		    		  System.out.print("⛔️");
		    		  Thread.sleep(200);
		    	  }
		    	  System.out.println("");
		    	  
		    	  System.out.println("Please Select Server Test (Only 1️⃣ or 2️⃣ is accepted !)");
		          common.scan_server();
		      }
		      
		DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability("deviceName", "Star 4");
        //cap.setCapability("deviceName", common.deviceName);
        //cap.setCapability("udid", common.udid);
		//Set UDID of Device
        cap.setCapability("udid", common.deviceName1);
        //Set Platform Name
        cap.setCapability("platformName", "Android");
        //Set Platform Version
        cap.setCapability("platformVersion", common.platformVersion);
        //Auto Allow All Permission
        cap.setCapability("autoGrantPermissions", "true");

        //cap.setCapability("platformVersion", common.platformVersion);
        //cap.setCapability("appPackage","net.itads.tradein");
        cap.setCapability("appPackage",app_package);
		cap.setCapability("appActivity","com.itads.tradeinoffice.tradein.MainActivity");
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		System.out.println("Trade In X Application Started ...");
        //AppiumDriver driver = new AppiumDriver (url,cap);
        common.cap = cap;
        common.url = url; 
	}








	static String getDeviceName() {
	    String deviceName = "";
	    String shellCommand = "adb get-serialno"; // For platform use : adb shell getprop ro.build.version.release

	    try {
	    	//Shell open Terminal in Linux to run scripts
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",  shellCommand);
	        builder.redirectErrorStream(true);
	        Process prc = builder.start();
	        BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
	        deviceName = output.readLine();
	        prc.waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    common.deviceName1 = deviceName;
	    System.out.println(deviceName);
	    return deviceName;
	}

	
	static String getPlatformVersion() {
	    String platformVersion = "";
	    String shellCommand = "adb shell getprop ro.build.version.release"; // For platform use : adb shell getprop ro.build.version.release

	    try {
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", shellCommand);
	        builder.redirectErrorStream(true);
	        Process prc = builder.start();
	        BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
	        platformVersion = output.readLine();
	        prc.waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    common.platformVersion = platformVersion;
	    
	    return platformVersion;
	}
	
	
	
}
	
	
