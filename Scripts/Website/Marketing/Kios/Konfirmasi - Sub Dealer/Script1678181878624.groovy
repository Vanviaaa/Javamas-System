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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fe-staging.kumpulkebon.com/login')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_login (1)'), 'support@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_password (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Login/button_Masuk (1)'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support - Dashboard/a_Sub Dealer'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support - Dashboard/a_Konfirmasi  Sub-Dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Support/input_Filter_searchAll'), 'PT CINTA CEJAHTERA')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Support/input_Filter_searchAll'), Keys.chord(
        Keys.ENTER))

WebUI.verifyTextPresent('PT CINTA CEJAHTERA', false)

WebUI.verifyTextPresent('+621234566789', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/input_PT CERIA SEJAHTERA_btn btn-sm btn-tab_2dcee3'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Support/check input DRA'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Support/check input SIUP'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Support/check input SUB DEALER'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Support/check input KTP'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/button_Setujui (1)'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/button_Ya (1)'))

WebUI.delay(10)

WebUI.closeBrowser()

