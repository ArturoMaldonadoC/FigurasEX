package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){
          return (radio*radio)*3.1416;
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
