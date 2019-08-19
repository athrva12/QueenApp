package com.example.captprice.queen.SalonFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.FeedbackAppointmentDetails;
import com.example.captprice.queen.Salon.HistoryActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SalonHistoryFragment extends Fragment {
    View view;


    public SalonHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_salon_history, container, false);
         RelativeLayout layout = (RelativeLayout)view.findViewById(R.id.relative_layoutf);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(),FeedbackAppointmentDetails.class);
                startActivity(i);

            }
        });
        return view;
    }

}
