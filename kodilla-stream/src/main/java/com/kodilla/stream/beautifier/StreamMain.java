package com.kodilla.stream.beautifier;

import java.util.Locale;

 class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Rafal","ABC","",(a,b,c)->a+b+c);
        poemBeautifier.beautify("Rafal","!£$%^&*()","()*&^%$£!" ,(a,b,c)->b+a+c);
        poemBeautifier.beautify("Rafal","<>*&^$%","",(a,b,c)->b+a+b+c);
        //poemBeautifier.beautify("a","a",(a,b)->toUpperCase(a+b));
        poemBeautifier.beautify("rafal ","glodek","",(a,b,c)->a.toUpperCase(Locale.ROOT)+b.toUpperCase(Locale.ROOT)+c);
    }
}