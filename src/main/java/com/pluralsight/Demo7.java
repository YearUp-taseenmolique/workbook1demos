package com.pluralsight;

public class Demo7 {

    public static void main(String[] args){
        System.out.println("Welcome!");
        foo();
        moo();
        foo();
        foo();

    }

    public static void foo(){
        System.out.println("The secret word is: Foo");
        moo();
    }

    public static void moo(){
        System.out.println(("Moo"));

    }

}
