package com.example.brum.appp1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


public class BebidasAdapter extends BaseAdapter {

    Context context;

    public BebidasAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount(){
        return Cesta.getInstance().bebidas.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
            return new BebidasView(
                    this.context,
                    Cesta.getInstance().bebidas.get(position));
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public Object getItem(int position){
        return Cesta.getInstance().bebidas.get(position);
    }

}
