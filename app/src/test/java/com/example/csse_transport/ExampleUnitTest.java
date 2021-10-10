package com.example.csse_transport;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testTrueEmailValidity() {
        String testEmail = "tonystark@gmail.com";
        Assert.assertThat(String.format("Email Address Validity Test failed for %s ", testEmail), RegisterActivity.checkEmailForValidity(testEmail), is(true));
    }

    @Test
    public void testFalseEmailValidity() {
        String testEmail = "tonystarkgmailcom";
        Assert.assertThat(String.format("Email Address Validity Test failed for %s ", testEmail), RegisterActivity.checkEmailForValidity(testEmail), is(false));
    }
}