package com.example.matillion.matillion.task1.service;

import com.example.matillion.matillion.exception.DifferenceBetweenStringsException;

public class StringDifference {

    public int differenceBetweenTwoStrings(String firstString, String secondString) throws DifferenceBetweenStringsException {
        int numberOfDifferences = 0;

        if (firstString.length() != secondString.length()) {
            throw new DifferenceBetweenStringsException("The two strings are not the same length");
        }

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                numberOfDifferences++;
            }
        }
        return numberOfDifferences;
    }
}
