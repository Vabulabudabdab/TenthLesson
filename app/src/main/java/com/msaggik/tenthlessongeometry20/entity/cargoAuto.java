package com.msaggik.tenthlessongeometry20.entity;

//- грузовой автомобиль (вместимость 3 человека, максимальная скорость 170
//            км/час, масса 3 тонны)

public class cargoAuto implements Auto {


    @Override
    public int Capacity(int Capac) {
        return 3;
    }

    @Override
    public int Speed(int speed) {
        return 170;
    }

    @Override
    public float massAuto(int mass) {
        return 3;
    }
}
