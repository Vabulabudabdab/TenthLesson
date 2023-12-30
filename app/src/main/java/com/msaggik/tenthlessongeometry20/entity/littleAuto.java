package com.msaggik.tenthlessongeometry20.entity;

//- легковой автомобиль (вместимость 5 человек, максимальная скорость 210
//            км/час, масса 1,2 тонны)
public class littleAuto implements Auto {

    //            - легковой автомобиль (вместимость 5 человек, максимальная скорость 210
//            км/час, масса 1,2 тонны)
    @Override
    public int Capacity(int Capac) {
        return 5;
    }

    @Override
    public int Speed(int speed) {
        return 210;
    }

    @Override
    public float massAuto(int mass) {
        return (int) 1.2;
    }
}
