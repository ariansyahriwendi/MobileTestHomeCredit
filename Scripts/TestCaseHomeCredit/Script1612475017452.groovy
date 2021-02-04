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

Mobile.startApplication('C:\\Users\\arian\\Downloads\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

Mobile.swipe(200, 200, 20, 200)

Mobile.swipe(200, 200, 20, 200)

Mobile.swipe(200, 200, 20, 200)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.TextView - DAFTAR'), 0)

Mobile.scrollToText('Hubungi Kami')

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.TextView - Setuju  Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.Spinner - 5'), 0)

Mobile.scrollToText('30')

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.CheckedTextView - 30'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.Spinner - Februari'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.CheckedTextView - April'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.Spinner - 2021'), 0)

Mobile.scrollToText('1986')

Mobile.tap(findTestObject('Home Credit/android.widget.CheckedTextView - 1986'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.TextView - No. Handphone'), 0)

Mobile.setText(findTestObject('Object Repository/Home Credit/android.widget.EditText - (62)'), '81806442929', 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.TextView - Kode PIN (6 digit)'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Home Credit/android.widget.EditText'), 'ETJdJZP+ugk=', 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (1)'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Home Credit/android.widget.EditText (2)'), 'ETJdJZP+ugk=', 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.Button - Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (3)'), 3)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (4)'), 7)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (5)'), 9)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (6)'), 5)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (7)'), 2)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.EditText (8)'), 7)

Mobile.tap(findTestObject('Object Repository/Home Credit/android.widget.Button - Daftar'), 0)

Mobile.closeApplication()

