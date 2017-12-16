package com.example.brum.appp1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaBebidasActivity extends Activity {

       @Override
          protected void onCreate(Bundle savedInstanceState){
           super.onCreate(savedInstanceState);
           setContentView(R.layout.lista_bebidas);

           ListView listabebidas = (ListView) findViewById(R.id.listabebidas);

           listabebidas.setAdapter(new BebidasAdapter(this));

       }
}
