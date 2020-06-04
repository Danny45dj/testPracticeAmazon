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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.waitForElementVisible(findTestObject('Main Portal/changeLanguage'), 30)

WebUI.mouseOver(findTestObject('Main Portal/changeLanguage'))

WebUI.click(findTestObject('Main Portal/optionEnglishLang'))

WebUI.setText(findTestObject('Home Portal/inputSearch'), GlobalVariable.searchValueAmazon)

WebUI.click(findTestObject('Home Portal/buttonSearch'))

WebUI.verifyElementVisible(findTestObject('Home Portal/firstElementPresent'))

WebUI.click(findTestObject('Home Portal/firstElementPresent'))

WebUI.verifyElementClickable(findTestObject('Home Portal/buttonAddToCart'))

WebUI.click(findTestObject('Home Portal/buttonAddToCart'))

String cartSubTotal = WebUI.getText(findTestObject('Home Portal/messageDetailAddToCart'))

String countCart = WebUI.getText(findTestObject('Object Repository/Home Portal/countCart'))

String content = (cartSubTotal.split('Cart subtotal')[1]).substring(2, 3)

WebUI.verifyEqual(content, countCart)

WebUI.verifyElementText(findTestObject('Home Portal/messageValidationForAddToCart'), GlobalVariable.messageValidationForAddToCart)

