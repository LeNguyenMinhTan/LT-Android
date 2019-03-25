package com.gnollys88.apptracnghiemlichsu.slide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gnollys88.apptracnghiemlichsu.R;

public class GioiThieuActivity extends AppCompatActivity {
    Button btngioithieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_thieu);
        init();
        click();

    }

    private void click() {
        btngioithieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(GioiThieuActivity.this, "thượng lộ bình tĩnh , đi không tiễn nhé =]]!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        Button btngioithieu = findViewById(R.id.btngioithieuthoat);
    }
}
