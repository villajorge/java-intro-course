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
public class Book1 {
    private String title;
    private String body;
    private String publisher;
    private int pages;
    
    Book1 (String title, String body, String publisher, int pages){
        this.title= title;
        this.body = body;
        this.publisher = publisher;
        this.pages = pages;
    }
    
    public void printOut(){
        System.out.println("\n=========Publisher book=======");
        System.out.println("Title: "+this.title);
        System.out.println("Body: "+this.body);
        System.out.println("Pages: "+this.pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    
}
