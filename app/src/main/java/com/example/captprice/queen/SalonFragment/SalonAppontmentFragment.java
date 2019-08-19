package com.example.captprice.queen.SalonFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.AppoinmentDetailsActivity;
import com.example.captprice.queen.Salon.AppointmentActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SalonAppontmentFragment extends Fragment {
    RelativeLayout relativeLayout;
    View view;


    public SalonAppontmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_salon_appontment, container, false);
        relativeLayout = (RelativeLayout)view.findViewById(R.id.relative_layout_appointment);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),AppoinmentDetailsActivity.class);
                startActivity(i);
            }
        });
        return view;
    }

}
