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

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_login'), 'support@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support - Dashboard/a_Kios'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support - Dashboard/a_Konfirmasi Kios'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Support/input_Filter_nameKios'), 'PT CINTA CEJAHTERA')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Support/input_Filter_nameKios'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/button_Konfirmasi'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/button_Setujui'))

WebUI.verifyElementText(findTestObject('Object Repository/Object Kios/Page_Marketing Support/strong_Anda yakin akan MENYETUJUI Kios tersebut'), 
    'Anda yakin akan MENYETUJUI Kios tersebut?')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Support/button_Ya'))

WebUI.closeBrowser()

