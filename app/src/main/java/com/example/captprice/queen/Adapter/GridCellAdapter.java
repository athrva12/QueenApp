package com.example.captprice.queen.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GridCellAdapter extends BaseAdapter implements View.OnClickListener {



    private static final String tag = "GridCellAdapter";
    private Context cont=null;

    private final List<String> list;
    private static final int DAY_OFFSET = 1;
    private final String[] weekdays = new String[] { "Sun", "Mon", "Tue",
            "Wed", "Thu", "Fri", "Sat" };
    private final String[] months = { "January", "February", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    private final int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30,
            31, 30, 31 };
    int daysInMonth;
    int currentDayOfMonth;
    int currentWeekDay;

    Bundle toSend;
    Button gridcell;
    public HashMap<String, String> eventsPerMonthMap;
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");
    public GridCellAdapter(Context context, int textViewResourceId,
                           int month, int year) {
        super();
        this.cont = context;
        this.list = new ArrayList<String>();
        System.out.println("passing date for month " + month);

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        //setCurrentDayOfMonth(calendar.get(java.util.Calendar.DAY_OF_MONTH));
        //setCurrentWeekDay(calendar.get(java.util.Calendar.DAY_OF_WEEK));

        // Print Month
        //printMonth(month, year);

        // Find Number of Events
        //eventsPerMonthMap = findNumberOfEventsPerMonth(year, month);
    }
    private String getMonthAsString(int i) {
        return months[i];
    }

    // to get name of week
    private String getWeekDayAsString(int i) {
        return weekdays[i];
    }

    // to get number of days
    private int getNumberOfDaysOfMonth(int i) {
        return daysOfMonth[i];
    }

    // to get item form days list
    public String getItem(int position) {
        return list.get(position);
    }




    @Override
    public void onClick(View view) {

    }

    @Override
    public int getCount() {
        return 0;
    }



    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
