package com.example.crylog.todolistmanger;

/**
 * Created by crylog on 02/03/16.
 */
public class Todo {
    private boolean done;
    private String name;

    Todo(String str, boolean dn)
    {
        done = dn;
        name = str;
    }
    public void Done ()
    {
        done = true;
    }

    public boolean status()
    {
        return done;
    }
    public void Rename (String new_name)
    {
        name = new_name;
    }

    public String Actual_Name()
    {
        return name;
    }

}
