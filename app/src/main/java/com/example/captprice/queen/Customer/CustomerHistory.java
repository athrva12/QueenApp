package com.example.captprice.queen.Customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.FeedbackAppointmentDetails;
import com.example.captprice.queen.Salon.HistoryActivity;
import com.example.captprice.queen.Salon.ProfileActivity;

public class CustomerHistory extends AppCompatActivity {
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_history);
        layout = (RelativeLayout)findViewById(R.id.relative_layout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(CustomerHistory.this,CustomerFeedbackAppointmentDetails.class);
                startActivity(i);

            }
        });
    }
}
