package com.example.brum.appp1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class OutrasBebidasAdapter extends BaseAdapter {

        Context context;

        public OutrasBebidasAdapter(Context context){
            this.context = context;
        }

        @Override
        public int getCount(){
            return Cesta.getInstance().trago.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
                return new OutrasBebidasView(
                        this.context,
                        Cesta.getInstance().trago.get(position)
                );
        }

        @Override
        public long getItemId(int position){
            return 0;
        }

        @Override
        public Object getItem(int position){
            return Cesta.getInstance().trago.get(position);
        }
}
