package com.yourcompany.Tests;


import com.yourcompany.Pages.*;
import com.yourcompany.TestRules.Retry;
import com.yourcompany.Tests.SampleSauceTestBase;
import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;

import java.util.UUID;

import static org.junit.Assert.*;


/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class SampleSauceTextInputTest extends SampleSauceTestBase {

    public SampleSauceTextInputTest(String os,
                                    String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest1() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest1() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest2() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest2() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest3() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest3() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest4() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest4() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest5() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest5() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest6() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest6() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest7() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest7() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest8() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest8() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest9() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest9() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyEmailInputTest10() throws InvalidElementStateException {
        String emailInputText = "abc@gmail.com";

        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(page.getEmailText(), emailInputText);


    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @Test
    @Retry
    public void verifyCommentInputTest10() throws InvalidElementStateException {
        String commentInputText = UUID.randomUUID().toString();

        driver.get("https://saucelabs.com/test/guinea-pig");

        // Navigate to the page
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterCommentText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterCommentText(commentInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(commentInputText, page.getCommentText());


    }


}