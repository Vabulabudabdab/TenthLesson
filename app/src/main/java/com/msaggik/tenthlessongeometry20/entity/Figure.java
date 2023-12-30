package com.msaggik.tenthlessongeometry20.entity;

public interface Figure {

    int COLOR = 0xFFFFFF; // константа белого цвета

    int figureArea(int width, int height); // метод площади фигуры
    int figurePerimeter(int width, int height); // метод периметра фигуры
}
