package com.example.brum.appp1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * Created by aluno-uffs on 28/11/17.
 */

public class BebidasView extends LinearLayout {

        public BebidasView(Context context, Bebidas bebidas1){
            super(context);

            LayoutInflater.from(context).inflate(R.layout.layoutbebidas, this);

            final Bebidas bebidas = bebidas1;

            final EditText val = findViewById(R.id.val);
            val.setText(bebidas.valor+"");

            final EditText qtd = findViewById(R.id.qtd);
            qtd.setText(bebidas.qtd+"");

            val.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                    String in = val.getText().toString();
                    bebidas.valor = Double.parseDouble(in);

                    return true;
                }
            });

            qtd.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                    String input = qtd.getText().toString();
                    bebidas.qtd = Integer.parseInt(input);

                    return true;
                }
            });


            TextView texto = findViewById(R.id.textobebidas);
            CheckBox checkBox = findViewById(R.id.checkbebidas);
            texto.setText(bebidas.nome);
        }


}
