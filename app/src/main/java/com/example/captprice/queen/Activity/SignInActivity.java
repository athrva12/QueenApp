package com.example.captprice.queen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.captprice.queen.Customer.QueenActivity;
import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.NewRequestActivity;
import com.example.captprice.queen.Salon.SaloonSignUpActivity;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    Button signin;
    TextView signup,swtichUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signin= (Button)findViewById(R.id.signin_button);
        signup=(TextView)findViewById(R.id.textview_signup_page);
        swtichUser=(TextView)findViewById(R.id.textview_switchuser);
        Bundle b= getIntent().getExtras();
        final String screen = b.getString("salon");
        final int s= Integer.parseInt(screen);

       // Toast.makeText(getApplicationContext(),Integer.toString(s),Toast.LENGTH_LONG).show();

        swtichUser.setOnClickListener(this);
        Class next= null;
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(s==1){
                Intent i = new Intent(SignInActivity.this, NewRequestActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i = new Intent(SignInActivity.this, QueenActivity.class);
                    startActivity(i);
                    finish();

                }

            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this,SaloonSignUpActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.textview_switchuser:
                Intent in= new Intent(SignInActivity.this,ChooseUserActivity.class);
                startActivity(in);
                finish();
                break;
        }
    }
}
