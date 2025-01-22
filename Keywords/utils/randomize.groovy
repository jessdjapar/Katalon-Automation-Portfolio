package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.Random

import internal.GlobalVariable

public class randomize {
	@Keyword
	def generateRandomString(int length) {
		String charPool = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
		Random random = new Random()
		StringBuilder result = new StringBuilder()

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(charPool.length())
			result.append(charPool.charAt(randomIndex))
		}

		return result.toString()
	}
	
	@Keyword
	def generateRandomNumber(int length) {
		String digitPool = '0123456789'
		Random random = new Random()
		StringBuilder result = new StringBuilder()
	
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(digitPool.length())
			result.append(digitPool.charAt(randomIndex))
		}
	
		return result.toString()
	}
}
