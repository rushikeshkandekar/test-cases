package com.crossasyst.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCardTest {

    @Test
    void CreditCardTypeOne() {
        CheckCard checkCard = new CheckCard();
        assertEquals("american Express", CheckCard.getCreditCardType("30303202"));
    }
        @Test
        void CreditCardTypeTwo() {
            assertEquals("Visa", CheckCard.getCreditCardType("40303202"));
        }

        @Test
        void CreditCardTypeThree() {
            assertEquals("Mastercard", CheckCard.getCreditCardType("50303202"));
        }

        @Test
        void CreditCardTypeFour() {
            assertEquals("Discover", CheckCard.getCreditCardType("60303202"));
        }

        @Test
        void CreditCardTypeFive() {
            assertEquals("",    CheckCard.getCreditCardType(""));
        }

        @Test
        void CreditCardTypeSix() {
            assertEquals("", CheckCard.getCreditCardType(null));
        }

    }
