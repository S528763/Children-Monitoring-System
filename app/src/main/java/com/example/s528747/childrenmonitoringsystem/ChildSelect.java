package com.example.s528747.childrenmonitoringsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childselect);
        TextView ed=(TextView) findViewById(R.id.user);
        TextView ed1=(TextView) findViewById(R.id.child);
        Intent in=getIntent();
        String user=in.getStringExtra("username");
        String child=in.getStringExtra("child");
        ed.setText(user);
        ed1.setText(child);
    }
}