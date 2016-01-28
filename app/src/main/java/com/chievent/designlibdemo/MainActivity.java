package com.chievent.designlibdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chievent.designlibdemo.coordinatorlayout.CoorAppbarActivity;
import com.chievent.designlibdemo.coordinatorlayout.CoorCollapseToolbarActivity;
import com.chievent.designlibdemo.coordinatorlayout.CoorCollapseToolbarActivityParallax;
import com.chievent.designlibdemo.coordinatorlayout.CoorFABActivity;
import com.chievent.designlibdemo.floatingactionbutton.FloatingActionActivity;
import com.chievent.designlibdemo.floatinglabelofedittext.FloatingLabelActivity;
import com.chievent.designlibdemo.navigationdrawer.DrawerActivity;
import com.chievent.designlibdemo.navigationdrawer.NavDrawerActivity;
import com.chievent.designlibdemo.snackbar.SnackbarActivity;
import com.chievent.designlibdemo.tablayout.TabLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    startActivity(new Intent(MainActivity.this, DrawerActivity.class));
                    break;
                case R.id.button2:
                    startActivity(new Intent(MainActivity.this, NavDrawerActivity.class));
                    break;
                case R.id.button3:
                    startActivity(new Intent(MainActivity.this, FloatingLabelActivity.class));
                    break;
                case R.id.button4:
                    startActivity(new Intent(MainActivity.this, FloatingActionActivity.class));
                    break;
                case R.id.button5:
                    startActivity(new Intent(MainActivity.this, SnackbarActivity.class));
                    break;
                case R.id.button6:
                    startActivity(new Intent(MainActivity.this, TabLayoutActivity.class));
                    break;
                case R.id.button7:
                    startActivity(new Intent(MainActivity.this, CoorFABActivity.class));
                    break;
                case R.id.button8:
                    startActivity(new Intent(MainActivity.this, CoorAppbarActivity.class));
                    break;
                case R.id.button9:
                    startActivity(new Intent(MainActivity.this, CoorCollapseToolbarActivity.class));
                    break;
                case R.id.button10:
                    startActivity(new Intent(MainActivity.this, CoorCollapseToolbarActivityParallax.class));
                default:
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton(R.id.button1);
        initButton(R.id.button2);
        initButton(R.id.button3);
        initButton(R.id.button4);
        initButton(R.id.button5);
        initButton(R.id.button6);
        initButton(R.id.button7);
        initButton(R.id.button8);
        initButton(R.id.button9);
        initButton(R.id.button10);
    }

    private void initButton(int btnId) {
        findViewById(btnId).setOnClickListener(mListener);
    }
}
