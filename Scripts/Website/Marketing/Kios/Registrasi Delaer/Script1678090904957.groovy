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

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Filter_name'), 'PT CINTA CELALU CETIA')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Filter_button_search'))

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Registrasi Dealer'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner'), 'Dhani Wardana')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/textarea__owner_address'), 'Turi Sendang tirto')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/input provinsi'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'bali')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/input Kabupaten'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Kabupaten Bangli')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/input kecamatan'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Kintamani')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner_ktp'), '1232345679889787')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_No. NPWP_owner_npwp'), '11.112.232.3-322.323')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input__owner_telephone'), '8987654321')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/span_Pilih Bank'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'BTPN')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_No. Rekening_no_rek_bank'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Atas Nama_owner_bank'), 'Dhani Veto Wardana')

WebUI.scrollToPosition(200, 2)

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/input entitas'))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), 'Perseorangan')

WebUI.sendKeys(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Ya_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_No. Rekening_no_rek_bank_dealer'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/input_Atas Nama_owner_bank_dealer'), 'Dhani Veto Wardana')

WebUI.click(findTestObject('Object Repository/Object Kios/Page_Marketing Staff/button_Registrasikan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_Ya - registrasi delaer'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_Unggah Lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), 'KTP')

WebUI.sendKeys(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), Keys.chord(Keys.ENTER))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload ktp'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_upload lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), 'Foto Dealer')

WebUI.sendKeys(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), Keys.chord(Keys.ENTER))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload ktp'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_upload lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), 'SIUP')

WebUI.sendKeys(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), Keys.chord(Keys.ENTER))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload ktp'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_upload lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Search pilihan lampiran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), ' Persetujuan Registrasi Dealer ')

WebUI.sendKeys(findTestObject('Object Kios/Page_Marketing Staff/input field unggah lampiran'), Keys.chord(Keys.ENTER))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Kios/Page_Marketing Staff/upload ktp'), 'C:\\\\Users\\\\redan\\\\Downloads\\\\BULAN.jpg')

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/button_upload lampiran'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/btn_close modal'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/checkbox - Detail Dealer sudah diisi lengkap'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/checkbox - Lampiran KTP, SIUP, Lampiran Persetujuan Dealer sudah diunggah'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/checkbox - Foto Dealer Terlihat Plang Nama'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/checkbox - Data sudah valid dan dapat dipertanggungjawabkan'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/Submit button ajukan'))

WebUI.click(findTestObject('Object Kios/Page_Marketing Staff/submit modal'))

