package com.example.crylog.todolistmanger;

/**
 * Created by crylog on 02/03/16.
 */
public class Todo {
    private boolean done;
    private String name;

    Todo(String str)
    {
        done = false;
        name = str;
    }
    public void SetBool (boolean bool)
    {
        done = bool;
    }

    public boolean status()
    {
        return done;
    }

    public String Actual_Name()
    {
        return name;
    }

}
