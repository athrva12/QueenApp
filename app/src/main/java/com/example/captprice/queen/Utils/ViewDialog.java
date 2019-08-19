package com.example.captprice.queen.Utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.captprice.queen.R;

public class ViewDialog {
    public void showDialog(Activity activity, String msg_large_text,String msg_small_text){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.custom_dialog);

        TextView text = (TextView) dialog.findViewById(R.id.textview_custom_dialog);
        text.setText(msg_large_text);
        TextView textView=(TextView)dialog.findViewById(R.id.please_enter_textview);
        textView.setText(msg_small_text);

        TextView dialogButton = (TextView) dialog.findViewById(R.id.cancel);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
