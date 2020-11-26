package com.example.gridviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gridviewdemo.R;

/**
 * @author zwp
 * @description:
 * @date: 2020/11/26 14:44
 */
public class GridAdapter extends BaseAdapter {
    private Context context;
    private int resource;
    private String[] names;
    private int[] icons;

    //构造方法
    public GridAdapter(Context context, int resource, String[] names, int[] icons) {
        this.resource = resource;
        this.context = context;
        this.names = names;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid_image);
            holder.textView = convertView.findViewById(R.id.tv_grid_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imageView.setImageResource(icons[position]);
        holder.textView.setText(names[position]);
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
