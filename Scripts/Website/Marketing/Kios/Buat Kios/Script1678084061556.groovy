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

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_login'), 'personelrmc1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Kios/Page_Login/input_Lupa Kata Sandi_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_/button_Marketing'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff - Dashboard/a_Kios'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Ajukan Kios'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__kios_nama'), 'PT CINTA CEJAHTERA')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__kios_telp'), '123456678912')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/textarea__kios_alamat'), 'JALAN PT CINTA CEJAHTERA')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/span_Pilih Provinsi - personelRMC'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Papua')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/span_Pilih Kabupaten Kota - personilRMC'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Deiyai')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/span_Pilih Kecamatan - personelRMC'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Tigi')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__kios_gmaps'), 'https://www.google.co.id/maps/@-7.7094418,110.4109991,14z')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Simpan Data Kios'))

WebUI.delay(2)

// Custom Looping 5 kali
for (int i = 0; i < 5; i++) {
    WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Tambah Petani Kunci'))

    WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__name'), 'DANI SHORT TIME')

    WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__telephone'), '1112233445566')

    WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/textarea__address'), 'Berbah Sleman YK')

    WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Tambahkan'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/ButtonSubmit-kios'))

    WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button ajukan'))

    WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_Ya - Buat kios'))

    WebUI.delay(2)
}

WebUI.closeBrowser()

