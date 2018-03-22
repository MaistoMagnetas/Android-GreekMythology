package com.cactustree.pc.greek;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * Created by PC on 2/12/2018.
 */

public class CustomAdapter extends BaseAdapter {
    public static Boolean isScrolling = true;
    Context context;
    int[] titles;
    int[] icons;
    LayoutInflater inflater;


    public CustomAdapter(Context context, int[] titles, int[] icons) {
        this.context = context;
        this.titles = titles;
        this.icons = icons;
        inflater = (LayoutInflater.from(context));
    }

    //Sumazina laga listview. Nesikreipia findview kiekviena karta
    static class ViewHolder{
        TextView title;
        ImageView icon;
    }

    public CustomAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.grid_view_item,null);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.titleText);
            holder.icon = (ImageView) convertView.findViewById(R.id.imageIcon);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        //OP vieta su picaso biblioteka. - Nuima listviw Lagga.
        Picasso.with(context)
                .load(icons[position])
                .resize(200,200)
                .into(holder.icon);
        holder.title.setText(titles[position]);


        return convertView;
    }
}
