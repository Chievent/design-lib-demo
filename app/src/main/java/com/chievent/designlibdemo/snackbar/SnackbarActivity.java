package com.chievent.designlibdemo.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chievent.designlibdemo.R;

public class SnackbarActivity extends AppCompatActivity {

    private View.OnClickListener myOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO: 1/11/16
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        final View root = findViewById(R.id.container);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar
                        .make(root, "snack bar~~", Snackbar.LENGTH_LONG)
                        .setAction("action", myOnClickListener)
                        .show(); // Don’t forget to show!
            }
        });
    }
}
