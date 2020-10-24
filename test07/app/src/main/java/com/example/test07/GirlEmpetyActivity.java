package com.example.test07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GirlEmpetyActivity extends AppCompatActivity {

    private GridView mygirdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_empety);

        mygirdview = (GridView) findViewById(R.id.grid_01);
        mygirdview.setAdapter(new GirlAdapter(GirlEmpetyActivity.this));





    }
}