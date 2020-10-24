package com.example.test07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollerActivity extends AppCompatActivity {

    Button liebiaoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);

        liebiaoBtn = findViewById(R.id.liebiao_01);
        liebiaoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tpage = new Intent(ScrollerActivity.this,LieBiaoActivity.class);
                startActivity(tpage);

            }
        });
    }
}