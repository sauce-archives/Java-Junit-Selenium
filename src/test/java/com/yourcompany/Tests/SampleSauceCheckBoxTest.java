package com.yourcompany.Tests;

import com.yourcompany.Pages.GuineaPigPage;

import org.junit.Test;

import com.yourcompany.Pages.GuineaPigPage;
import com.yourcompany.Tests.SampleSauceTestBase;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class SampleSauceCheckBoxTest extends SampleSauceTestBase {

    public SampleSauceCheckBoxTest(String os,
                                     String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest() throws InvalidElementStateException {

        //Navigate to the page
    	driver.get("https://saucelabs.com/test/guinea-pig");

    	// get page object
    	GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest() throws InvalidElementStateException {

    	driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest1() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest1() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest2() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest2() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest3() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest3() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest4() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest4() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest5() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest5() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest6() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest6() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest7() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest7() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest8() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest8() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest9() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest9() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }
    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyUncheckedCheckBoxInputTest10() throws InvalidElementStateException {

        //Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.checkUncheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getUncheckedCheckBoxState(), true);

    }

    /**
     * Runs a simple test verifying the checked checkbox state
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCheckedCheckBoxInputTest10() throws InvalidElementStateException {

        driver.get("https://saucelabs.com/test/guinea-pig");

        //Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         checkUncheckedCheckBox is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.uncheckCheckedCheckBox();

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getCheckedCheckBoxState(), false);

    }

}