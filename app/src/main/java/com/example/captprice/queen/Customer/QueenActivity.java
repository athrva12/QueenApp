package com.example.captprice.queen.Customer;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.captprice.queen.CustomerFragment.CustomerAppointmentHistory;
import com.example.captprice.queen.CustomerFragment.CustomerFavouriteFragment;
import com.example.captprice.queen.CustomerFragment.CustomerMainActivity;
import com.example.captprice.queen.CustomerFragment.CustomerProfileEditFragment;
import com.example.captprice.queen.CustomerFragment.CustomerProfileFragment;
import com.example.captprice.queen.CustomerFragment.CustomerSettingFragment;
import com.example.captprice.queen.R;
import com.example.captprice.queen.Salon.HistoryActivity;
import com.example.captprice.queen.Salon.NewRequestActivity;
import com.example.captprice.queen.Salon.ProfileActivity;
import com.example.captprice.queen.Salon.SettingActivity;
import com.example.captprice.queen.SalonFragment.SalonNewRequestFragment;
//this Activity is created by athrva

public class QueenActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ActionBarDrawerToggle mtoggle;
    private DrawerLayout mdrawerLayout;
    RelativeLayout relativeLayout;
    TextView toolbaredit;

    android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queen);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        setNavigationViewListner();
//        relativeLayout = (RelativeLayout)findViewById(R.id.layout_afterserch);
//        relativeLayout.setVisibility(View.GONE);
        mdrawerLayout=(DrawerLayout)findViewById(R.id.mdrawable);
//        addbutton=(ImageView)findViewById(R.id.imageview_searchbutton);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerLayout,R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        toolbaredit=(TextView)toolbar.findViewById(R.id.edit);
        toolbaredit.setVisibility(View.GONE);
        toolbaredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                Fragment fragment= null;
                Class fragmentClass =CustomerProfileEditFragment.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
                fragmentManager.beginTransaction().add(R.id.fragment_container_customer,fragment).commit();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentManager fragmentManager =getSupportFragmentManager();
        Fragment fragment= null;
        Class fragmentClass = CustomerMainActivity.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        fragmentManager.beginTransaction().add(R.id.fragment_container_customer,fragment).commit();


//        addbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(QueenActivity.this,SearchActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });

    }

    private void setNavigationViewListner() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navbar_view_customer);
        navigationView.setNavigationItemSelectedListener(this);
    }

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
        String title="Queen";
        switch (menuItem.getItemId()){

            case R.id.nav_profile:
                toolbaredit.setVisibility(View.VISIBLE);
                fragmentClass= CustomerProfileFragment.class;
                title="Profile";
//                Intent intent = new Intent(QueenActivity.this,CustomerProfileActivity.class);
//                startActivity(intent);
                break;
            case R.id.nav_favourites:
                toolbaredit.setVisibility(View.GONE);
                title="Favourite";
                fragmentClass= CustomerFavouriteFragment.class;

                //intent = new Intent(QueenActivity.this,FavouritesActivity.class);
                 //startActivity(intent);
                break;
            case R.id.nav_appointment_history:
                toolbaredit.setVisibility(View.GONE);
                //intent= new Intent(QueenActivity.this,CustomerHistory.class);
               // startActivity(intent);
                title="History";
                  fragmentClass= CustomerAppointmentHistory.class;
                break;
            case R.id.nav_setting:
                toolbaredit.setVisibility(View.GONE);
                   title="Setting";
                //intent= new Intent(QueenActivity.this,SettingActivity.class);
                //startActivity(intent);
                fragmentClass= CustomerSettingFragment.class;
                break;
            case R.id.privacy_policy:
            case R.id.terms_and_conditions:
                }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container_customer,fragment).commit();
        menuItem.setChecked(true);
        setTitle(title);
        mdrawerLayout.closeDrawers();
        return true;
    }

}
