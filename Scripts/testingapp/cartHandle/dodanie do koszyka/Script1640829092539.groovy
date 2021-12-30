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
 * dodajemy do koszyka
 */

WebUI.click(findTestObject('Object Repository/testingapp/storePage/addToCartBtn'))

String cartValue = WebUI.getText(findTestObject('Object Repository/testingapp/storePage/cartIconValue'))

if (cartValue == "1") {
	WebUI.click(findTestObject('Object Repository/testingapp/storePage/cartIcon'))
}

String productTitle = WebUI.getText(findTestObject('Object Repository/testingapp/cartPage/productTitle'))

assert productTitle == productName

/*
*zamykamy przeglądarkę
*/

WebUI.closeBrowser()
