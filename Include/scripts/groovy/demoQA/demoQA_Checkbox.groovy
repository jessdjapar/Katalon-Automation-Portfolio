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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class demoQA_Checkbox {
	@Given("User is in the Checkbox page")
	def User_is_in_the_Checkbox_page() {
		WebUI.openBrowser(GlobalVariable.mainURL + 'checkbox')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Checkbox page/Checkboxes_LoopAllUnchecked', [('RowNumber') : 1]), 10)
		WebUI.scrollToElement(findTestObject('Checkbox page/Header_Checkbox'), 2)
		WebUI.takeScreenshot()
	}
	
    @When("User click the Home checkbox")
	def User_click_the_Home_checkbox() {
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Checkbox page/Checkboxes_LoopAllUnchecked', [('RowNumber') : 1]))
		WebUI.delay(1)
		WebUI.takeScreenshot()
	}
	
    @Then("Verify the checkbox is checked")
	def Verify_the_checkbox_is_checked() {
		WebUI.verifyElementPresent(findTestObject('Checkbox page/Checkboxes_LoopAllChecked', [('RowNumber') : 1]), 10)
	}
	
	@When("User click expand button in the Checkbox page")
	def User_click_expand_button_in_the_Checkbox_page() {
		WebUI.delay(1)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Checkbox page/Button_ExpandAll'))
		WebUI.delay(1)
		WebUI.takeScreenshot()
	}
	
	@Then("User check and uncheck all checkboxes")
	def User_check_and_uncheck_all_checkboxes() {
		int i=1
		while(WebUI.verifyElementPresent(findTestObject('Checkbox page/Checkboxes_LoopAllUnchecked', [('RowNumber') : i]), 2, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Checkbox page/Checkboxes_LoopAllUnchecked', [('RowNumber') : i]))
			WebUI.takeScreenshot()
			WebUI.click(findTestObject('Checkbox page/Checkboxes_LoopAllChecked', [('RowNumber') : 1]))
			WebUI.takeScreenshot()
			i++
		}
	}
}