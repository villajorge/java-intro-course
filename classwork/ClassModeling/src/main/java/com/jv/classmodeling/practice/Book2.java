/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.classmodeling.practice;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class Book2 {
    private String title;
    private String author;
    private String genre;
    private String msnb;
    private int pages;
    
    Book2 (String title, String author, String genre, String msnb, int pages){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.msnb = msnb;
        this.pages = pages;
    }
    public void printOut(){
        System.out.println("\n========Book Library==========");
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Genre: "+this.genre);
        System.out.println("MSBN: "+this.msnb);
        System.out.println("Pages: "+this.pages);
    }
    
    public Book2 scanOut(Book2 book){
        //show that the book has been scanned out of the library
        return book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMsnb() {
        return msnb;
    }

    public void setMsnb(String msnb) {
        this.msnb = msnb;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
