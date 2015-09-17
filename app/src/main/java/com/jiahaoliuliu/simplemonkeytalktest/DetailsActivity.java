package com.jiahaoliuliu.simplemonkeytalktest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    public static final String INTENT_TITLE_KEY = "com.jiahaoliuliu.simplemonkeytalktest.DetailsActivity.title";

    // Internal data
    private String mTitle;

    // Views
    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get the extra key
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(INTENT_TITLE_KEY)) {
            throw new IllegalArgumentException("You must pass the title in the intent");
        }
        mTitle = extras.getString(INTENT_TITLE_KEY);

        // Link the views
        mTitleTextView = (TextView) findViewById(R.id.title_text_view);
        mTitleTextView.setText(mTitle);

        // Display the up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Back to the previous activity
            onBackPressed();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
