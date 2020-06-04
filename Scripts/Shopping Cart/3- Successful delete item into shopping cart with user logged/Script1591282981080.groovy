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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Shopping Cart/2- Successful addToCart without user logged'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home Portal/buttonCart'))

WebUI.click(findTestObject('Home Portal/Shopping Cart/buttonQty'))

WebUI.click(findTestObject('Home Portal/Shopping Cart/OptionDeleteQty'), FailureHandling.STOP_ON_FAILURE)

String shoppingSubTotal = WebUI.getText(findTestObject('Object Repository/Home Portal/Shopping Cart/messageDetailShoppingCart'))

String countCart = WebUI.getText(findTestObject('Object Repository/Home Portal/countCart'))

String contentSubTotal = (shoppingSubTotal.split('Subtotal')[1]).substring(2, 3)

println(contentSubTotal)

WebUI.verifyEqual(contentSubTotal, countCart)

WebUI.closeBrowser()

