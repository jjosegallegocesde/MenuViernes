package com.example.menuviernes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adaptador extends FragmentPagerAdapter {

    int opciones;
    public Adaptador(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.opciones=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new FragmentUno();
            case 1:
                return new FragmentDos();

            case 2:
                return new FragmentTres();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return opciones;
    }
}
