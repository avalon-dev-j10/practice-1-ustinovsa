package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus
/*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
implements Polygon {
    private float a;
    private float h;
    

    public Rhombus(float a, float h) {
        this.a = a;
        this.h = h;
    }
    
    
    
    
    @Override
    public float getArea() {
        return a * h;
    }

    @Override
    public int getRotation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPerimeter() {
        return 4 * a; //To change body of generated methods, choose Tools | Templates.
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
