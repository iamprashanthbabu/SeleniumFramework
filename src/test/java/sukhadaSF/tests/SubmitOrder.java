package sukhadaSF.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sukhadaSF.pageobject.ProductCatalogue;
import sukhadaSF.testComponents.BaseTest;

public class SubmitOrder extends BaseTest{
		
	
	@Test(dataProvider="getData")
	
	public void submitOrder(HashMap<String,String> input) {
		
		ProductCatalogue productCatalogue = loginPage.applicationLogin(input.get("email"), input.get("password"));				
		
	}
		
	@DataProvider
	public Object[][] getData() throws IOException
	{

		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//sukhadaSF//data//PurchaseOrder.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	}

	

}
