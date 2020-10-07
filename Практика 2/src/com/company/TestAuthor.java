package com.company;

public class TestAuthor {

    public static void main(String[] args) {
	Author a1 = new Author("Andrey","andrey505@gmail.com",'M');
	Author a2 = new Author("Dmitry","dmitry505@gmail.com",'M');
	System.out.println(a1);
	System.out.println(a2);
	a1.setEmail("dmitry404@gmail.com");
	System.out.println(a1.getEmail());
    }
}
