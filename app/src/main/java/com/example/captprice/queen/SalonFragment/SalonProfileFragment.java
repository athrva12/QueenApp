package com.example.captprice.queen.SalonFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.AddPicturesActivity;
import com.example.captprice.queen.Salon.AddServicesActivity;
import com.example.captprice.queen.Salon.AddressEditActivity;
import com.example.captprice.queen.Salon.ProfileActivity;
import com.example.captprice.queen.Salon.WorkingHoursActivity;
import com.example.captprice.queen.Utils.ViewDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class SalonProfileFragment extends Fragment implements View.OnClickListener {
    View view;
    TextView Address,vat_number,cr_number,pictures_edit,working_hours,serices_edit;


    public SalonProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_salon_profile, container, false);
        Address=(TextView)view.findViewById(R.id.address_edit_text);
        vat_number=(TextView)view.findViewById(R.id.vatnumber_edittext);
        cr_number=(TextView)view.findViewById(R.id.cr_number_edit_text);
        pictures_edit=(TextView)view.findViewById(R.id.pictures_edit_text);
        working_hours=(TextView)view.findViewById(R.id.workinghours_edit_text);
        serices_edit=(TextView)view.findViewById(R.id.services_edit_text);
        serices_edit.setOnClickListener(this);
        Address.setOnClickListener(this);
        vat_number.setOnClickListener(this);
        cr_number.setOnClickListener(this);
        pictures_edit.setOnClickListener(this);
        working_hours.setOnClickListener(this);
        serices_edit.setOnClickListener(this);
        vat_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(getActivity(), "Edit VAt number","Please enter VAT number");
            }
        });
        cr_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(getActivity(), "Edit CR number","Please enter CR number");
            }
        });
    return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.address_edit_text:
                Intent i = new Intent(getActivity(),AddressEditActivity.class);
                startActivity(i);
                break;
            case R.id.vatnumber_edittext:
                break;
            case R.id.pictures_edit_text:
                i= new Intent(getActivity(),AddPicturesActivity.class);
                startActivity(i);
                break;
            case R.id.workinghours_edit_text:
                i= new Intent(getActivity(),WorkingHoursActivity.class);
                startActivity(i);
                break;
            case R.id.services_edit_text:
                i= new Intent(getActivity(),AddServicesActivity.class);
                startActivity(i);
                break;

        }

    }
}
