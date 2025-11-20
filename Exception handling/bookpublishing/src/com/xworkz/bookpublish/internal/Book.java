package com.xworkz.bookpublish.internal;

import com.xworkz.bookpublish.event.*;

public class Book {

    public String validateISBN(String isbn) {
        if (isbn.length() != 13) {
            try {
                throw new InvalidISBNException();
            } catch (InvalidISBNException e) {
                e.printStackTrace();
                System.out.println("Handled: ISBN must be exactly 13 characters long.");
            }
        } else {
            System.out.println("ISBN " + isbn + " has the correct format length.");
        }
        return isbn;
    }


    public int checkWordCount(int wordCount) {
        if (wordCount < 50000) {
            try {
                throw new WordCountTooLowException();
            } catch (WordCountTooLowException e) {
                e.printStackTrace();
                System.out.println("Handled: Word count is too low for the intended book type. Needs expansion.");
            }
        } else {
            System.out.println("Word count (" + wordCount + " words) meets the minimum requirement.");
        }
        return wordCount;
    }


    public float checkPlagiarism(float percentage) {
        if (percentage > 10.0f) {
            try {
                throw new PlagiarismDetectedException();
            } catch (PlagiarismDetectedException e) {
                e.printStackTrace();
                System.out.println("Handled: High plagiarism detected (" + percentage + "%). Manuscript rejected.");
            }
        } else {
            System.out.println("Plagiarism check passed (" + percentage + "%).");
        }
        return percentage;
    }


    public String checkFormat(String fileFormat) {
        if (!fileFormat.equals("DOCX")) {
            try {
                throw new FormatMismatchException();
            } catch (FormatMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: File format (" + fileFormat + ") must be DOCX for editing.");
            }
        } else {
            System.out.println("File format is correct (" + fileFormat + ").");
        }
        return fileFormat;
    }


    public int checkDeadline(int daysLate) {
        if (daysLate > 0) {
            try {
                throw new DeadlineMissedException();
            } catch (DeadlineMissedException e) {
                e.printStackTrace();
                System.out.println("Handled: Submission deadline was missed by " + daysLate + " day(s).");
            }
        } else {
            System.out.println("Manuscript submitted on time.");
        }
        return daysLate;
    }
}