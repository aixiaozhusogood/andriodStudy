package com.example.test09;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Random;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class LineAdapyver extends RecyclerView.Adapter<LineAdapyver.LinerViewHolder> {

    private Context mContext;

    public LineAdapyver(Context context){
        this.mContext = context;
    }


    @NonNull
    @Override
    public LineAdapyver.LinerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinerViewHolder(LayoutInflater.from(mContext).inflate(R.layout.lineitem,parent,false));
    }



    @Override
    public void onBindViewHolder(@NonNull LineAdapyver.LinerViewHolder holder, int position) {


         double d = Math.random();
         int i = (int)(d*2);

        String s =String.valueOf(i);

        Log.v("panheng",s);


         if (i==0){
             holder.textView.setText("高圆圆");

             Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603798022098&di=b77313f26a878f02d5fb40b4b4089313&imgtype=0&src=http%3A%2F%2Fimg3.tbcdn.cn%2Ftfscom%2Fi1%2F69890858%2FTB2Q4k7qVXXXXcSXXXXXXXXXXXX_%2521%252169890858.jpg").into(holder.image);
         }
         else if (i==1){
             holder.textView.setText("迪丽热巴");
             Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603798082755&di=7042583918fa9c402d1caf779d377b58&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201804%2F10%2F20180410150122_xuirk.jpg").into(holder.image);
         }

    }

//    @Override
//    public void onBindViewHolder(@NonNull LineAdapyver.LinerViewHolder holder, int position) {
//
//        holder.textView.setText("nihao");
//
//    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinerViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView image;
        public LinerViewHolder(View itemview){
            super(itemview);
            textView = itemview.findViewById(R.id.test_10);
            image = itemview.findViewById(R.id.image_01);

        }





    }

}
