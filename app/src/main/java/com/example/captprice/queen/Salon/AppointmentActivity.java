package com.example.captprice.queen.Salon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.captprice.queen.Adapter.GridCellAdapter;
import com.example.captprice.queen.Customer.AppointmentDetailsCustomer;
import com.example.captprice.queen.R;
import com.riontech.calendar.CustomCalendar;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

import static java.security.AccessController.getContext;

public class AppointmentActivity extends AppCompatActivity implements View.OnClickListener {
    private CustomCalendar customCalendar;
        RelativeLayout relativeLayout;
    GridView calendarView;
    GridCellAdapter adapter;
    java.util.Calendar cal;
    private final DateFormat dateFormatter = new DateFormat() {
        @Override
        public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            return null;
        }

        @Override
        public Date parse(String s, ParsePosition parsePosition) {
            return null;
        }
    };
    private static final String dateTemplate = "MMMM yyyy";
    private int month, year;


    private static final String TAG = AppointmentActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        cal = java.util.Calendar.getInstance(Locale.getDefault());
        month = cal.get(java.util.Calendar.MONTH) + 1;
        year = cal.get(java.util.Calendar.YEAR);

        // setting listener for previous month
//        ImageView prevMonth = (ImageView) findViewById(R.id.prevMonth);
//        prevMonth.setOnClickListener(this);
//
//        // setting listerner for next month
//        ImageView nextMonth = (ImageView) findViewById(R.id.nextMonth);
//        nextMonth.setOnClickListener(this);
//
//        // setting current month and year
//        TextView currentMonth = (TextView)findViewById(R.id.currentMonth);
//        //currentMonth.setText(DateFormat.format(dateTemplate, cal.getTime()));
//
//        calendarView = (GridView)findViewById(R.id.calendar);






        relativeLayout = (RelativeLayout)findViewById(R.id.relative_layout_appointment);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppointmentActivity.this,AppoinmentDetailsActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

    }

    // @Override
//    public void onClick(View view) {
//        switch (view.getId())
//        {
//            case R.id.prevMonth:
//
//
//                    if (month <= 1) {
//                        month = 12;
//                        year--;
//                    } else {
//                        month--;
//                    }
//                    break;
//            case R.id.nextMonth:
//                if (month > 11) {
//                    month = 1;
//                    year++;
//                } else {
//                    month++;
//                }
//                 break;
//
//        }
//
//        setGridCellAdapterToDate(month, year);
//    }
//
//
//    private void setGridCellAdapterToDate(int month, int year) {
//    //    adapter = new GridCellAdapter(getContext(),
//  //              R.id.calendar_day_gridcell, month, year);
//        cal.set(year, month - 1, cal.get(java.util.Calendar.DAY_OF_MONTH));
//      //  currentMonth.setText(DateFormat.format(dateTemplate, cal.getTime()));
//        adapter.notifyDataSetChanged();
//        calendarView.setAdapter(adapter);
//    }

}
