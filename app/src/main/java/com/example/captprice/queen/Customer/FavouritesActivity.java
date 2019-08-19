package com.example.captprice.queen.Customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.captprice.queen.R;

public class FavouritesActivity extends AppCompatActivity {
LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        layout = (LinearLayout)findViewById(R.id.layout_linear);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FavouritesActivity.this,AppointmentDetailsCustomer.class);
                startActivity(i);
                finish();
            }
        });

    }
}
