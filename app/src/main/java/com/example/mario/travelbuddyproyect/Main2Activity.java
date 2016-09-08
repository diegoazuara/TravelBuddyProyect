package com.example.mario.travelbuddyproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton seccion_uno = (ImageButton) findViewById(R.id.seccion_uno_boton_uno);
        seccion_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main8Activity.class);
                startActivity(intent);
            }
        });

        Button boton = (Button) findViewById(R.id.localizacion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No disponible en este momento", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
