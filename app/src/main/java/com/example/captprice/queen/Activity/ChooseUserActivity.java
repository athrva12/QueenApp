package com.example.captprice.queen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.captprice.queen.Customer.QueenActivity;
import com.example.captprice.queen.R;

public class ChooseUserActivity extends AppCompatActivity {
   Button salon,queen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);
        salon=(Button)findViewById(R.id.user_salon);
        queen=(Button)findViewById(R.id.user_queen);
        salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ChooseUserActivity.this,SignInActivity.class);
                i.putExtra("salon","1");
                startActivity(i);
                finish();
            }
        });
        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ChooseUserActivity.this,SignInActivity.class);
                i.putExtra("queen","queen");
                i.putExtra("salon","2");
                startActivity(i);
                finish();
            }
        });

    }
}
