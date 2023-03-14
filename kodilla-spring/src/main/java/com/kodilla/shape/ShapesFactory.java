package com.kodilla.shape;

import com.kodilla.spring.shape.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape() {
        com.kodilla.spring.shape.Shape theShape;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            theShape = new Square();
        } else if (chosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}