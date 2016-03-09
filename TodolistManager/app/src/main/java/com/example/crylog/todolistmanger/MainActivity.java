package com.example.crylog.todolistmanger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mainlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.AddBtn);
        final EditText ET = (EditText) findViewById(R.id.ET);

        mainlist = (ListView) findViewById(R.id.mainlist);
        final ArrayList<Todo> al_todo = new ArrayList<Todo>();
        final TodoAdapter a = new TodoAdapter(this, al_todo);
// make the list view an observer of the array adapter.
        mainlist.setAdapter(a);

// add in 3 strings to the array adapter and ask the list view to update itself
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(ET.getText().toString().length()>0) {
                    Todo TD = new Todo(ET.getText().toString());
                    al_todo.add(TD);
                    ET.setText("");
                }
            }
                                  });

        mainlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent == mainlist) {
                    al_todo.remove(position);
                    a.notifyDataSetChanged();
                    return true;
                }

                return false;
            }
        });

        a.notifyDataSetChanged();
    }

}
