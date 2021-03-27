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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.click(findTestObject('Service NSW Object/input_Service NSW makes it easier to find government information and services_q'))

WebUI.setText(findTestObject('Service NSW Object/input_Service NSW makes it easier to find government information and services_q'), 
    'Apply for a number plate')

WebUI.click(findTestObject('Service NSW Object/button_apply for a number plate_button button--primary'))

WebUI.scrollToElement(findTestObject('Service NSW Object/div_87 results found'), 0)

WebUI.click(findTestObject('Service NSW Object/a_Apply for a number plate'))

WebUI.click(findTestObject('Object Repository/Service NSW Object/a_Find locations'))

WebUI.scrollToElement(findTestObject('Service NSW Object/div_search by suburb'), 0)

WebUI.setText(findTestObject('Object Repository/Service NSW Object/input_Search by suburb, postcode or current_d530bf'), 
    suburb)

WebUI.click(findTestObject('Object Repository/Service NSW Object/button_Sydney South 2000_button button--pri_c5c898'))

WebUI.click(findTestObject('Object Repository/Service NSW Object/button_Service Centres'))

WebUI.scrollToElement(findTestObject('Service NSW Object/h2_Service NSW locations'), 0)

