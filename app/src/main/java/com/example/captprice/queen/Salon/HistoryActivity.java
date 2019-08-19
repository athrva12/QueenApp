package com.example.captprice.queen.Salon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.captprice.queen.R;

public class HistoryActivity extends AppCompatActivity {
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        layout = (RelativeLayout)findViewById(R.id.relative_layout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(HistoryActivity.this,FeedbackAppointmentDetails.class);
                startActivity(i);

            }
        });
    }
}
