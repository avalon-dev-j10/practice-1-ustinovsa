package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium 
/*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

implements Polygon {
    private float a;
    private float b;
    private float c;
    private float d;
    private float h;
   

    public Trapezium(float a, float b, float c, float d, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    
    
    
    
    
    @Override
    public float getArea() {
        return (a + b)/2 * h;
    }

    @Override
    public int getRotation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPerimeter() {
        return a + b + c + d; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
}
}
