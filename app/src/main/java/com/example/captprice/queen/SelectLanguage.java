package com.example.captprice.queen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.captprice.queen.Activity.ChooseUserActivity;

public class SelectLanguage extends AppCompatActivity  {

     Button english_button,urdu_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        english_button=(Button)findViewById(R.id.language_english);
        urdu_button=(Button)findViewById(R.id.language_urdu);
        english_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectLanguage.this,ChooseUserActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
