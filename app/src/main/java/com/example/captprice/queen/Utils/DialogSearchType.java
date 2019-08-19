package com.example.captprice.queen.Utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.ProfileActivity;

public class DialogSearchType {
    public void showDialog(final Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.search_by);

        TextView location= (TextView)dialog.findViewById(R.id.Loaction);
        TextView Services= (TextView)dialog.findViewById(R.id.Services);
        TextView Salon_name= (TextView)dialog.findViewById(R.id.salon_name);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(  activity, "Enter City","Please enter the city you want to search in");
                dialog.dismiss();
            }
        });

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(  activity, "Enter Services","Please enter the city you want to search in");

            }
        });
        Salon_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(  activity, "Enter Salon Name","Please enter the salon name you want to search in");

            }
        });
        dialog.show();
        dialog.onBackPressed();

    }
}
