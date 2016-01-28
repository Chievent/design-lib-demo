package com.chievent.designlibdemo.floatinglabelofedittext;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import com.chievent.designlibdemo.R;

public class FloatingLabelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_label);

        final TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.text_layout1);
        textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int count = s.length();
                if (count > 10) {
                    textInputLayout.setError("wrong text");
                } else {
                    textInputLayout.setError("");
                }
            }
        });
    }
}
