package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaNumericChooserTest {

    private AlphaNumericChooser chooser;

    @Before
    public void setUp() throws Exception {
        // Arrange
        chooser = new AlphaNumericChooser(26, 10);
    }

    @Test
    public void validInputReturnsProperLocation() throws Exception {
        // Act
        AlphaNumericChooser.Location loc = chooser.locationFromInput("B4");

        // Assert
        assertEquals("Proper Row", 1, loc.getRow());
        assertEquals("Proper Column", 3, loc.getColumn());
    }

    @Test(expected = InvalidLocationException.class)
    public void choosingWrongInputIsNotAllowed() throws Exception {
        chooser.locationFromInput("WRONG");
    }

    @Test(expected = InvalidLocationException.class)
    public void choosingLargerThanMaxIsNotAllowed() throws Exception {
        chooser.locationFromInput("B52");
    }
}