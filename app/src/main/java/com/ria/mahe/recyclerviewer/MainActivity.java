package com.ria.mahe.recyclerviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<model> numList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for(int i=0;i<10;i++)
        {
           model modobj=new model;
           modobj.setNum(i+1);
           numList.add(modobj);

        }
        recyclerView=(RecyclerView) findViewById(R.id.recycle_view);
    }
}
