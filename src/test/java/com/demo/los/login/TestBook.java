package com.demo.los.login;

import com.demo.core.base.BaseTest;
import com.demo.entity.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.bookPage;

public class TestBook extends BaseTest {


    @Test
    public void checkBook() {
        open("https://www.amazon.com/s?k=Java&i=stripbooks-intl-ship&ref=nb_sb_noss");
        bookPage().convertData();
        List<Book> temp =bookPage().addBooks();
        String actual = String.valueOf(temp.get(0));
        String expectedTitle = "Effective Java";
        String expectedAuthor = "Joshua Bloch";
        String expectedBestseller = "true";

        Assert.assertTrue(actual.contains(expectedTitle));
        Assert.assertTrue(actual.contains(expectedAuthor));
        Assert.assertTrue(actual.contains(expectedBestseller));

    }










//    @Test
//    public void testBookDataExistence() {
//        String books = bookPage.addBooks().toString();
//        Assert.assertNotNull(books);
//
//    }
//
//    @Test
//    public void findRequiredBookName() {
//        List<Book> temp =bookPage.addBooks();
//        String actual = String.valueOf(temp.get(0));
//        String expected = "title='Effective Java'";
//        org.testng.Assert.assertTrue(actual.contains(expected));
//
//    }
//
//    @Test
//    public void findRequiredBookName1() {
//        String name = "Java: The Complete Reference, Eleventh Edition";
//        String names = bookPage.convertTitle().toString();
//        Assert.assertTrue(names.contains(name));
//
//    }
//
//    @Test
//    public void findRequiredBookName2() {
//        String name = "Java: A Beginner's Guide, Eighth Edition";
//        String names = bookPage.convertTitle().toString();
//        Assert.assertTrue(names.contains(name));
//
//    }
//
//    @Test
//    public void findRequiredAuthor() {
//        String author = "Joshua Bloch";
//        String authors = bookPage.convertAuthor().toString();
//        Assert.assertTrue(authors.contains(author));
//
//    }
//
//    @Test
//    public void findRequiredAuthor1() {
//        String author = "Kathy Sierra";
//        String authors = bookPage.convertAuthor().toString();
//        Assert.assertTrue(authors.contains(author));
//
//    }
//
//    @Test
//    public void findRequiredAuthor2() {
//        String author = "Bert Bates";
//        String authors = bookPage.convertAuthor().toString();
//        Assert.assertTrue(authors.contains(author));
//
//    }



}
