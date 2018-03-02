package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    @Test
    public void addingFundsIncrementsAvailableFunds() {
        // Arrange
        Creditor creditor = new Creditor();

        // Act
        creditor.addFunds(25);
        creditor.addFunds(25);

        // Assert
        assertEquals(50, creditor.getAvailableFunds());
    }
}