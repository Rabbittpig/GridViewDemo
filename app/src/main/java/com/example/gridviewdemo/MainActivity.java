package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.gridviewdemo.adapter.GridAdapter;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    String[] names = new String[]{
            "手机防盗","通讯卫士","软件管理","流量管理","进程管理","手机杀毒","缓存清理","高级工具","设置中心"
    };
    int [] icons  = new int[]{
            R.drawable.safe,R.drawable.img2, R.drawable.safe,R.drawable.img2,
            R.drawable.safe,R.drawable.img2, R.drawable.safe,R.drawable.img2,
            R.drawable.safe
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.grid_view);
        GridAdapter adapter = new GridAdapter(this,R.layout.grid_item,names,icons);
        gridView.setAdapter(adapter);
    }
}