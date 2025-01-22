package demoQA
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class demoQA_Textbox {
	@Given("User is in the Textbox page")
	def User_is_in_the_Textbox_page() {
		WebUI.openBrowser(GlobalVariable.mainURL + 'text-box')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Text Box page/Textbox_FullName'), 10)
		WebUI.scrollToElement(findTestObject('Text Box page/Header_Textbox'), 2)
		WebUI.takeScreenshot()
	}

	@When("User input Full Name Textbox (.*)")
	def User_input_Full_Name_Textbox(String FullName) {
		WebUI.click(findTestObject('Text Box page/Textbox_FullName'))
		if(FullName == '-') {
			WebUI.sendKeys(findTestObject('Text Box page/Textbox_FullName'), Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(findTestObject('Text Box page/Textbox_FullName'), Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.setText(findTestObject('Text Box page/Textbox_FullName'), FullName)
		}		
		WebUI.takeScreenshot()
	}

	@And("User input Email Textbox (.*)")
	def User_input_Email_Textbox(String Email) {
		WebUI.click(findTestObject('Text Box page/Textbox_Email'))
		if(Email == '-') {
			WebUI.sendKeys(findTestObject('Text Box page/Textbox_Email'), Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(findTestObject('Text Box page/Textbox_Email'), Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.setText(findTestObject('Text Box page/Textbox_Email'), Email)
		}
		WebUI.takeScreenshot()
	}

	@And("User input Current Address Textbox (.*)")
	def User_input_Current_Address_Textbox(String currentAddress) {
		WebUI.click(findTestObject('Text Box page/Textarea_CurrentAddress'))
		if(currentAddress == '-') {
			WebUI.sendKeys(findTestObject('Text Box page/Textarea_CurrentAddress'), Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(findTestObject('Text Box page/Textarea_CurrentAddress'), Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.setText(findTestObject('Text Box page/Textarea_CurrentAddress'), currentAddress)
		}
		WebUI.takeScreenshot()
	}

	@And("User input Permanent Address Textbox (.*)")
	def User_input_Permanent_Address_Textbox(String permanentAddress) {
		WebUI.click(findTestObject('Text Box page/Textarea_PermanentAddress'))
		if(permanentAddress == '-') {
			WebUI.sendKeys(findTestObject('Text Box page/Textarea_PermanentAddress'), Keys.chord(Keys.CONTROL, 'a'))
			WebUI.sendKeys(findTestObject('Text Box page/Textarea_PermanentAddress'), Keys.chord(Keys.BACK_SPACE))
		} else {
			WebUI.setText(findTestObject('Text Box page/Textarea_PermanentAddress'), permanentAddress)
		}
		WebUI.takeScreenshot()
	}

	@And("User click the Submit button in Textbox page")
	def User_click_the_Submit_button_in_Textbox_page() {
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Text Box page/Button_Submit'))
	}

	@Then("Verify all inputs will be displayed correctly in the Textbox page (.*) (.*) (.*) (.*)")
	def Verify_all_inputs_will_be_displayed_correctly_in_the_Textbox_page(String FullName, String Email, String currentAddress, String permanentAddress) {
		WebUI.delay(1)
		WebUI.takeScreenshot()

		if(FullName != '-') {
			WebUI.verifyElementPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'name', ('expectedText') : FullName]), 5)
		} else if(FullName == '-') {
			WebUI.verifyElementNotPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'name', ('expectedText') : '']), 5)
		}

		if(Email != '-') {
			WebUI.verifyElementPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'email', ('expectedText') : Email]), 5)
		} else if(Email == '-') {
			WebUI.verifyElementNotPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'email', ('expectedText') : '']), 5)
		}

		if(currentAddress != '-') {
			WebUI.verifyElementPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'currentAddress', ('expectedText') : currentAddress]), 5)
		} else if(currentAddress == '-') {
			WebUI.verifyElementNotPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'currentAddress', ('expectedText') : '']), 5)
		}

		if(permanentAddress != '-') {
			WebUI.verifyElementPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'permanentAddress', ('expectedText') : permanentAddress]), 5)
		} else if(permanentAddress == '-') {
			WebUI.verifyElementNotPresent(findTestObject('Text Box page/Textbox_Result', [('id') : 'permanentAddress', ('expectedText') : '']), 5)
		}
	}
	
	@Then("Verify system validated the invalid email")
	def Verify_system_validated_the_invalid_email() {
		WebUI.verifyElementPresent(findTestObject('Text Box page/Validations/Textbox_Email_Validated'), 2)
	}
}