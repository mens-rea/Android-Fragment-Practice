package com.fragment.juanshotman.fragmentpractice;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentStateAdapter fragmentStateAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
