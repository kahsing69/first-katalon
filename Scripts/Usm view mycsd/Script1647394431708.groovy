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

WebUI.navigateToUrl('http://campusonline.usm.my/')

WebUI.click(findTestObject('Object Repository/Page_USM CampusOnline Portal/span_Login with USM ID'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Identity Single Sign On_UserName'), 'kahsingc99@student.usm.my')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Identity Single Sign On_Password'), '/UuVw8zBvQIWom9KeclPBQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_SMU-Pelajar/b_Student Profile_arrow fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_SMU-Pelajar/a_MyCSD'))

WebUI.click(findTestObject('Object Repository/Page_SMU-Pelajar/a_Projek'))

WebUI.closeBrowser()

