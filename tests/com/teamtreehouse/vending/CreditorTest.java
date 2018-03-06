package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    private Creditor creditor;

    @Before
    public void setUp() throws Exception {
        // Arrange
        creditor = new Creditor();
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception{
        // Act
        creditor.addFunds(25);
        creditor.addFunds(25);

        // Assert
        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        creditor.addFunds(10);

        int refund = creditor.refund();

        assertEquals(10, refund);
        assertEquals(0, creditor.getAvailableFunds());
    }
}