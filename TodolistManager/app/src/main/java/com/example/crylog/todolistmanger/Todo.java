package com.example.crylog.todolistmanger;

/**
 * Created by crylog on 02/03/16.
 */
public class Todo {
    private boolean done = false;
    private String name = "";

    private void Done ()
    {
        done = true;
    }

    private boolean status()
    {
        return done;
    }
    private void Rename (String new_name)
    {
        name = new_name;
    }

    private String Actual_Name()
    {
        return name;
    }

}
