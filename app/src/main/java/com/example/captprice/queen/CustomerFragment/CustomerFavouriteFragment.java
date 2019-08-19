package com.example.captprice.queen.CustomerFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.captprice.queen.Customer.AppointmentDetailsCustomer;
import com.example.captprice.queen.Customer.CustomerSalonViewActivity;
import com.example.captprice.queen.Customer.FavouritesActivity;
import com.example.captprice.queen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerFavouriteFragment extends Fragment {
    View view;

    TextView toolbaredit;


    public CustomerFavouriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_customer_favourite, container, false);

        LinearLayout layout = (LinearLayout)view.findViewById(R.id.layout_linear);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),CustomerSalonViewActivity.class);
                startActivity(i);
                //11finish();
            }
        });
       // toolbaredit=(TextView)view.findViewById(R.id.toolbar_main_edit)
        return view;
    }

}
