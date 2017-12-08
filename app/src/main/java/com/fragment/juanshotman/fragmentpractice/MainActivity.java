package com.fragment.juanshotman.fragmentpractice;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private FragmentStateAdapter fragmentStateAdapter;
    private ViewPager viewPager;
    private Button homeButton, aboutButton, servicesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeButton = findViewById(R.id.home_button);
        aboutButton = findViewById(R.id.about_button);
        servicesButton = findViewById(R.id.services_button);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setActiveFragment(0);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setActiveFragment(1);
            }
        });

        servicesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setActiveFragment(2);
            }
        });

        fragmentStateAdapter = new FragmentStateAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        FragmentStateAdapter fragmentAdapter = new FragmentStateAdapter(getSupportFragmentManager());
        fragmentAdapter.addFragment(new HomeFragment(), "HomeFragment");
        fragmentAdapter.addFragment(new AboutFragment(), "AboutFragment");
        fragmentAdapter.addFragment(new ServicesFragment(), "ServicesFragment");
        viewPager.setAdapter(fragmentAdapter);
    }

    public void setActiveFragment(int clickedItem){
        viewPager.setCurrentItem(clickedItem);
    }
}
