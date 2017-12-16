package com.example.brum.appp1;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    Button navegacortes;
    Button navegabebidas;
    Button navegatrago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navegacortes = findViewById(R.id.navegacortes);
        navegabebidas = findViewById(R.id.navegabebidas);
        navegatrago = findViewById(R.id.navegatrago);

        navegacortes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaCortesActivity.class);
                startActivity(intent);

                navegacortes.setText("Cortes");

            }
        });

        navegabebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaBebidasActivity.class);
                startActivity(intent);

                navegabebidas.setText("Bebidas");
            }
        });

        navegatrago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaBebidasAlcoolActivity.class);
                startActivity(intent);

                navegatrago.setText("Bebidas Alcoolicas");
            }
        });



        //  Cesta.getInstance().bebidas.add(new Bebidas(4.5, 4));

        Resources res = getResources();

        String[] cortes = getResources().getStringArray(R.array.cortes);

        String[] bebidas = getResources().getStringArray(R.array.bebidas);

        String[] trago = getResources().getStringArray(R.array.trago);

        for(String nome: cortes) {

            Cesta.getInstance().cortes.add(new Corte(nome, 0, 0));
        }

        for(String nome: bebidas){

            Cesta.getInstance().bebidas.add(new Bebidas(nome, 0, 0));
        }

        for(String nome: trago){

            Cesta.getInstance().trago.add(new OutrasBebidas(nome, 0,0));

        }

    }

}
