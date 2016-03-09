package com.example.crylog.todolistmanger;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by crylog on 09/03/16.
 */
public class TodoAdapter extends ArrayAdapter<Todo> {

    Context context;
    ArrayList<Todo> TODO = null;
    public TodoAdapter(Context context, ArrayList<Todo> objects) {
        super(context,0,objects);
        this.context = context;
        this.TODO = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Todo TODO = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customitem,parent,false);
        }
        TextView TV = (TextView) convertView.findViewById(R.id.TV);
        CheckBox CB = (CheckBox) convertView.findViewById(R.id.CB);
        TV.setText(TODO.Actual_Name());
        CB.setChecked(false);
        return convertView;
    }


}
