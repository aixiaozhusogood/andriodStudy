package com.example.test07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView label1,label2,label3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView==null){
            convertView = mLayoutInflater.inflate(R.layout.item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.image_01);
            holder.label1 = convertView.findViewById(R.id.text_01);
            holder.label2 = convertView.findViewById(R.id.text_02);
            holder.label3 = convertView.findViewById(R.id.text_03);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.label1.setText("wozhengao");
        holder.label1.setText("我相信");
        holder.label1.setText("迪丽热巴");
        Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603513989033&di=474d80f4ddf69e12238d2eb0f3e970a2&imgtype=0&src=http%3A%2F%2Fawb.img.xmtbang.com%2Fimg%2Fuploadnew%2F201511%2F22%2Ff11133c248204f6d8c4e8ed95798619c.jpg").into(holder.imageView);

        holder.imageView.setScaleType(ImageView.ScaleType.MATRIX);
        //        Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603512653879&di=b5a61270af4d6cd30d2984a6737ec463&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-09-25%2F5ba9957dc955a.jpg").into(holder.imageView);






        return convertView;
    }
}
