package com.example.captprice.queen.Customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.captprice.queen.R;

public class NewQueryActivity extends AppCompatActivity {
    RelativeLayout r1,r2,r3,r4;
    ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_query);
        r1=(RelativeLayout)findViewById(R.id.select_services_layout1);
        r2=(RelativeLayout)findViewById(R.id.select_services_layout2);
        r3=(RelativeLayout)findViewById(R.id.select_services_layout3);
        r4=(RelativeLayout)findViewById(R.id.select_services_layout4);
        imageView1=(ImageView)findViewById(R.id.tick1);
        imageView2=(ImageView)findViewById(R.id.tick2);
        imageView3=(ImageView)findViewById(R.id.tick3);
        imageView4=(ImageView)findViewById(R.id.tick4);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);
                imageView4.setVisibility(View.GONE);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);
                imageView4.setVisibility(View.GONE);
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.GONE);
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);
                imageView4.setVisibility(View.VISIBLE);

            }
        });
    }
}
