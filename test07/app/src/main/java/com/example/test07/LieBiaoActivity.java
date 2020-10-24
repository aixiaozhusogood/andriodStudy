package com.example.test07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class LieBiaoActivity extends AppCompatActivity {

    private RecyclerView recycle;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lie_biao);

        recycle = (RecyclerView) findViewById(R.id.rv_main);
        recycle.setLayoutManager(new LinearLayoutManager(LieBiaoActivity.this));
        recycle.setAdapter(new LinerAdapter(LieBiaoActivity.this));




    }
}