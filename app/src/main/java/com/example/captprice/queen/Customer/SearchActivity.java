package com.example.captprice.queen.Customer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Utils.DialogSearchType;

import java.sql.BatchUpdateException;

public class SearchActivity extends AppCompatActivity {
 Button submit_querry;
 ImageView search_icon;
 TextView list,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        submit_querry=(Button)findViewById(R.id.submit_querry_button1);
        submit_querry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SearchActivity.this,NewQueryActivity.class);
                startActivity(i);
                finish();
            }
        });
        search_icon=(ImageView)findViewById(R.id.search_icon);
        search_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSearchType dialogSearchType= new DialogSearchType();
                dialogSearchType.showDialog(SearchActivity.this);
            }
        });
        list=(TextView)findViewById(R.id.textview_listview);
        map=(TextView)findViewById(R.id.textview_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.setBackgroundColor(getResources().getColor(R.color.black));
                list.setBackgroundColor(getResources().getColor(R.color.white));
                map.setTextColor(getResources().getColor(R.color.white));
                list.setTextColor(getResources().getColor(R.color.black));
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.setBackgroundColor(getResources().getColor(R.color.white));
                list.setBackgroundColor(getResources().getColor(R.color.black));
                map.setTextColor(getResources().getColor(R.color.black));
                list.setTextColor(getResources().getColor(R.color.white));

            }
        });

    }
}
