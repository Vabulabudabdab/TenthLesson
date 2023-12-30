package com.msaggik.tenthlessongeometry20.entity;

public class Rectangle implements Figure{

    // вычисление площади фигуры
    @Override
    public int figureArea(int width, int height) {
        return width * height;
    }

    // вычисление периметра фигуры
    @Override
    public int figurePerimeter(int width, int height) {
        return (width + height) * 2;
    }
}
