package com.example.menuviernes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabmenu;
    ViewPager visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabmenu=findViewById(R.id.menutab);
        visor=findViewById(R.id.visor);

        Adaptador adaptador = new Adaptador(getSupportFragmentManager(),tabmenu.getTabCount());
        visor.setAdapter(adaptador);

        tabmenu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                visor.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2){
                    adaptador.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        visor.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabmenu));

    }
}