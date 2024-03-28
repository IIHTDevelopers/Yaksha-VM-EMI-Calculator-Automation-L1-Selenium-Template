package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emi_Calculator_L1_Pages extends StartupPage{

	By personalFinancepage=By.xpath("");
	By toolsButton=By.xpath("");
	By homeLoanEmiCalculator=By.xpath("");
	By loanAmountTextField=By.xpath("");
	By loanPeriodTextField=By.xpath("");
    By interestRateTextField=By.id("");
    By upfrontChargesTextField=By.id("");
    By submitButton=By.xpath("");
    By totalPaymentReadOnlyField=By.id("");
    By emiReadOnlyField=By.id("");
    By emiPaymentInTheYear=By.xpath("");
    By interestPaymentInTheYear=By.xpath("");
    By principlePaymentInTheYear=By.xpath("");
    By OutstandingPrincipalAtEndOfYear=By.xpath("");


	String pageName = this.getClass().getSimpleName();

	public Emi_Calculator_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method mouseHoverOnPersonalFinanceAndClickOnTools() 
	 * @param : null
	 * @description : mouse Hover On Personal Finance And Click On Tools
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean mouseHoverOnPersonalFinanceAndClickOnTools() throws Exception {
		
		return false;
	}
	
	/**@Test2
	 * about this method clickonHomeLoanEMICalculator() 
	 * @param : null
	 * @description : click on home loan EMI calculator
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonHomeLoanEMICalculator() throws Exception {
		
		return false;
	}
	
	/**@Test3
	 * about this method entertheLoadAmountAs3000000() 
	 * @param : Map<String, String>
	 * @description : clear the data in the loan Amount TextField and put the data in loanAmountTextField
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String entertheLoadAmountAs3000000(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test4
	 * about this method enterTheLoadPeriodAs20() 
	 * @param : Map<String, String>
	 * @description : clear the data in the Load Period TextField enter The Load Period As 20
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterTheLoanPeriodAs20(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test5
	 * about this method enterInterestRateAs10_5() 
	 * @param : Map<String, String>
	 * @description : clear the data in the interestRateTextField enter The Interest Rate As 10.5
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String enterInterestRateAs10_5(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test6
	 * about this method enterUpfrontChargesAs10000() 
	 * @param : null
	 * @description : clear the data in the upfront Charges TextField and enter Up front Charges As 10000
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String enterUpfrontChargesAs10000(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test7
	 * about this method clickOnSubmitButton() 
	 * @param : null
	 * @description : click On Submit Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnSubmitButton() throws Exception {
		
		return false;
	}
	
	/**@Test8
	 * about this method printTotalPaymentandEMIInConsole() 
	 * @param : null
	 * @description : print Total Payment and EMI In Console
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printTotalPaymentandEMIInConsole() throws Exception {
		
		return false;
	}
	
	/**@Test9
	 * about this method printEmiPaymentInterestPaymentPrincipalPaymentOf7thYear() 
	 * @param : null
	 * @description : print Emi Payment Interest Payment Principal Payment Of 7thYear
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printEmiPaymentInterestPaymentPrincipalPaymentOf7thYear() throws Exception {
		
		return false;
	}
	
	/**@Test10
	 * about this method printOutstandingPrincipalAtEndOfYearValueFor5thYearIntheTable() 
	 * @param : null
	 * @description : print Outstanding Principal At End Of Year Value For 5th Year In the Table
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printOutstandingPrincipalAtEndOfYearValueFor5thYearIntheTable() throws Exception {
		
		return false;
	}
}
