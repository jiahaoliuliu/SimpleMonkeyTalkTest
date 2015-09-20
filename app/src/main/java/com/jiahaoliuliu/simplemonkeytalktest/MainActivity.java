package com.jiahaoliuliu.simplemonkeytalktest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] myDataset = new String[]{"Apple Pie", "Banana Bread", "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Mershmallow"};

    private Context mContext;

//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

//        // Link the elements
//        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//
//        // This this setting to improve the performance if you know that changes
//        // in content do not change the layout sie of the RecyclerView
//        mRecyclerView.setHasFixedSize(true);
//
//        // Use a linearLayoutManager
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        // Specify an adapter
//        mAdapter = new RecyclerViewAdapter(mContext, myDataset);
//        mRecyclerView.setAdapter(mAdapter);
    }
}