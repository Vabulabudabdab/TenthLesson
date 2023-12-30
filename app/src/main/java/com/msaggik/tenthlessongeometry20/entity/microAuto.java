package com.msaggik.tenthlessongeometry20.entity;

public class microAuto implements Auto {

    //- микроавтобус (вместимость 8 человек, максимальная скорость 180 км/час,
//                масса 1,6 тонн)
    @Override
    public int Capacity(int Capac) {
        return 8;
    }

    @Override
    public int Speed(int speed) {
        return 180;
    }

    @Override
    public float massAuto(int mass) {
        return 1.8F;
    }
}
