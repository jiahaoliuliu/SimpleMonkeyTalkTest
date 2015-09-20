package com.jiahaoliuliu.simplemonkeytalktest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] mValues = new String[]{"Apple Pie", "Banana Bread", "Cupcake", "Donut", "Eclair",
            "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Mershmallow"};

    private Context mContext;

    // Views
    private ListView mSimpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        // Link the views
        mSimpleListView = (ListView) findViewById(R.id.simple_list_view);

        // Set the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mValues);
        mSimpleListView.setAdapter(adapter);

        // Click listener
        mSimpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = mValues[position];

                // Launch the details activity
                Intent startDetailsActivityIntent = new Intent(mContext, DetailsActivity.class);
                startDetailsActivityIntent.putExtra(DetailsActivity.INTENT_TITLE_KEY, value);
                startActivity(startDetailsActivityIntent);
            }
        });
    }
}