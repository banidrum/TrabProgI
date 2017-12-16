package com.example.brum.appp1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by BRUM on 29/11/2017.
 */

public class OutrasBebidasView extends LinearLayout {

       public OutrasBebidasView(Context context, OutrasBebidas outrasBebidas1){
           super(context);

           LayoutInflater.from(context).inflate(R.layout.layoutoutrasbebidas, this);

           final OutrasBebidas outrasBebidas = outrasBebidas1;

           final EditText valor = findViewById(R.id.valor);
           valor.setText(outrasBebidas.valor+"");

           final EditText num = findViewById(R.id.num);
           num.setText(outrasBebidas.qtd+"");

           valor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
               @Override
               public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                   String in = valor.getText().toString();
                   outrasBebidas.valor = Double.parseDouble(in);

                   return true;
               }
           });

           num.setOnEditorActionListener(new TextView.OnEditorActionListener() {
               @Override
               public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                   String input = num.getText().toString();
                   outrasBebidas.qtd = Integer.parseInt(input);

                   return true;
               }
           });


           TextView texto = findViewById(R.id.outrasbebidas);
           CheckBox checkBox = findViewById(R.id.checkoutras);
           texto.setText(outrasBebidas.nome);
       }

}
