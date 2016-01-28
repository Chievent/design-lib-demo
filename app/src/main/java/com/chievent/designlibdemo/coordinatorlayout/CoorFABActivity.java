package com.chievent.designlibdemo.coordinatorlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.chievent.designlibdemo.R;

public class CoorFABActivity extends AppCompatActivity {

    private String[] mItems = new String[] {
            "first", "second", "third", "fourth", "fifth"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor_fab);

        setupListView();
    }

    private void setupListView() {
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItems));
    }
}
