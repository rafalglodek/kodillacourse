package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a, String b,String c, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(a,b,c);
        System.out.println("Result equals: " + result);
    }
}
