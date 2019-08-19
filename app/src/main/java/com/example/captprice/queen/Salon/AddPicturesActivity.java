package com.example.captprice.queen.Salon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.captprice.queen.R;

public class AddPicturesActivity extends AppCompatActivity {
    TextView cancel_toolbar,save_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pictures);
        cancel_toolbar =(TextView)findViewById(R.id.toolbar_cancel);
        save_toolbar = (TextView)findViewById(R.id.toolbar_add_pictures_save);
        cancel_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        save_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
