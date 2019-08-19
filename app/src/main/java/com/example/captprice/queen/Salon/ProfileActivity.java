package com.example.captprice.queen.Salon;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Utils.ViewDialog;

import static android.app.PendingIntent.getActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Address,vat_number,cr_number,pictures_edit,working_hours,serices_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Address=(TextView)findViewById(R.id.address_edit_text);
        vat_number=(TextView)findViewById(R.id.vatnumber_edittext);
        cr_number=(TextView)findViewById(R.id.cr_number_edit_text);
        pictures_edit=(TextView)findViewById(R.id.pictures_edit_text);
        working_hours=(TextView)findViewById(R.id.workinghours_edit_text);
        serices_edit=(TextView)findViewById(R.id.services_edit_text);
        serices_edit.setOnClickListener(this);
        Address.setOnClickListener(this);
        vat_number.setOnClickListener(this);
        cr_number.setOnClickListener(this);
        pictures_edit.setOnClickListener(this);
        working_hours.setOnClickListener(this);
        serices_edit.setOnClickListener(this);
        vat_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(ProfileActivity.this, "Edit VAt number","Please enter VAT number");
            }
        });
        cr_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(ProfileActivity.this, "Edit CR number","Please enter CR number");
            }
        });
 }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.address_edit_text:
                Intent i = new Intent(ProfileActivity.this,AddressEditActivity.class);
                startActivity(i);
                break;
            case R.id.vatnumber_edittext:
                break;
            case R.id.pictures_edit_text:
                i= new Intent(ProfileActivity.this,AddPicturesActivity.class);
                startActivity(i);
                break;
            case R.id.workinghours_edit_text:
                i= new Intent(ProfileActivity.this,WorkingHoursActivity.class);
                startActivity(i);
                break;
            case R.id.services_edit_text:
                i= new Intent(ProfileActivity.this,AddServicesActivity.class);
                startActivity(i);
                break;

        }

    }
}
