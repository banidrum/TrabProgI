package com.example.brum.appp1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaBebidasAlcoolActivity extends Activity {

    @Override
        protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listalcool);

        ListView listaoutras = (ListView) findViewById(R.id.listaoutras);

        listaoutras.setAdapter(new OutrasBebidasAdapter(this));

    }
}
