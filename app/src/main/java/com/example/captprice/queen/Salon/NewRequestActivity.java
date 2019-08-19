package com.example.captprice.queen.Salon;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.captprice.queen.Activity.ChooseUserActivity;
import com.example.captprice.queen.R;
import com.example.captprice.queen.SalonFragment.SalonAppontmentFragment;
import com.example.captprice.queen.SalonFragment.SalonHistoryFragment;
import com.example.captprice.queen.SalonFragment.SalonNewRequestFragment;
import com.example.captprice.queen.SalonFragment.SalonProfileFragment;
import com.example.captprice.queen.SalonFragment.SalonSettingFragment;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class NewRequestActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ActionBarDrawerToggle mtoggle;
    private DrawerLayout mdrawerLayout;
    android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_request);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        setNavigationViewListner();
        mdrawerLayout=(DrawerLayout)findViewById(R.id.mdrawable);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerLayout,R.string.open,R.string.close);

        mdrawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentManager fragmentManager =getSupportFragmentManager();
        Fragment fragment= null;
        Class fragmentClass = SalonNewRequestFragment.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        fragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit();

    }
    private void setNavigationViewListner() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navbar_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.request);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item))
        {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;
        Class fragmentClass = null;
        String title="New Requests";

        switch (menuItem.getItemId()){

            case R.id.nav_profile:
                title="Profile";
                fragmentClass= SalonProfileFragment.class;
                break;
            case R.id.nav_appointment:
                fragmentClass= SalonAppontmentFragment.class;
                //intent = new Intent(NewRequestActivity.this,AppointmentActivity.class);
                title="Appointments";
                //startActivity(intent);
                break;
            case R.id.nav_history:
                fragmentClass = SalonHistoryFragment.class;
                //intent= new Intent(NewRequestActivity.this,HistoryActivity.class);
                //startActivity(intent);
                title= "History";
                break;
            case R.id.nav_setting:
                fragmentClass = SalonSettingFragment.class;
                //intent= new Intent(NewRequestActivity.this,SettingActivity.class);
               // startActivity(intent);
                title="Setting";
                break;

            case  R.id.request:
                title="New Requests";
                fragmentClass= SalonNewRequestFragment.class;
                break;
            case R.id.nav_logout_salon:
                Intent i = new Intent(NewRequestActivity.this,ChooseUserActivity.class);
                startActivity(i);
                break;
          //  case R.id.privacy_policy:
            //case R.id.terms_and_conditions:
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
           FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        menuItem.setChecked(true);
        setTitle(title);
         mdrawerLayout.closeDrawers();
        return true;
    }

}
