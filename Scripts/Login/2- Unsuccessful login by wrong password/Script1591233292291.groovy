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

WebUI.mouseOver(findTestObject('Main Portal/changeLanguage'))

WebUI.click(findTestObject('Main Portal/optionEnglishLang'))

WebUI.mouseOver(findTestObject('Main Portal/accountList'))

WebUI.click(findTestObject('Main Portal/buttonSignIn'))

WebUI.setText(findTestObject('Login Portal/inputEmail'), GlobalVariable.email)

WebUI.click(findTestObject('Login Portal/buttonContinue'))

String emailVerified = WebUI.getText(findTestObject('Object Repository/Login Portal/emailVerified'))

String originalEmail = GlobalVariable.email

emailVerified.equals(originalEmail)

WebUI.setText(findTestObject('Login Portal/inputPassword'), GlobalVariable.passwordFake)

WebUI.click(findTestObject('Login Portal/buttonSignIn'))

//Está sección tambien provocará errores debido al nivel de seguridad de Amazon
String warningErrorMessage = WebUI.getText(findTestObject('Object Repository/Login Portal/messageWrongPassword'))

String messageWrongPassword = GlobalVariable.messageWrongPassword

warningErrorMessage.equals(messageWrongPassword)

WebUI.closeBrowser()

