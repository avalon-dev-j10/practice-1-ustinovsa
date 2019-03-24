package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    
    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();
// создаем массив на 20 элементов типа Shape
        Shape[] shapes = new Shape[20];
        //Заполняем массив элементами через случайные фабрики
              for (int i=0; i<shapes.length; i++){
            shapes[i]=factory.getInstance();
              }
              /*Сортируем элементы по возрастанию площади
              метод compareTO переопределен в интерфейсе Shape
              интерфейс comparable унаследован Shape
              */
              Arrays.sort(shapes);
              // выводим отсортированный список элементов и площадей
            for (Shape shape: shapes){
            System.out.println("Figure type: " + shape.getClass().getSimpleName() + "\n" 
                    + "Area of " + shape.getClass().getSimpleName() + " " + shape.getArea()+ "\n");
                    }
 /*Выводим имя класса элемента массива и максимальную площадь элемента.
            Максимальной площадью обладает последний элемент массива после сортировки
            */
 
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
