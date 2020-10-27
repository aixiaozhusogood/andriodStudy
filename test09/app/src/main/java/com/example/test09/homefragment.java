package com.example.test09;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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


          StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

//           LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
           myrecycler.setLayoutManager(layoutManager);
           myrecycler.setAdapter(new LineAdapyver(getActivity()));



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
