package com.crusader.epoxyrecyclerattempt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;

/**
 * Created by CRUSADER on 1/22/2017.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

//        int spanCount = getSpanCount();

        SampleAdapter sampleAdapter = new SampleAdapter(this);
//        sampleAdapter.setSpanCount(spanCount);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, spanCount);
//        gridLayoutManager.setSpanSizeLookup(sampleAdapter.getSpanSizeLookup());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sampleAdapter);
    }

    private void initComponents() {
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
    }

//    private int getSpanCount() {
//        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
//        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
//        return (int) (dpWidth / 100);
//    }
}
