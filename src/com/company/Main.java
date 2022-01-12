package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        Shape circle = new Circle(10,"red",false);
        Shape rectangle = new Rectangle(10,20,"red",false);
        shape[0] =circle;
        shape[1] = rectangle;

        System.out.println("hien thi");
       for (int i =0; i < shape.length;i++){
           if (shape[i] instanceof Circle){
               System.out.println(circle);
               ((Circle) shape[i]).howToColor();
           }
           else if (shape[i] instanceof Rectangle){
               ((Rectangle)shape[i]).getArea();
               System.out.println(rectangle);
           }
       }

    }
}
