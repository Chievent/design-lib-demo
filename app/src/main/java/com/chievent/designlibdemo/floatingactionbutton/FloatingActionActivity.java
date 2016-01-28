package com.chievent.designlibdemo.floatingactionbutton;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.chievent.designlibdemo.R;

public class FloatingActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action);

//        Toolbar

        final FloatingActionButton button = (FloatingActionButton) findViewById(R.id.floating_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                button.hide();
            }
        });

        PorterDuff.Mode mode = button.getBackgroundTintMode();
        Log.d("august", "mode is " + mode);
    }
}
