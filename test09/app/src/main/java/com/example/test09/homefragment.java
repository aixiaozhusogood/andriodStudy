package com.example.test09;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cz.msebera.android.httpclient.Header;

public class homefragment extends Fragment {

    private View view;

    RecyclerView myrecycler;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_home, null);
        }


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
           myrecycler = view.findViewById(R.id.home_recycleview);

           asynchttpPost();


//          StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

           LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
           myrecycler.setLayoutManager(layoutManager);
           myrecycler.setAdapter(new LineAdapyver(getActivity()));



    }



    //请求网络

    private void asynchttpPost(){

        String url = "http://154.8.210.240:5000/v1/jingxuanmoviesasp";
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("sourcetype","jingxuan");
        client.post(url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String s1=new String(responseBody);

                Log.v("panheng",s1);
                dataModel(s1);



            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.v("panheng", String.valueOf(responseBody));

            }
        });

    }


    private void dataModel(String json){

            Gson gsonm = new Gson();
            Movies mov = gsonm.fromJson(json,Movies.class);
            Log.v("zhuhuifang","nihaoyaxiaotuzi");



    }


    public class Movies{

        private String code;
        private List <MovieMsg>jixuanmovies;
        private String msg;



        public class MovieMsg{
    }

        private String actorsName;
        private String directorName;



    }






    //       void initrecycle(View myview){
//
//        myrecycler = myview.findViewById(R.id.home_recycleview);
//           LinearLayoutManager layoutManager = new LinearLayoutManager(homefragment.this);
//           myrecycler.setLayoutManager(layoutManager);
//        myrecycler.setAdapter();
//
//
//    }


}
