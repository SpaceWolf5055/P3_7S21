package com.edu.ISC.Omar.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity {

    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnsuma = findViewById(R.id.btnsuma);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cargarsumatoria = new Intent(MenuActivity2.this, Suma2Activity2.class);
                startActivity(cargarsumatoria);
            }
        });
    }
}