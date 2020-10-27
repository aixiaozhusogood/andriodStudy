package com.example.test09;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    private homefragment mHomeFragment;  // 首页
    private secondFrame msecondFragment;
    // Fragment管理器，和执行器
    private FragmentManager mManager;
    private FragmentTransaction mTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDefaultFragment();


        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {

                    mHomeFragment=new homefragment();
                    mManager = getSupportFragmentManager();
                    mTransaction = mManager.beginTransaction();
                    mTransaction.add(R.id.contentContainer, mHomeFragment);
                    mTransaction.commit();

                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.

                }

                if (tabId == R.id.tab_nearby){
                    Log.v("panheng","nihao");


//                        mHotShowFragment =  HotShowFragment.newInstance();
//                        mTransaction.add(R.id.ll_content,
//                                mHotShowFragment);

                    msecondFragment=new secondFrame();
                    mManager = getSupportFragmentManager();
                    mTransaction = mManager.beginTransaction();
                    mTransaction.add(R.id.contentContainer, msecondFragment);
                    mTransaction.commit();



                }

            }
        });

    }


    private void setDefaultFragment() {
        mHomeFragment=new homefragment();
        mManager = getSupportFragmentManager();
        mTransaction = mManager.beginTransaction();
        mTransaction.add(R.id.contentContainer, mHomeFragment);
        mTransaction.commit();
    }

}