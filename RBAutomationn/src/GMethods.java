import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.common.FindBy;
import com.automation.common.Gestures;
import com.automation.common.TestCase;

public class GMethods {
	TestCase.AppiumMobileAndroidApplication tc ;
	String DeviceObject=null;
	public GMethods(TestCase.AppiumMobileAndroidApplication tc){
		this.tc=tc;
	}
	
	
	
	public void LaunchRBApp(String DeviceObject) throws Exception
	{   try{
		tc.userWait(5);
		this.DeviceObject=DeviceObject;
		tc.logMessageToFile("############ Launch The App-START");
		tc.open(DeviceObject,0);
		tc.userWait(8);
		List<WebElement> Locale_Screen =tc.getWebElements(ElementLocators.selection_indicator, FindBy.ID);
		System.out.println(Locale_Screen.size());
		Locale_Screen.get(0).click();	
		tc.userWait(5);
		tc.clickElement(ElementLocators.Splash_Cntnue, FindBy.ID);
		tc.clickElement(ElementLocators.Login, FindBy.ID);
		tc.clickElement(ElementLocators.gplus_sign_in_button, FindBy.ID);
		tc.clickElement(ElementLocators.account_profile_picture, FindBy.ID);
		//tc.clickElement("//android.widget.TextView[contains(@resource-id,'com.google.android.gms:id/account_name') and @text='surendramd1111@gmail.com']", FindBy.XPATH);
		tc.userWait(10);
		} 
	    catch(Exception e){
	    	tc.screenshot_capture();
	}

	}
	
	

	public void HomeScreen() throws Exception{
		
		try{
		tc.clickElement("in.redbus.android:id/cityName1", FindBy.ID);
		tc.sendText(ElementLocators.SearchBus_SourceCityName_NAME, "Bengaluru", FindBy.ID);		 //Jamnagar
		tc.clickElement(ElementLocators.SearchBus_DestinationCityName_Name, FindBy.ID);
		tc.clickElement("in.redbus.android:id/cityName2", FindBy.ID);
		//tc.clickElement(ElementLocators.SelectBus_SourceCityName_Name, FindBy.ID);
		//tc.clickElement(ElementLocators.SelectBus_SourceCityName_Name, FindBy.ID);
		tc.sendText(ElementLocators.SearchBus_DestinationCity_Name, "Chennai", FindBy.ID);	
		tc.userWait(5);
		//Rajkot
		tc.clickElement(ElementLocators.SearchBus_DestinationCityName_Name, FindBy.ID);
		//tc.clickElement("//android.widget.TextView[contains(@resource-id,'in.redbus.android:id/citySuggest') and @text='Chennai']", FindBy.XPATH);
		//tc.clickElement("//*[contains(text(),'Chennai')]", FindBy.XPATH);
		//tc.clickElement(ElementLocators.SearchBus_DestinationCityName_Name, FindBy.ID);
		tc.clickElement(ElementLocators.calanderWidget, FindBy.ID);
		tc.clickElement(ElementLocators.SelectDate, FindBy.ID);
		Thread.sleep(3000);
	} 
    catch(Exception e){
    	tc.screenshot_capture();
}
		
	}
	

	public void SRP_Page() throws Exception
	{ 
		try{
		Thread.sleep(100);
		List<WebElement> SRP =tc.getWebElements(ElementLocators.travelsList, FindBy.ID);
        SRP.get(2).click();
        Thread.sleep(5000);
		} 
	    catch(Exception e){
	    	tc.screenshot_capture();
	}
        
	}
	
	
//	public void SelectSeat() throws Exception{
//		try{
//		tc.logMessageToFile("********************************SelectSeat-START********************************");
//		Integer x=122,y=360;
//		tc.userWait(10);
//		tc.gesture(Gestures.Tap.TAPCOORDINATES, x, y);
//		//tc.clickElement(Android.SL_DoneBtn_ID, FindBy.ID);
//		System.out.println("Clicked on x & y co-ordinates");
//		Boolean flag = false;
//		while(flag==false){
//			y = y + 80;
//			System.out.println(x+" "+y);
//			if(tc.webElementPresent(ElementLocators.Btn_Done, FindBy.XPATH)){
//				flag = false;
//				tc.clickElement(ElementLocators.Btn_Done, FindBy.XPATH);
//			}
//			else {
//				flag = true;
//			}
//		}
//		tc.logMessageToFile("********************************SelectSeat-END********************************");
//		Thread.sleep(1000);
//		} 
//	    catch(Exception e){
//	    	tc.screenshot_capture();
//	}
//	}
	public void SelectSeat() throws Exception{
		try{
		tc.logMessageToFile("********************************SelectSeat-START********************************");
		//tc.gesture(name, findBy, gestureType, count);
		Integer x=100,y=150, xitr=18 , yitr=13;
        
		
		//tc.clickElement(Android.SL_DoneBtn_ID, FindBy.ID);
		
		Boolean seatfound = false;

		
			
		for (int i=1; i<=xitr; i++){
		
			    x = x + 20;
			    y=150;	    	    
				
			for (int j=1; j<=yitr; j++){
				y = y + 50;	
				    tc.gesture(Gestures.Tap.TAPCOORDINATES, x, y);
					System.out.println("Clicked co ordinates");
					
					//if(tc.getWebElements("//*[contains(text(),'Policies')]", FindBy.XPATH).get(0).isDisplayed()==false){
					if(tc.getWebElements("in.redbus.android:id/info_holder", FindBy.ID).get(0).isDisplayed()==false){
					
					//   
					//if(tc.getWebElements(ElementLocators.Btn_Done, FindBy.ID).get(0).isDisplayed()){
						System.out.println("Clicked co fgydtyf ordinates"+ i +j);
						//tc.getWebElements(ElementLocators.Btn_Done, FindBy.ID).get(0).click();
						tc.clickElement(ElementLocators.Btn_Done, FindBy.ID);
						seatfound=true;
						break;
						
					}
					System.out.println("Clicked co yfgyufuy ordinates"+ i +j);
			}
					if(seatfound==true){
						break;
					}	
					
			}
			

		tc.logMessageToFile("********************************SelectSeat-END********************************");
		Thread.sleep(1000);
		} 
	    catch(Exception e){
	    	//tc.screenshot_capture();
	    	System.out.println(e.getMessage());
	}
	}
	

	public  void Select_BP_DP() throws Exception
	{
		try{
		List<WebElement> BP =tc.getWebElements(ElementLocators.BP, FindBy.ID);
		BP.get(0).click();
		
		List<WebElement> DP =tc.getWebElements(ElementLocators.DP, FindBy.ID);
		DP.get(0).click();
		} 
	    catch(Exception e){
	    	tc.screenshot_capture();
	}
		
	  }
	
	
	
	public void MPAX() throws Exception
	{
		try{
		Thread.sleep(10000);
	
		tc.clickElement(ElementLocators.SecureTrip, FindBy.ID);
		tc.clickElement(ElementLocators.MPAXCntn, FindBy.ID);
		Thread.sleep(8000);
		} 
	    catch(Exception e){
	    	tc.screenshot_capture();
	}
	}


	public void Payments() throws Exception{
		try{
		   WalletTransaction();		
		} 
	    catch(Exception e){
	    	tc.screenshot_capture();
	}
	}
	
	
	 public void WalletTransaction() throws Exception
	 {
		 tc.clickElement(ElementLocators.Select_wallet_check_box, FindBy.ID);		 
		 tc.clickElement(ElementLocators.walletPay , FindBy.XPATH);

	 }
	 
//	 public void SavedCardTransaction() throws Exception
//	 {
//		    Integer Saved_x=469,Saved_y=1089;    /*Saved Cards*/
//			
//			System.out.println("Got x & y co-ordinates");
//			System.out.println("Got x & y co-ordinates"+Saved_x+Saved_y);
//			tc.gesture(Gestures.Tap.TAPCOORDINATES, +Saved_x,Saved_y); 
//	 }
//	 
//	 public void RBOfferTransaction()
//	 {
//			Integer Offer_x=536,Offer_y=660;    /*Offers*/
//			
//			System.out.println("Got x & y co-ordinates");
//			System.out.println("Got x & y co-ordinates"+Offer_x+Offer_y);
//			tc.gesture(Gestures.Tap.TAPCOORDINATES, Offer_x,Offer_y);
//	 }

}
