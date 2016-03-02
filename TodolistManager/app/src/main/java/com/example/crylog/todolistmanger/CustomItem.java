package com.example.crylog.todolistmanger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by crylog on 02/03/16.
 */
public class CustomItem extends LinearLayout{
    private TextView TV;
    private CheckBox CB;
    public CustomItem(Context c)
    {
        super(c);
        init();
    }
    public CustomItem(Context c, AttributeSet as) {
        super(c, as);
        init();
    }
    public CustomItem(Context c, AttributeSet as, int style) {
        super(c, as, style);
        init();
    }
    private void init(){
        String inflator_service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li;
        li = (LayoutInflater) getContext().getSystemService(inflator_service);
        li.inflate(R.layout.customitem, this, true);
        TV = (TextView) findViewById(R.id.TV);
        CB = (CheckBox) findViewById(R.id.CB);
    }
}
