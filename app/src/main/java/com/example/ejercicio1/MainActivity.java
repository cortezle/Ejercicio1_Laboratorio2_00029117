package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        txt2=  findViewById(R.id.texto);
        txt1 = findViewById(R.id.text1);
        txt3 = findViewById(R.id.text2);
        btn1.setOnClickListener(this);


        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txt2.setText(txt3.getText());
                return false;
            }
        });


    }

    @Override
    public void onClick(View v) {

        txt2.setText(txt1.getText());

    }
}
