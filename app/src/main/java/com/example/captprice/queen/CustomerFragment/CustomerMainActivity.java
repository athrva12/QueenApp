package com.example.captprice.queen.CustomerFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.captprice.queen.Customer.SearchActivity;
import com.example.captprice.queen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerMainActivity extends Fragment {
    View view;
    ImageView addbutton;
    RelativeLayout relativeLayout;


    public CustomerMainActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_customer_main, container, false);
        relativeLayout = (RelativeLayout)view.findViewById(R.id.layout_afterserch);
      relativeLayout.setVisibility(View.GONE);
        addbutton=(ImageView)view.findViewById(R.id.imageview_searchbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),SearchActivity.class);
               startActivity(i);

            }
        });

        return view;
    }

}
