package com.gla.Inheritance;
class Book {
    String title;
    int publicationYear;
// void disp(){
//     System.out.println(title);
//     System.out.println(publicationYear);
// }
}
class Author extends Book{
    void display(){
        String name="Naresh";
        String bio=" ";
        System.out.println("Name: "+name);
        System.out.println("Bio-->"+bio);
    }
}
public class Library {
    static void main(String[] args) {
        Author b=new Author();
      //  b.disp();
        b.display();

    }
}
