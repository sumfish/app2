package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent received=getIntent();
        String num=received.getStringExtra("COUNT");
        TextView show=findViewById(R.id.textnum);
        show.setText(num);
    }
}
