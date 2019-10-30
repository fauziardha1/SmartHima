package com.example.smarthima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.smarthima.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.fragmentTabLayout); // inisiasi tabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Tugas").setIcon(R.drawable.ic_tugas)); // menambahkan item di tabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Rapat").setIcon(R.drawable.ic_rapat)); // menambahkan item di tabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Proker").setIcon(R.drawable.ic_proker)); // menambahkan item di tabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Pengajuan").setIcon(R.drawable.ic_pengajuan)); // menambahkan item di tabLayout


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager =(ViewPager)findViewById(R.id.viewPager);
        TabAdapter tabsAdapter = new TabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
