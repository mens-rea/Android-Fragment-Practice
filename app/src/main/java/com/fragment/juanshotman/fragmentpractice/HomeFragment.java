package com.fragment.juanshotman.fragmentpractice;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment{

    private Button homeButton, aboutButton, servicesButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        homeButton = view.findViewById(R.id.home_button);
        aboutButton = view.findViewById(R.id.about_button);
        servicesButton = view.findViewById(R.id.services_button);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setActiveFragment(0);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setActiveFragment(1);
            }
        });

        servicesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setActiveFragment(2);
            }
        });

        return view;
    }
}
