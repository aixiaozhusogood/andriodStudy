package com.example.test07;

import androidx.appcompat.app.AppCompatActivity;
import recyerviewstudy.RecycleListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    private ImageView view1,view2,view3,view4;

    private Button button01;
    private Button btnscroller,custombtnlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = (Button)findViewById(R.id.button_01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tpage = new Intent(MainActivity.this,GirlEmpetyActivity.class);
                startActivity(tpage);
            }
        });

        btnscroller = findViewById(R.id.button_scroller);
        btnscroller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tpage = new Intent(MainActivity.this,ScrollerActivity.class);
                startActivity(tpage);
            }
        });

        custombtnlist = findViewById(R.id.button_list);
        custombtnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tpage = new Intent(MainActivity.this, RecycleListActivity.class);
                startActivity(tpage);

            }
        });




//        view1 = findViewById(R.id.view1_01);
//        view1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.v("panheng","我是一只鱼");
//            }
//        });


//        view2 = findViewById(R.id.view1_02);
//        view2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.v("panheng","我是二只鱼");
//
//                Intent tpage = new Intent(MainActivity.this,TestActivity02.class);
//                startActivity(tpage);
//
//
//            }
//        });


//        view3 = findViewById(R.id.view1_03);
//        view3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.v("panheng","我是三只鱼");
//            }
//        });


//        view4 = findViewById(R.id.view1_04);
//        view1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.v("panheng","我是四只鱼");
//            }
//        });




//        ArrayList<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("title","panheng");
//        map.put("name","name1");
//        map.put("time","1992/09.01");
//        list.add(map);







//        listview = (ListView)findViewById(R.id.list_01);
//        String[] str = {"上海","北京","天津","江苏","河南","西藏","新疆","湖南","湖北"};
//
//        List<String> listdata = new ArrayList<String>();
//
//
//        for (int i=0;i<100;i++){
//            listdata.add("上海");
//
//        }
////        listdata.add("上海");
////        listdata.add("北京");
////        listdata.add("天津");
////        listdata.add("江苏");
//
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,listdata);
//        listview.setAdapter(arrayAdapter);

//        Log.v("panheng","nihao");
//        SimpleAdapter adapter = new SimpleAdapter(
//                this,
//                list,
//                R.layout.item,
//                new String[]{"title","name","time"},
//                new int[]{R.id.text_01,R.id.text_02, R.id.text_03}
//        );
//        listview.setAdapter(adapter);


//        listview = (ListView) findViewById(R.id.listview_01);
//
//        listview.setAdapter(new MyListAdapter(MainActivity.this));











    }
}