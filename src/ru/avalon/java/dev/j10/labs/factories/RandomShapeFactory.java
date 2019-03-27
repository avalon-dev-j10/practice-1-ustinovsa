package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.*;


/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словаим, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {

    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */
    public RandomShapeFactory() {
         
    }
public int random(){
   
       return (int)((Math.random()*5)+1) ;
        
        
}
        
    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    public Shape getInstance() {
        switch(random()){
            
            case 1: return new Circle(random());                
            case 2: return new Rectangle(random(), random());
            case 3: return new Rhombus(random(), random());
            case 4: return new Trapezium(random(), random(),random(), random(), random());
            default: return new Circle(random());
            }
        
        /*
        * TODO: Реализовать метод 'getInstance()' класса 'RandomShapeFactory'
        */
        
       
    }
}
