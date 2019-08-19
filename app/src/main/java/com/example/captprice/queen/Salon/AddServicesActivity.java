package com.example.captprice.queen.Salon;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Utils.ViewDialog;
import com.example.captprice.queen.Utils.ViewDialogServices;

import org.w3c.dom.Text;

public class AddServicesActivity extends AppCompatActivity {
    ImageView addnewservices,addservices2;
    TextView cancel_toolbar,update_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_services);
        addservices2=(ImageView)findViewById(R.id.add_servicesicon2);
        addnewservices=(ImageView)findViewById(R.id.add_servicesicon);
        addservices2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialogServices alert = new ViewDialogServices();
                alert.showDialogServices(AddServicesActivity.this);
            }
        });
        addnewservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialogServices alert = new ViewDialogServices();
                alert.showDialogServices(AddServicesActivity.this);
            }
        });


        cancel_toolbar =(TextView)findViewById(R.id.toolbar_cancel);
        update_toolbar = (TextView)findViewById(R.id.toolbar_update);
        cancel_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        update_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
