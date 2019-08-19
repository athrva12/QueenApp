package com.example.captprice.queen.Salon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.captprice.queen.R;

public class SaloonSignUpActivity extends AppCompatActivity {
     Button signup;TextView already_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saloon_sign_up);
        signup = (Button)findViewById(R.id.signup_button_salon);
        already_user= (TextView)findViewById(R.id.existing_user_textview);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaloonSignUpActivity.this,OtpVarificationActivity.class);
                startActivity(i);
                finish();

            }
        });

        already_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

    }


}
