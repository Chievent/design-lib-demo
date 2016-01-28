package com.chievent.designlibdemo.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.chievent.designlibdemo.R;

public class CoorAppbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor_appbar);

        setupToolbar();
        setupTabs();
        setupList();
    }

    private void setupList() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setAdapter(new MyAdapter(20));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void setupTabs() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        addTab(tabLayout, "tab1");
        addTab(tabLayout, "tab2");
        addTab(tabLayout, "tab3");
    }

    private void addTab(TabLayout tabLayout, String tab1) {
        tabLayout.addTab(tabLayout.newTab().setText(tab1));
    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
