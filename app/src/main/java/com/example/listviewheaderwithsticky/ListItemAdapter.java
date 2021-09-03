package com.example.listviewheaderwithsticky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListItemAdapter extends ArrayAdapter<Item> {
    public ListItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0,items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item items=getItem(position);
        if(convertView==null){
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.list_row, parent, false);
        }
        TextView title =  convertView.findViewById(R.id.title);
        title.setText(items.getTitle());

        return convertView;
    }
}
