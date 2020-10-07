package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static class Human {

        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String greet(String str) {
            return str +  ", " + this.name;
        }

        public boolean isAgeCorrect(int age) {
            return this.age == age;
        }
    }
}
