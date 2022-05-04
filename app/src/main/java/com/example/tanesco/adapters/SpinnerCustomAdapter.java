package com.example.tanesco.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tanesco.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class SpinnerCustomAdapter extends BaseAdapter {
    Context context;

    ArrayList<String>items;

    public SpinnerCustomAdapter(Context context,  ArrayList<String> items) {
        this.context = context;

        this.items = items;
    }



    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.spinner_item,null);
        TextView textView=view.findViewById(R.id.spinner_text);
        textView.setText(items.get(i));
        return view;
    }
}
