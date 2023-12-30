package com.msaggik.tenthlessongeometry20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.msaggik.tenthlessongeometry20.entity.Auto;
import com.msaggik.tenthlessongeometry20.entity.Figure;
import com.msaggik.tenthlessongeometry20.entity.cargoAuto;
import com.msaggik.tenthlessongeometry20.entity.littleAuto;
import com.msaggik.tenthlessongeometry20.entity.microAuto;

public class MainActivity extends AppCompatActivity {

    // поля
//    Задание
//    Необходимо создать интерфейс с методами определяющими схожие параметры
//    автомобилей, а затем реализовать их в классах сущностей данных авто. После
//    этого необходимо создать объекты данных сущностей и вывести о них
//    информацию на экран смартфона
    private Figure rectangle, circle, triangle; // фигуры

    private Auto little, cargo, microAuto; //auto

    private int Capacit, Speed, massAuto; //Статы авто

    private int infLittle, infCargo, infMicro;
    // дополнительные поля
    private EditText widthInput, heightInput;
    private Button button;
    private TextView infoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связь полей представления с разметкой по id
        button = findViewById(R.id.button);
        infoApp = findViewById(R.id.infoApp);

        // обработаем нажатие кнопки
        button.setOnClickListener(listener);
    }

    // создадим слушатель кнопки и с помощью анонимного класса переопределим метод onClick(View view)
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // инициализация объектов фигур
            little = new littleAuto();
            cargo = new cargoAuto();
            microAuto = new microAuto();

            // инициализация вместимости
            infLittle = little.Capacity(Capacit);
            infCargo = cargo.Capacity(Capacit);
            infMicro = microAuto.Capacity(Capacit);

            // инициализация Скорости
            infLittle = little.Speed(Speed);
            infCargo = cargo.Speed(Speed);
            infMicro = microAuto.Speed(Speed);

            // init mass
            infLittle = (int) little.massAuto(massAuto);
            infCargo = (int) cargo.massAuto(massAuto);
            infMicro = (int) microAuto.massAuto(massAuto);

            // вывод информации об авто
            infoApp.setText("Вместимость всех авто: " + "\n" + "Легковой авто: " + little.Capacity(Capacit) + "\n" + " Грузовой авто:" + cargo.Capacity(Capacit) + "\n" + "Микроавтобус: " + microAuto.Capacity(Capacit) + "\n"
                    + "Скорость авто " + "\n" + "Легковой авто: " + little.Speed(Speed) + "\n" + "Грузовой авто: " + cargo.Speed(Speed) + "\n" + "Микроавтобус: " + microAuto.Speed(Speed) + "\n"
                    + "Масса авто " + "\n" + "Легковой авто: " + little.massAuto(massAuto) + "\n" + "Грузовой авто: " + cargo.massAuto(massAuto) + "\n" + "Микроавтобус: " + microAuto.massAuto(massAuto));
        }
    };
}