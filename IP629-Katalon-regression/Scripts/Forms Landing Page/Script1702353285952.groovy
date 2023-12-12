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

WebUI.navigateToUrl('https://was-dtb-dpddmd-eprs-qa.azurewebsites.net/forms')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/h1_Forms for registrants and applicants'), 
    'Forms for registrants and applicants')

WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/h2_Instructions for requesting PDF forms'), 
    'Instructions for requesting PDF forms')

WebUI.click(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/summary_Instructions for requesting PDF forms'))

WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/p_Forms in PDF format are available upon re_989b8d'), 
    'Forms in PDF format are available upon request. Click on the form’s link from the table below to open an email addressed to pmra.docs.arla@hc-sc.gc.ca to submit your request. Ensure the text "Request for form [your form number]" is in the subject line of the email before sending.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/a_pmra.docs.arlahc-sc.gc.ca'))

WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/p_Once received by the Pest Management Regu_d1194b'), 
    'Once received by the Pest Management Regulatory Agency (PMRA), an email with the requested PDF form will be sent back to your email address.')

WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/p_Please note, all responses are provided d_07a4da'), 
    'Please note, all responses are provided during hours of operation, Monday to Friday, only.')

WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/caption_Available forms'), 
    'Available forms')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/th_Form number'), 
    'Form number')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/th_Format'), 
    'Format')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/th_Name'), 
    'Name')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/th_Last Modified'), 
    'Last Modified')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/h2_Support'), 
    'Support')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/p_If you have any questions on the forms, p_5a2f3e'), 
    'If you have any questions on the forms, please contact the Pest Management Regulatory Agency Information Service')

not_run: WebUI.rightClick(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/a_Pest Management Regulatory Agency Informa_37e21b'))

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/a_Pest Management Regulatory Agency Informa_37e21b'))

not_run: WebUI.click(findTestObject('Object Repository/Forms Landing Page/Page_Forms for registrants and applicants -_29e31d/body_Language selectionFranaisfrWarningSwit_464108'))

WebUI.closeBrowser()

