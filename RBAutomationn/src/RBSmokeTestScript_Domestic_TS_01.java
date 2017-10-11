import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.automation.common.FindBy;
import com.automation.common.Gestures;
import com.automation.common.TestCase;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.automation.common.ControlProperties;
import com.automation.common.FindBy;
import com.automation.common.TestCase;
import com.automation.common.Gestures;
import com.automation.common.Gestures.Swipe;
import com.automation.common.Gestures.Tap;
import com.automation.common.TestCase.AppiumMobileAndroidApplication;
import com.automation.common.Retry;

public class RBSmokeTestScript_Domestic_TS_01 
{
	AppiumMobileAndroidApplication tc = new TestCase().new AppiumMobileAndroidApplication();
	GMethods GM =new GMethods(tc);
	String filepath =null;
	Process p;
	
	@BeforeTest
	public void setApplicationEnvironment() throws Exception{
		p = Runtime.getRuntime().exec(System.getProperty("user.dir")+"/uninstall.sh");
		tc.setApplicationEnvironment(filepath);
	}
	
	@Test
	@Parameters("DeviceObject")
	public void LaunchRBApp(String DeviceObject) throws Exception
	{   	
		GM.LaunchRBApp(DeviceObject);
		GM.HomeScreen();
		GM.SRP_Page();
		GM.SelectSeat();
		GM.Select_BP_DP();
		GM.MPAX();
       // GM.Payments();

	}
	
}
	
	



