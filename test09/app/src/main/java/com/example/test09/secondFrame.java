package com.example.test09;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class secondFrame extends Fragment {

    private View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.secondfragment, null);
//            unbinder = ButterKnife.bind(this, view);
//            inject();
//            initView();
//            initData();
//            mHomePresenter.getData(0);
//            refreshListen();  // 刷新，加载监听

        }

        return view;
    }

}
