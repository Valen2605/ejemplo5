package com.example.valentina.ejemplo5;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public  void onCheckedChanged(RadioGroup radioGroup, @IdRes int i){

                switch (i){

                    case R.id.primerradio:
                        Toast.makeText(MainActivity.this, "Primer Boton", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.segundoradio:
                        Toast.makeText(MainActivity.this, "Segundo Boton", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tercerradio:
                        Toast.makeText(MainActivity.this, "Tercer Boton", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cuartoradio:
                        Toast.makeText(MainActivity.this, "Cuarto Boton", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
