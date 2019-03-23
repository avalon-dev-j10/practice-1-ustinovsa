package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    
    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];
               for (Shape shape: shapes){
            shape=ShapeFactory.randomFactory().getInstance();
            
            System.out.println("Figure type: " + shape.getClass().getSimpleName() + "\n" 
                    + "Area of " + shape.getClass().getSimpleName() + " " + shape.getArea());
               }
    
               
    Arrays.sort(shapes);
 
    System.out.println("Figure type with maximum area: " +
                    shapes[shapes.length - 1].getClass().getSimpleName() + "\n"
                    + "This area is  " + shapes[shapes.length - 1].getArea());
                
        
        

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    }
}
