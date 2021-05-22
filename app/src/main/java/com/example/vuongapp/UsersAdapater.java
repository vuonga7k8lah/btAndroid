package com.example.vuongapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UsersAdapater extends BaseAdapter {
    Context context;
    int layout;
    List<Users> usersList;

    public UsersAdapater(Context context, int layout, List<Users> usersList) {
        this.context = context;
        this.layout = layout;
        this.usersList = usersList;
    }

    @Override
    public int getCount() {
        return usersList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        //Ánh Xạ
        TextView tvUserName = (TextView) convertView.findViewById(R.id.username);
        TextView tvQueQuan = (TextView) convertView.findViewById(R.id.QueQuan);
        ImageView tvAnh = (ImageView) convertView.findViewById(R.id.img);

        tvUserName.setText(usersList.get(position).hoTen);
        tvQueQuan.setText(usersList.get(position).diaChi);
        tvAnh.setImageResource(usersList.get(position).hinhAnh);
        return convertView;
    }
}
