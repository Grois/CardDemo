package com.gechao.carddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVar();
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //设置并列2行的layoutManager
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        //设置adapter
        RecyclerAdapter adapter = new RecyclerAdapter(products);
        recyclerView.setAdapter(adapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //新建一些数据
    private void initVar() {

        products = new ArrayList<>();
        products.add(new Product(R.mipmap.a, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.b, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.c, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.d, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.e, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.f, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.g, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.j, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.h, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.a, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.e, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.b, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.d, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.h, "hello"+new Random().nextInt()));
        products.add(new Product(R.mipmap.c, "hello"+new Random().nextInt()));
    }
}
