package com.obtaincare.UI.practice;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class SoftAssert {

    SoftAssertions softAssertions = new SoftAssertions();

    @Test
    public void testOfAssert() {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 9;
        int e = 1;

        softAssertions.assertThat(a).isEqualTo(5);

    }
}
