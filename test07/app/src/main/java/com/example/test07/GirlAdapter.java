package com.example.test07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GirlAdapter extends BaseAdapter {

    private Context myContext;
    private LayoutInflater myLayoutInflater;

    public GirlAdapter(Context context){

        this.myContext = context;
        myLayoutInflater = LayoutInflater.from(myContext);

    }

    @Override
    public int getCount() {
        return 20;
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

        ImageView image;
        TextView text;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView==null){
            convertView = myLayoutInflater.inflate(R.layout.girlitem,null);
            holder = new ViewHolder();
            holder.image = convertView.findViewById(R.id.image_02);
            holder.text = convertView.findViewById(R.id.textview01);
            convertView.setTag(holder);
        }else{

            holder = (ViewHolder) convertView.getTag();

        }

        Glide.with(myContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603513989033&di=474d80f4ddf69e12238d2eb0f3e970a2&imgtype=0&src=http%3A%2F%2Fawb.img.xmtbang.com%2Fimg%2Fuploadnew%2F201511%2F22%2Ff11133c248204f6d8c4e8ed95798619c.jpg").into(holder.image);
        holder.text.setText("迪丽热巴");







        return convertView;
    }
}
