package com.example.brum.appp1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CorteView extends LinearLayout {

    public CorteView(Context context, Corte corte1){
        super(context);
        LayoutInflater.from(context).inflate(R.layout.layoutcorte, this);

        final Corte corte = corte1;

        final EditText num = findViewById(R.id.num);
        num.setText(corte.valor+"");

        final EditText qtd = findViewById(R.id.qtd);
        qtd.setText(corte.peso+"");

        qtd.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String in = qtd.getText().toString();
                corte.peso =  Double.parseDouble(in);

                return true;

            }
        });

        num.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String input = num.getText().toString();
                corte.valor = Double.parseDouble(input);

                return true;
            }
        });

        TextView texto = findViewById(R.id.texto);
        CheckBox checkBox = findViewById(R.id.checkcorte);
        texto.setText(corte.nome);

    }


}
