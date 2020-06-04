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
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

WebUI.openBrowser(GlobalVariable.Url)

WebUI.mouseOver(findTestObject('Main Portal/changeLanguage'))

WebUI.click(findTestObject('Main Portal/optionEnglishLang'))

WebUI.mouseOver(findTestObject('Main Portal/accountList'))

WebUI.click(findTestObject('Main Portal/buttonSignIn'))

WebUI.setText(findTestObject('Login Portal/inputEmail'), GlobalVariable.email)

WebUI.click(findTestObject('Login Portal/buttonContinue'))

WebUI.setText(findTestObject('Login Portal/inputPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Login Portal/buttonSignIn'))

/*
 * 
 * Esta sección es para validar el acceso mediante la verificación OTP: (Envio y retorno de Código de Verificación)
 * Debido a que Amazon cuenta con una seguridad que no puedo controlar, decidí comentar está parte del código
 * 
 */
/*
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Login Portal/OTP/messageValidationOTP'), 10, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('null'))

    WebUI.delay(10)

    String emailContent = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'(GlobalVariable.email, 
        GlobalVariable.password, GlobalVariable.folderLableName)

    String contentNumber = emailContent.substring(2713, 2719)

    WebUI.setText(findTestObject('Login Portal/OTP/inputOTPCodeAuth'), contentNumber)

    WebUI.click(findTestObject('Login Portal/OTP/buttonOTPAuth'))
} else {
    String validTextLogin = WebUI.getText(findTestObject('Object Repository/Login Portal/messageSuccessLogin'))

    validTextLogin.equals('Hello, Katalon')
}
*/

