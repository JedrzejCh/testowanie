import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser(GlobalVariable.url)

/*
*wpisujemy login oraz hasło
*/

WebUI.setText(findTestObject('Object Repository/testingapp/pageLogin/inp_login'),user_login)

WebUI.setText(findTestObject('Object Repository/testingapp/pageLogin/inp_password'),user_password)

/*
 * klikamy zaloguj
 */

WebUI.click(findTestObject('Object Repository/testingapp/pageLogin/btn_login'))

/*
*zamykamy przeglądarkę
*/

WebUI.closeBrowser()


//try
//{
	/*
	 * Uruchomienie przegladarki
	 */
//	WebUI.openBrowser(GlobalVariable.url)
	
	

//	for (def row = 1; row <= findTestData('logindata').getRowNumbers(); row++) {
	
		/*
		 * Ustawienie/wpisanie wartosci ze zmiennej user_name dla pola user_name
		 */
//		WebUI.setText(findTestObject('Object Repository/testingapp/pageLogin/inp_login'),
//			findTestData('logindata.csv').getValue('user_login', row))
//		WebUI.setText(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/input_username'),
//			 findTestData('WSIZ/WSIZ_DATA_Logowanie_elearning').getValue('user_name', row))
		/*
		 * Ustawienie/wpisanie wartosci ze zmiennej pwd dla pola password
		 */
//		WebUI.setText(findTestObject('Object Repository/testingapp/pageLogin/inp_password'),user_password)
		/*
		 * Klikniecie na obiekt login_loginbtn
		 */
//		WebUI.click(findTestObject('Object Repository/testingapp/pageLogin/btn_login'))
		/*
		 * Zatrzymanie skryptu - wartosc ze zmiennej timeDelay
		 */
//		WebUI.delay(GlobalVariable.timeDelay)
		/*
		 * Sprawdzenie nazwy uzytkownika
		 */
//		String msgErrorElearning = WebUI.getText(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/span_Niewlasciwa_nazwa_uzytkownika'))
//		if (msgErrorExpected == msgErrorElearning)
//		{
//			println('Komunikat poprawny')
//		}
//		else
//		{
//			throw new com.kms.katalon.core.exception.StepErrorException('Błędny komunikat dla użytkownika. Oczekiwano: ' + msgErrorExpected + ' dane z elearningu: ' + msgErrorElearning)
//		}
//	}
//}
//catch (StepErrorException e)
//{
//	this.println (e)
//}
//catch (Exception e)
//{
//	e.printStackTrace()
//}
//finally
//{
	/*
	 * Zamkniecie przegladarki
	 */
//	WebUI.closeBrowser()
//}