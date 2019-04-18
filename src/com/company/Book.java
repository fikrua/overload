package com.company;

public class Book {
    private String authorName;
    private String bookTitle;
    private double price;
    private boolean isInStalk;
    public Book(String author,String title ){
        authorName = author;
        bookTitle = title;
        System.out.println("the author is "+authorName+" title "+bookTitle);
    }
    public Book(String author,String title,double cost){
        authorName = author;
        bookTitle = title;
        price = cost;
        System.out.println("the author is "+authorName+" title "+bookTitle+ " "+ price);
    }
    public Book(String author,String title,double cost,boolean weHaveIt){
        authorName = author;
        bookTitle = title;
        price = cost;
        isInStalk = weHaveIt;
    }
    public void desplay(){
        String answer;
        if (isInStalk==true)
            answer = "we have the book ";
        else
            answer = "sorry we are out of this book  ";
        System.out.println("the author is "+authorName+" title "+bookTitle+ " "+ price+" "+ answer);





    }
}
