package com.example.s528747.childrenmonitoringsystem;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lv;
    String c="tarun";
    int x=0;
    String str;
    ArrayList<String> event = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        str= in.getStringExtra("Name");
        TextView ed=(TextView) findViewById(R.id.textView3);
        ed.setText(str);
        event.add("john");
        event.add("tarun");
        final ListView lv = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<String> server = new ArrayAdapter(this,R.layout.listview, R.id.textView6, event);
        lv.setAdapter(server);



    }
    public void add(View v){
        Intent ne= new Intent(this,Addchild.class);

        startActivity(ne);
    }

    public void settings(View v){
        Intent ne= new Intent(this,Settings.class);

        startActivity(ne);
    }

    public void click(View v)
    {
        Intent ne= new Intent(this,ChildSelect.class);
        ne.putExtra("username",str);
        ne.putExtra("child",c);
        startActivity(ne);

    }

}