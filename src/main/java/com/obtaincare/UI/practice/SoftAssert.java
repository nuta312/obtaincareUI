package com.obtaincare.UI.practice;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoftAssert {

    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testSoftAssert() {

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 9;

        softAssertions.assertThat(a).isEqualTo(b);
        softAssertions.assertThat(c).isEqualTo(d);

        System.out.println("Hello World");
        softAssertions.assertAll();
    }

    @Test
    public void testHardAssertion() {
        int a = 6;
        int b = 7;

        Assertions.assertEquals(a,b);
        System.out.println("Hard Assert");
    }
}
