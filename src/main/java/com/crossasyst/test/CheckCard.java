package com.crossasyst.test;

public class CheckCard {
        static String getCreditCardType(String creditCardNumber) {
            String type = "";
            if (creditCardNumber != null) {

                if (creditCardNumber.startsWith("3")) {
                    type = "american Express";
                } else if (creditCardNumber.startsWith("4")) {
                    type = "Visa";
                } else if (creditCardNumber.startsWith("5")) {
                    type = "Mastercard";
                }
                else if (creditCardNumber.startsWith("6")) {
                    type = "Discover";
                }

            }

            return type;}}



