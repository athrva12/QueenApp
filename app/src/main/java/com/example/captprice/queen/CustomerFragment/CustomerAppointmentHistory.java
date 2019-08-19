package com.example.captprice.queen.CustomerFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.captprice.queen.Customer.CustomerFeedbackAppointmentDetails;
import com.example.captprice.queen.Customer.CustomerHistory;
import com.example.captprice.queen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerAppointmentHistory extends Fragment {
    TextView back;
    View view;


    public CustomerAppointmentHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_customer_appointment_history, container, false);
        RelativeLayout layout = (RelativeLayout)view.findViewById(R.id.relative_layout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(),CustomerFeedbackAppointmentDetails.class);
                startActivity(i);

            }
        });


        return  view;
    }

}
