package com.brazillianbrains.lojanovapinheiros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.brazillianbrains.lojanovapinheiros.adapter.ProductAdapter;
import com.brazillianbrains.lojanovapinheiros.model.ProductCategory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ProductAdapter productAdapter;
    RecyclerView productRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void setProductRecycler(List<ProductCategory> productCategoryList){

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(  this, RecyclerView.HORIZONTAL, false);




    }
}