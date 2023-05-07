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

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Filter_name'), 'PT CINTA CEJAHTERA')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Filter_button_search'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Registrasi Sub-Dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner'), 'Sung-ha-Jung')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/textarea__owner_address'), 'mantijeron,deiyai, Papua')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/span_Pilih Provinsi - registrasi sub dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Bengkulu')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/span_Pilih Kabupaten Kota - registrasi Sub dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Kaur')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/span_Pilih Kecamatan - registrasi sub dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'kinal')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner_ktp'), '123456789000000')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_No. NPWP_owner_npwp'), '12.345.678.9-000.000')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner_telephone'), '81234567890')

WebUI.scrollToPosition(200, 0)

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/span_Pilih Jenis Entitas'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'perseorangan')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Registrasikan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Ya - registrasi sub dealer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Unggah Lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Foto Sub-Dealer (WAJIB)')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

'Upload File foto sub dealer-WAJIB'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload foto sub-dealer(wajib)'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Unggah'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'ktp')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

'upload KTP'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload foto sub-dealer(wajib)'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Unggah'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'SIUP')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

'upload SIUP'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload foto sub-dealer(wajib)'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Unggah'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Persetujuan registrasi')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

'upload persetujuan registrasi\r\n'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload foto sub-dealer(wajib)'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Unggah'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button back - registrasi sub dealer'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/input__checkbox - 0'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__checkbox'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__checkbox_1'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__checkbox_1_2'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Ajukan'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_Ya_1'))

WebUI.closeBrowser()

