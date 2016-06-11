package com.thoughtworks.retailstore;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EntryPointTest {
    @Test
    public void oneShouldBeEqualtoOne() {
        assertThat(1, is(1));
    }
}